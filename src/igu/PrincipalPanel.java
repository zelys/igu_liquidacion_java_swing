package igu;

import logica.Empleado;

import javax.swing.*;
import java.awt.*;

public class PrincipalPanel extends BasePanel {

    private EntradaPanel entrada;
    private BotonPanel botones;
    private InfoPanel descuento;
    private ResumenPanel resumen;
    private JPanel contenedor;

    public PrincipalPanel() {
        setLayout(new GridLayout(1, 2, 40, 0));
    }

    @Override
    protected void inicializarComponentes() {
        entrada = new EntradaPanel();
        botones = new BotonPanel();
        descuento = new InfoPanel();
        resumen = new ResumenPanel();
        contenedor = new JPanel(new BorderLayout(0, 5));
        contenedor.setOpaque(false);

        // Capturar el evento clic de cada botón
        botones.getBtnCalcular().addActionListener(e -> {
            calcularLiquidacion();
        });

        botones.getBtnLimpiar().addActionListener(e -> {
            limpiarCampos();
        });
    }

    @Override
    protected void agregarComponentes() {
        contenedor.add(entrada, BorderLayout.NORTH);
        contenedor.add(botones, BorderLayout.CENTER);
        contenedor.add(descuento, BorderLayout.SOUTH);
        contenedor.add(espacioHorizontal(40), BorderLayout.WEST);
        contenedor.add(espacioHorizontal(40), BorderLayout.EAST);
        add(contenedor);
        add(resumen);
    }

    // Método que ejecuta el botón calcular
    private void calcularLiquidacion() {
        try {
            String nombre = entrada.getNombreField();
            String tipo = entrada.getTipoJBox();
            // Evitar que el usuario deje campos vacios
            if (!nombre.isEmpty() && !tipo.isEmpty()) {

                double sueldo = Double.parseDouble(entrada.getSueldoField());

                Empleado empleado = new Empleado(nombre, tipo, sueldo);

                // Actualizar campos informativos
                descuento.setImpuestoField(empleado.calcularImpuesto());
                descuento.setAfpField(empleado.descuentoAfp());
                descuento.setSaludField(empleado.descuentoSalud());
                descuento.setSueldoLiqField(empleado.sueldoLiquido());
                resumen.actualizarResumen(empleado.resumenEmpleado());

            } else {
                JOptionPane.showMessageDialog(this,
                        "Ingresa todos los datos solicitados.",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this,
                    "Sueldo ingresado no válido.",
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Método que ejecuta el botón limpiar
    private void limpiarCampos() {
        entrada.limpiarEntrada();
        descuento.limpiarInfo();
        resumen.actualizarResumen("");
    }
}

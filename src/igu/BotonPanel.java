package igu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BotonPanel extends BasePanel {

    private JButton btnCalcular, btnLimpiar;
    private ImageIcon icoCalcular, icoLimpiar;
    private final String rutaIcoCalular = "src/igu/img/calculator.png";
    private final String rutaIcoLimpiar = "src/igu/img/eraser.png";

    public BotonPanel() {
        super();
        setLayout(new GridLayout(0, 1, 0,5));
    }

    @Override
    protected void inicializarComponentes() {
        icoCalcular = new ImageIcon(rutaIcoCalular);
        icoLimpiar = new ImageIcon(rutaIcoLimpiar);
        btnCalcular = new JButton("CALCULAR", icoCalcular);
        btnLimpiar = new JButton("LIMPIAR", icoLimpiar);
        // Configurar fuente
        Fuente font = new Fuente();
        btnCalcular.setFont(font.cargarFuenteBold(16));
        btnLimpiar.setFont(font.cargarFuenteBold(16));
    }

    @Override
    protected void agregarComponentes() {
        add(btnCalcular);
        add(btnLimpiar);
        add(espacioVertical(0));
    }

    // Getters de los botones
    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public JButton getBtnLimpiar() {
        return btnLimpiar;
    }
}

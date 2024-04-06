package igu;

import javax.swing.*;
import java.awt.GridLayout;

public class InfoPanel extends BasePanel {

    private JLabel impuestoLabel, afpLabel, saludLabel, sueldoLiqLabel;
    private JTextField impuestoField;
    private JTextField afpField;
    private JTextField saludField;
    private JTextField sueldoLiqField;

    public InfoPanel() {
        super();
        setLayout(new GridLayout(0, 2, 10, 0));
    }

    @Override
    protected void inicializarComponentes() {
        impuestoLabel = new JLabel("IMPUESTO",SwingConstants.RIGHT);
        afpLabel = new JLabel("AFP",SwingConstants.RIGHT);
        saludLabel = new JLabel("SALUD",SwingConstants.RIGHT);
        sueldoLiqLabel = new JLabel("SUELDO LIQUIDO",SwingConstants.RIGHT);
        impuestoField = new JTextField(12);
        afpField = new JTextField(12);
        saludField = new JTextField(12);
        sueldoLiqField = new JTextField(12);
        // Configurar fuente
        Fuente font = new Fuente();
        impuestoLabel.setFont(font.cargarFuenteBold(12));
        afpLabel.setFont(font.cargarFuenteBold(12));
        saludLabel.setFont(font.cargarFuenteBold(12));
        sueldoLiqLabel.setFont(font.cargarFuenteBold(12));
        // Campos no editables
        impuestoField.setEditable(false);
        afpField.setEditable(false);
        saludField.setEditable(false);
        sueldoLiqField.setEditable(false);
    }

    @Override
    protected void agregarComponentes() {
        add(impuestoLabel);
        add(impuestoField);
        add(afpLabel);
        add(afpField);
        add(saludLabel);
        add(saludField);
        add(sueldoLiqLabel);
        add(sueldoLiqField);
    }

    // Setters
    public void setImpuestoField(double impuesto) {
        impuestoField.setText(String.valueOf(impuesto));
    }

    public void setAfpField(double afp) {
        afpField.setText(String.valueOf(afp));
    }

    public void setSaludField(double salud) {
        saludField.setText(String.valueOf(salud));
    }

    public void setSueldoLiqField(double sueldoLiquido) {
        sueldoLiqField.setText(String.valueOf(sueldoLiquido));
    }

    public void limpiarInfo() {
        impuestoField.setText("");
        afpField.setText("");
        saludField.setText("");
        sueldoLiqField.setText("");
    }
}

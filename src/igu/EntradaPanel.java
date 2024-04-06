package igu;
import java.awt.GridLayout;
import javax.swing.*;

public class EntradaPanel extends BasePanel {

    private JLabel nombreLabel, sueldoLabel, tipoLabel;
    private JTextField nombreField, sueldoField;
    private JComboBox<String> tipoJBox;

    public EntradaPanel() {
        super();
        setLayout(new GridLayout(0, 2, 10, 0));
    }
    
    @Override
    protected void inicializarComponentes() {
        nombreLabel = new JLabel("NOMBRE", SwingConstants.RIGHT);
        sueldoLabel = new JLabel("SUELDO", SwingConstants.RIGHT);
        tipoLabel = new JLabel("TIPO EMPLEADO", SwingConstants.RIGHT);
        nombreField = new JTextField(12);
        sueldoField = new JTextField(12);
        tipoJBox = new JComboBox<>();
        tipoJBox.addItem("");
        tipoJBox.addItem("Junior");
        tipoJBox.addItem("Master");
        tipoJBox.addItem("Senior");
        // Configurar fuente
        Fuente font = new Fuente();
        nombreLabel.setFont(font.cargarFuenteBold(14));
        sueldoLabel.setFont(font.cargarFuenteBold(14));
        tipoLabel.setFont(font.cargarFuenteBold(14));
        nombreField.setFont(font.cargarFuenteRegular(14));
        sueldoField.setFont(font.cargarFuenteRegular(14));
        tipoJBox.setFont(font.cargarFuenteBold(14));
    }

    @Override
    protected void agregarComponentes() {
        add(nombreLabel);
        add(nombreField);
        add(sueldoLabel);
        add(sueldoField);
        add(tipoLabel);
        add(tipoJBox);
    }

    // Getters de los datos de entrada
    public String getNombreField() {
        return nombreField.getText();
    }

    public String getSueldoField() {
        return sueldoField.getText();
    }

    public String getTipoJBox() {
        return (String) tipoJBox.getSelectedItem();
    }

    // Método para limpiar los campos d entrada
    public void limpiarEntrada() {
        nombreField.setText("");
        sueldoField.setText("");
        tipoJBox.getItemAt(0);
    }

}

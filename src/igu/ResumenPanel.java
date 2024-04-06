package igu;

import java.awt.*;
import javax.swing.*;

public class ResumenPanel extends BasePanel {

    private JLabel resumenLabel;
    private JTextArea resumenArea;
    private JPanel contenedorResumen, contenedorArea;
    private JScrollPane scrollPane;
    
    public ResumenPanel() {
        super();
    }

    @Override
    protected void inicializarComponentes() {
        resumenLabel = new JLabel("RESUMEN");
        resumenArea = new JTextArea(13,22);
        // Configurar fuente
        Fuente font = new Fuente();
        resumenLabel.setFont(font.cargarFuenteBold(14));
        resumenArea.setFont(font.cargarFuenteRegular(14));
        resumenArea.setEditable(false);
        // JScrollPane para agregar el JTextArea
        scrollPane = new JScrollPane(resumenArea);
        // Contenedores para ubicar los componentes
        contenedorResumen = new JPanel(new BorderLayout(0, 10));
        contenedorArea = new JPanel(new BorderLayout());
        crearMargenArea(contenedorArea);
        contenedorResumen.setOpaque(false);
        contenedorArea.setOpaque(false);
    }

    @Override
    protected void agregarComponentes() {
        contenedorArea.add(scrollPane, BorderLayout.CENTER);
        contenedorResumen.add(resumenLabel, BorderLayout.NORTH);
        contenedorResumen.add(contenedorArea, BorderLayout.CENTER);
        contenedorResumen.add(espacioHorizontal(40), BorderLayout.EAST);
        add(contenedorResumen);
    }

    private void crearMargenArea(JPanel panel) {
        panel.setOpaque(false);
        panel.setBorder(BorderFactory.createLineBorder(Color.CYAN, 1));
        panel.add(espacioVertical(10), BorderLayout.NORTH);
        panel.add(espacioHorizontal(10), BorderLayout.WEST);
        panel.add(espacioHorizontal(10), BorderLayout.EAST);
        panel.add(espacioVertical(10), BorderLayout.SOUTH);
    }

    public void actualizarResumen(String resumen) {
        resumenArea.setText(resumen);
    }
}

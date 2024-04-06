package igu;

import javax.swing.*;
import java.awt.BorderLayout;

public class TituloPanel extends BasePanel {

    private JPanel tituloPanel;
    private JLabel tituloLabel;

    public TituloPanel() {
        super();
    }

    @Override
    protected void inicializarComponentes() {
        tituloPanel = new JPanel(new BorderLayout());
        tituloLabel = new JLabel("L I Q U I D A C I Ó N    D E    S U E L D O",
                SwingConstants.CENTER);
        // Configurar fuente
        Fuente font = new Fuente();
        tituloLabel.setFont(font.cargarFuenteBold(24));
    }

    @Override
    protected void agregarComponentes() {
        tituloPanel.add(tituloLabel, BorderLayout.CENTER);
        tituloPanel.add(espacioVertical(40), BorderLayout.NORTH);
        tituloPanel.add(espacioVertical(40), BorderLayout.SOUTH);
        tituloPanel.setOpaque(false);
        add(tituloPanel);
    }
}

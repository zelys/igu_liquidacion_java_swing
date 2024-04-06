package igu;

import java.awt.*;
import javax.swing.*;

public class FondoPanel extends JPanel {

    private final String rutaImagen = "src/igu/img/bg-blue.jpg";
    private ImageIcon imagenIco;
    private Image imagen;

    public FondoPanel() {
        setLayout(new BorderLayout());
        imagenIco = new ImageIcon(rutaImagen);
        imagen = imagenIco.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagen != null) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
        }
    }
}
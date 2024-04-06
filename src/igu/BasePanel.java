package igu;

import java.awt.*;
import javax.swing.*;

public abstract class BasePanel extends JPanel {

    public BasePanel() {
        // Opacidad del panel
        setOpaque(false);
        inicializarComponentes();
        agregarComponentes();
    }
    protected abstract void inicializarComponentes();
    protected abstract void agregarComponentes();
    
    // Espacio para relleno vertical y horizontal
    protected static Component espacioVertical(int size) {
        return Box.createVerticalStrut(size);
    }
    protected static Component espacioHorizontal(int size) {
        return Box.createHorizontalStrut(size);
    }
}

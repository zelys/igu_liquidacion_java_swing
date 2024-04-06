package igu;

import java.awt.*;
import javax.swing.*;

public class IguLiquidacion extends JFrame {

    private FondoPanel fondo;
    private TituloPanel titulo;
    private PrincipalPanel principal;

    public IguLiquidacion() {
        setTitle("Liquidación de sueldo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        setLocationRelativeTo(null);
        pack();
        componenetesIgu();
        agregarComponentesIgu();
    }

    public void componenetesIgu() {
        fondo = new FondoPanel();
        titulo = new TituloPanel();
        principal = new PrincipalPanel();
    }

    public void agregarComponentesIgu() {
        fondo.add(titulo, BorderLayout.NORTH);
        fondo.add(principal, BorderLayout.CENTER);
        fondo.add(BasePanel.espacioVertical(40), BorderLayout.SOUTH);
        fondo.add(BasePanel.espacioVertical(40), BorderLayout.WEST);
        fondo.add(BasePanel.espacioVertical(40), BorderLayout.EAST);
        add(fondo);
        pack();
    }
}

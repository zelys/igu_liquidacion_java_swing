import javax.swing.*;
import igu.IguLiquidacion;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new IguLiquidacion());
    }
}
package igu;

import java.awt.*;
import java.io.File;
import java.io.IOException;

public class Fuente {
    private final String rutaRegular = "src/igu/font/Inter-Regular.ttf";
    private final String rutaBold = "src/igu/font/Inter-Bold.ttf";

    public Fuente() {
    }

    // Método para cargar una fuente desde un archivo TTF
    private Font cargarFuente(String rutaArchivo, int estilo, int size) {
        Font font = null;
        try {
            File archivoFuente = new File(rutaArchivo);
            font = Font.createFont(Font.TRUETYPE_FONT, archivoFuente).deriveFont(estilo, size);
        } catch (IOException | FontFormatException e) {
            // Si hay un error, usar una fuente predeterminada y mostrar un mensaje de advertencia
            System.err.println("Error al cargar la fuente: " + e.getMessage());
            font = new Font("Arial", estilo, size);
        }
        return font;
    }

    // Métodos para establecer fuente 
    public Font cargarFuenteRegular(int size) {
        return cargarFuente(rutaRegular, Font.PLAIN, size);
    }

    public Font cargarFuenteBold(int size) {
        return cargarFuente(rutaBold, Font.BOLD, size);
    }
}

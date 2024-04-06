package logica;

public class Empleado {

    private String nombre, tipo;
    private double sueldoBruto;

    // Constructor
    public Empleado() {
    }

    public Empleado(String nombre, String tipo, double sueldoBruto) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.sueldoBruto = sueldoBruto;
    }

    // Métodos

    public double calcularImpuesto() {

        if (sueldoBruto > 50000) {
            return valorRound(sueldoBruto * 0.35);
        } else if (sueldoBruto <= 50000 && sueldoBruto > 30000) {
            return valorRound(sueldoBruto * 0.20);
        } else if (sueldoBruto <= 30000 && sueldoBruto >= 10000) {
            return valorRound(sueldoBruto * 0.10);
        } else {
            return 0;
        }
    }

    // método descuento afp
    public double descuentoAfp() {
        return valorRound(sueldoBruto * 0.11);
    }

    // método descuento salud
    public double descuentoSalud() {
        return valorRound(sueldoBruto * 0.07);
    }

    // método para obtener el sueldo liquido
    public double sueldoLiquido() {
        return valorRound(sueldoBruto - calcularImpuesto() - descuentoAfp() - descuentoSalud());
    }

    // método para redondear el valor de salida
    public double valorRound(double valor) {
        return Math.round(valor * 10) / 10d;
    }

    // Método para mostrar el resumen
    public String resumenEmpleado() {
        return "NOMBRE: " + nombre
                + "\nCARGO: " + tipo
                + "\nSUELDO BRUTO: $" + sueldoBruto
                + "\n------------------------------------\n"
                + "DESCUENTOS:"
                + "\n------------------------------------\n"
                + "IMPUESTO: $"
                + calcularImpuesto()
                + "\nAFP: $" + descuentoAfp()
                + "\nSALUD: $" + descuentoSalud()
                + "\n------------------------------------\n"
                + "LIQUIDO A PAGAR:"
                + "\n------------------------------------"
                + "\n$" + sueldoLiquido();
    }
}


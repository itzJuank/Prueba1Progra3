package prueba1.entidades;

public abstract class Documento {
    private final String codigo;
    private final double subtotal;

    public Documento(String codigo, double subtotal) {
        this.codigo = codigo;
        this.subtotal = subtotal;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public abstract double calcularTotal();
}

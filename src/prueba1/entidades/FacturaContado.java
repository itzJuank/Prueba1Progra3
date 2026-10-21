package prueba1.entidades;

public class FacturaContado extends Documento {
    public FacturaContado(String codigo, double subtotal) {
        super(codigo, subtotal);
    }

    @Override
    public double calcularTotal() {
        return getSubtotal() * 1.13 * 0.95;
    }
}

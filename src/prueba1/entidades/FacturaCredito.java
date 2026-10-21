package prueba1.entidades;

public class FacturaCredito extends Documento {
    public FacturaCredito(String codigo, double subtotal) {
        super(codigo, subtotal);
    }

    @Override
    public double calcularTotal() {
        return getSubtotal() * 1.13 * 1.02;
    }
}

package prueba1.entidades;

public class NotaCredito extends Documento {
    public NotaCredito(String codigo, double subtotal) {
        super(codigo, subtotal);
    }

    @Override
    public double calcularTotal() {
        return -getSubtotal() * 1.13;
    }
}

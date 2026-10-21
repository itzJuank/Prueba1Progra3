package prueba1;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import prueba1.entidades.FacturaContado;
import prueba1.entidades.NotaCredito;

public class DocumentoTest {
    @Test
    public void contadoConSubtotal10000Da10735() {

        FacturaContado contado = new FacturaContado("FC-001", 10000);

        double resultado = contado.calcularTotal();

        assertEquals(10735.00, resultado, 0.01);
    }

    @Test
    public void notaConSubtotal10000DaMenos11300() {

        NotaCredito nota = new NotaCredito("NC-001", 10000);

        double resultado = nota.calcularTotal();

        assertEquals(-11300.00, resultado, 0.01);
    }
}

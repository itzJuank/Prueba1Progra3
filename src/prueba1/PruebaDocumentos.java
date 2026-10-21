package prueba1;

import java.util.Locale;
import prueba1.entidades.Documento;
import prueba1.entidades.FacturaContado;
import prueba1.entidades.FacturaCredito;
import prueba1.entidades.NotaCredito;

public class PruebaDocumentos {
    public static void main(String[] args) {
        Documento[] documentos = {
            new FacturaContado("Contado", 10000),
            new FacturaCredito("Credito", 10000),
            new NotaCredito("Nota", 10000)
        };

        double cierre = 0;
        for (Documento documento : documentos) {
            double total = documento.calcularTotal();
            System.out.printf(Locale.US, "%s: %.2f%n", documento.getCodigo(), total);
            cierre += total;
        }

        System.out.printf(Locale.US, "Cierre: %.2f%n", cierre);
    }
}

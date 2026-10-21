package prueba1;

import prueba1.estructuras.HistorialDocumento;

public class PruebaHistorial {
    public static void main(String[] args) {
        HistorialDocumento historial = new HistorialDocumento();

        historial.registrar("EMITIDO");
        historial.registrar("ENVIADO");
        historial.registrar("RECIBIDO");

        System.out.println(historial.contar());           // 3
        System.out.println(historial.getEstadoActual());  // RECIBIDO
        System.out.println(historial.eliminarPrimero());  // EMITIDO
        System.out.println(historial.contar());           // 2
        System.out.println(historial.eliminarPrimero());  // ENVIADO
        System.out.println(historial.getEstadoActual());  // RECIBIDO
    }
}

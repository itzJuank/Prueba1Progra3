package prueba1.estructuras;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class HistorialDocumentoTest {
    @Test
    public void historialNuevoEstaVacio() {
        HistorialDocumento historial = new HistorialDocumento();

        assertEquals(0, historial.contar());
        assertEquals("SIN ESTADO", historial.getEstadoActual());
        assertNull(historial.eliminarPrimero());
    }

    @Test
    public void registrarAgregaAlFinalYEliminarRetiraEnOrden() {
        HistorialDocumento historial = new HistorialDocumento();
        historial.registrar("EMITIDO");
        historial.registrar("PENDIENTE_ENVIO");
        historial.registrar("ENVIADO");

        assertEquals(3, historial.contar());
        assertEquals("ENVIADO", historial.getEstadoActual());
        assertEquals("EMITIDO", historial.eliminarPrimero());
        assertEquals(2, historial.contar());
        assertEquals("ENVIADO", historial.getEstadoActual());
        assertEquals("PENDIENTE_ENVIO", historial.eliminarPrimero());
        assertEquals("ENVIADO", historial.eliminarPrimero());
        assertEquals(0, historial.contar());
        assertEquals("SIN ESTADO", historial.getEstadoActual());
        assertNull(historial.eliminarPrimero());
    }

    @Test
    public void contarNoModificaLaCabezaNiLosEnlaces() {
        HistorialDocumento historial = new HistorialDocumento();
        historial.registrar("EMITIDO");
        historial.registrar("ENVIADO");

        assertEquals(2, historial.contar());
        assertEquals(2, historial.contar());
        assertEquals("EMITIDO", historial.eliminarPrimero());
        assertEquals("ENVIADO", historial.eliminarPrimero());
    }

    @Test
    public void permiteRegistrarDespuesDeVaciarElHistorial() {
        HistorialDocumento historial = new HistorialDocumento();
        historial.registrar("EMITIDO");
        assertEquals("EMITIDO", historial.eliminarPrimero());

        historial.registrar("PENDIENTE_ENVIO");
        historial.registrar("ENVIADO");

        assertEquals(2, historial.contar());
        assertEquals("ENVIADO", historial.getEstadoActual());
        assertEquals("PENDIENTE_ENVIO", historial.eliminarPrimero());
        assertEquals("ENVIADO", historial.eliminarPrimero());
        assertNull(historial.eliminarPrimero());
    }
}

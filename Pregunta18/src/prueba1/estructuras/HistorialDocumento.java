package prueba1.estructuras;

public class HistorialDocumento {
    private NodoEstado cabeza;

    public void registrar(String estado) {
        NodoEstado nuevo = new NodoEstado(estado);

        if (cabeza == null) {
            cabeza = nuevo;
            return;
        }

        NodoEstado actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }

        actual.setSiguiente(nuevo);
    }

    public int contar() {
        int cantidad = 0;
        NodoEstado actual = cabeza;

        while (actual != null) {
            cantidad++;
            actual = actual.getSiguiente();
        }

        return cantidad;
    }

    public String getEstadoActual() {
        if (cabeza == null) {
            return "SIN ESTADO";
        }

        NodoEstado actual = cabeza;
        while (actual.getSiguiente() != null) {
            actual = actual.getSiguiente();
        }

        return actual.getEstado();
    }

    public String eliminarPrimero() {
        if (cabeza == null) {
            return null;
        }

        String estadoEliminado = cabeza.getEstado();
        cabeza = cabeza.getSiguiente();

        return estadoEliminado;
    }
}
package prueba1.estructuras;

public class NodoEstado {
    private final String estado;
    private NodoEstado siguiente;

    public NodoEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    public NodoEstado getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoEstado siguiente) {
        this.siguiente = siguiente;
    }
}

package observer;

public interface Observable {
    void agregarObservador(Observador observador);
    void notificar(String mensaje);
}
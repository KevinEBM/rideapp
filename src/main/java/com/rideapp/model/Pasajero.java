package model;

import observer.Observador;

public class Pasajero implements Observador {

    private String nombre;

    public Pasajero(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("[Observer] Pasajero " + nombre + ": " + mensaje);
    }

    public String getNombre() {
        return nombre;
    }
}
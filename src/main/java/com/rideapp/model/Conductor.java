package model;

import observer.Observador;

public class Conductor implements Observador {

    private String nombre;

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("[Observer] Conductor " + nombre + ": " + mensaje);
    }
}
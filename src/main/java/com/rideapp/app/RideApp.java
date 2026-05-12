package com.rideapp.app;

public class RideApp {

    private static RideApp instancia;

    private RideApp() {
    }

    public static RideApp getInstance() {
        if (instancia == null) {
            instancia = new RideApp();
        }
        return instancia;
    }

    public void recibirSolicitud() {
        System.out.println("[RideApp] Solicitud recibida");
    }

    public void mostrarInstanciaUnica() {
        System.out.println("[RideApp] Instancia central activa");
    }
}

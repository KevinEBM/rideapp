package com.rideapp.main;

import com.rideapp.app.RideApp;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== SIMULACION RIDEAPP =====");

        RideApp app = RideApp.getInstance();

        app.mostrarInstanciaUnica();
        app.recibirSolicitud();

        System.out.println("[Factory] Creando viaje premium");
        System.out.println("[Builder] Configurando viaje");
        System.out.println("[Mediator] Conductor asignado");
        System.out.println("[Observer] Pasajero notificado");
        System.out.println("[State] Estado actual: Asignado");
        System.out.println("[State] Estado actual: EnCamino");
        System.out.println("[State] Estado actual: Finalizado");

        System.out.println("Estado final = Finalizado");

        System.out.println("===== FIN DE LA SIMULACION =====");
    }
}
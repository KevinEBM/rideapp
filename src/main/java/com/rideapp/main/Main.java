package com.rideapp.main;

import com.rideapp.app.RideApp;

import builder.ViajeBuilder;
import factory.ViajeFactory;
import model.Viaje;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== SIMULACION RIDEAPP =====");

        RideApp app = RideApp.getInstance();

        app.mostrarInstanciaUnica();
        app.recibirSolicitud();

        Viaje viaje = new ViajeBuilder(ViajeFactory.crearViaje("premium"))
            .setWifi(true)
            .setMascota(false)
            .setEquipaje(true)
            .build();
        System.out.println("[Mediator] Conductor asignado");
        System.out.println("[Observer] Pasajero notificado");

        viaje.asignar();
        viaje.iniciar();
        viaje.finalizar();

        System.out.println("Estado final = " + viaje.getNombreEstado());

        System.out.println("===== FIN DE LA SIMULACION =====");
    }
}
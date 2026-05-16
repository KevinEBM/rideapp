package com.rideapp.main;

import com.rideapp.app.RideApp;

import builder.ViajeBuilder;
import factory.ViajeFactory;
import mediator.CentralViajesMediator;
import model.Conductor;
import model.Pasajero;
import model.Viaje;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== SIMULACION RIDEAPP =====");

        RideApp app = RideApp.getInstance();

        app.mostrarInstanciaUnica();
        app.recibirSolicitud();

        // Crear participantes
        Pasajero pasajero = new Pasajero("Alice");
        Conductor conductor = new Conductor("Bob");

        // Configurar mediator y registrar conductor
        CentralViajesMediator mediator = new CentralViajesMediator();
        mediator.registrarConductor(conductor);

        // Crear viaje mediante Factory + Builder
        Viaje viaje = new ViajeBuilder(ViajeFactory.crearViaje("premium"))
            .setWifi(true)
            .setMascota(false)
            .setEquipaje(true)
            .build();

        // Solicitar viaje a través del mediator
        mediator.solicitarViaje(pasajero, viaje);

        // Continuar flujo de estado
        viaje.iniciar();
        viaje.finalizar();

        System.out.println("Estado final = " + viaje.getNombreEstado());

        System.out.println("===== FIN DE LA SIMULACION =====");
    }
}
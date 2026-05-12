package factory;

import model.*;

public class ViajeFactory {

    public static Viaje crearViaje(String tipo) {

        switch(tipo.toLowerCase()) {

            case "premium":
                System.out.println("[Factory] Creando viaje premium");
                return new ViajePremium();

            case "economico":
                System.out.println("[Factory] Creando viaje economico");
                return new ViajeEconomico();

            case "moto":
                System.out.println("[Factory] Creando viaje moto");
                return new ViajeMoto();

            case "compartido":
                System.out.println("[Factory] Creando viaje compartido");
                return new ViajeCompartido();

            default:
                return null;
        }
    }
}
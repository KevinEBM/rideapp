package builder;

import model.Viaje;

public class ViajeBuilder {

    private Viaje viaje;

    public ViajeBuilder(Viaje viaje) {
        this.viaje = viaje;
    }

    public ViajeBuilder setWifi(boolean wifi) {
        viaje.setWifi(wifi);
        return this;
    }

    public ViajeBuilder setMascota(boolean mascota) {
        viaje.setMascota(mascota);
        return this;
    }

    public ViajeBuilder setEquipaje(boolean equipaje) {
        viaje.setEquipaje(equipaje);
        return this;
    }

    public Viaje build() {
        System.out.println("[Builder] Configurando viaje");
        return viaje;
    }
}



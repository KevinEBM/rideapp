package mediator;

import model.Conductor;
import model.Pasajero;
import model.Viaje;

public interface Mediator {

	void registrarPasajero(Pasajero p);

	void registrarConductor(Conductor c);

	Conductor asignarConductor(Viaje viaje, Pasajero pasajero);

	void solicitarViaje(Pasajero pasajero, Viaje viaje);

}


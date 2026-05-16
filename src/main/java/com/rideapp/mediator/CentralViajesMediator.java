package mediator;

import model.Conductor;
import model.Pasajero;
import model.Viaje;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CentralViajesMediator implements Mediator {

	private List<Conductor> conductores = new ArrayList<>();
	private List<Pasajero> pasajeros = new ArrayList<>();
	private Map<Viaje, Conductor> asignaciones = new HashMap<>();

	@Override
	public void registrarPasajero(Pasajero p) {
		if (!pasajeros.contains(p)) pasajeros.add(p);
	}

	@Override
	public void registrarConductor(Conductor c) {
		if (!conductores.contains(c)) conductores.add(c);
	}

	@Override
	public Conductor asignarConductor(Viaje viaje, Pasajero pasajero) {
		for (Conductor c : conductores) {
			if (!asignaciones.containsValue(c)) {
				asignaciones.put(viaje, c);
				return c;
			}
		}
		return null;
	}

	@Override
	public void solicitarViaje(Pasajero pasajero, Viaje viaje) {
		System.out.println("[Mediator] Solicitud recibida en central");
		registrarPasajero(pasajero);

		Conductor asignado = asignarConductor(viaje, pasajero);

		if (asignado != null) {
			viaje.agregarObservador(pasajero);
			viaje.agregarObservador(asignado);
			System.out.println("[Mediator] Conductor asignado: " + asignado.getNombre());
			viaje.notificar("Conductor asignado: " + asignado.getNombre());
			viaje.asignar();
		} else {
			System.out.println("[Mediator] No hay conductores disponibles");
			viaje.notificar("No hay conductores disponibles");
		}
	}

}

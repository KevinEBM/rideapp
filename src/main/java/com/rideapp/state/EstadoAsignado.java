package state;

import model.Viaje;

public class EstadoAsignado implements EstadoViaje {

	@Override
	public void solicitar(Viaje viaje) {
		System.out.println("[State] No se puede solicitar un viaje en estado Asignado");
	}

	@Override
	public void asignar(Viaje viaje) {
		System.out.println("[State] El viaje ya se encuentra en estado Asignado");
	}

	@Override
	public void iniciar(Viaje viaje) {
		viaje.setEstado(new EstadoEnCamino());
	}

	@Override
	public void finalizar(Viaje viaje) {
		System.out.println("[State] No se puede finalizar un viaje en estado Asignado");
	}

	@Override
	public void cancelar(Viaje viaje) {
		viaje.setEstado(new EstadoCancelado());
	}

	@Override
	public String getNombreEstado() {
		return "Asignado";
	}
}

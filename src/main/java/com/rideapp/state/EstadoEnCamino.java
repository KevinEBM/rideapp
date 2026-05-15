package state;

import model.Viaje;

public class EstadoEnCamino implements EstadoViaje {

	@Override
	public void solicitar(Viaje viaje) {
		System.out.println("[State] No se puede solicitar un viaje en estado EnCamino");
	}

	@Override
	public void asignar(Viaje viaje) {
		System.out.println("[State] No se puede asignar un viaje en estado EnCamino");
	}

	@Override
	public void iniciar(Viaje viaje) {
		System.out.println("[State] El viaje ya se encuentra en estado EnCamino");
	}

	@Override
	public void finalizar(Viaje viaje) {
		viaje.setEstado(new EstadoFinalizado());
	}

	@Override
	public void cancelar(Viaje viaje) {
		System.out.println("[State] No se puede cancelar un viaje en estado EnCamino");
	}

	@Override
	public String getNombreEstado() {
		return "EnCamino";
	}
}

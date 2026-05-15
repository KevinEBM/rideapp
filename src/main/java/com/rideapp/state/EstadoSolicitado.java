package state;

import model.Viaje;

public class EstadoSolicitado implements EstadoViaje {

	@Override
	public void solicitar(Viaje viaje) {
		System.out.println("[State] El viaje ya se encuentra en estado Solicitado");
	}

	@Override
	public void asignar(Viaje viaje) {
		viaje.setEstado(new EstadoAsignado());
	}

	@Override
	public void iniciar(Viaje viaje) {
		System.out.println("[State] No se puede iniciar un viaje en estado Solicitado");
	}

	@Override
	public void finalizar(Viaje viaje) {
		System.out.println("[State] No se puede finalizar un viaje en estado Solicitado");
	}

	@Override
	public void cancelar(Viaje viaje) {
		viaje.setEstado(new EstadoCancelado());
	}

	@Override
	public String getNombreEstado() {
		return "Solicitado";
	}
}

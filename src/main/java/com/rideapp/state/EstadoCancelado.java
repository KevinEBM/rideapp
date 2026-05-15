package state;

import model.Viaje;

public class EstadoCancelado implements EstadoViaje {

	@Override
	public void solicitar(Viaje viaje) {
		System.out.println("[State] No se puede solicitar un viaje en estado Cancelado");
	}

	@Override
	public void asignar(Viaje viaje) {
		System.out.println("[State] No se puede asignar un viaje en estado Cancelado");
	}

	@Override
	public void iniciar(Viaje viaje) {
		System.out.println("[State] No se puede iniciar un viaje en estado Cancelado");
	}

	@Override
	public void finalizar(Viaje viaje) {
		System.out.println("[State] No se puede finalizar un viaje en estado Cancelado");
	}

	@Override
	public void cancelar(Viaje viaje) {
		System.out.println("[State] El viaje ya se encuentra en estado Cancelado");
	}

	@Override
	public String getNombreEstado() {
		return "Cancelado";
	}
}

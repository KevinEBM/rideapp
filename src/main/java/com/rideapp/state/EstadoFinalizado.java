package state;

import model.Viaje;

public class EstadoFinalizado implements EstadoViaje {

	@Override
	public void solicitar(Viaje viaje) {
		System.out.println("[State] No se puede solicitar un viaje en estado Finalizado");
	}

	@Override
	public void asignar(Viaje viaje) {
		System.out.println("[State] No se puede asignar un viaje en estado Finalizado");
	}

	@Override
	public void iniciar(Viaje viaje) {
		System.out.println("[State] No se puede iniciar un viaje en estado Finalizado");
	}

	@Override
	public void finalizar(Viaje viaje) {
		System.out.println("[State] El viaje ya se encuentra en estado Finalizado");
	}

	@Override
	public void cancelar(Viaje viaje) {
		System.out.println("[State] No se puede cancelar un viaje en estado Finalizado");
	}

	@Override
	public String getNombreEstado() {
		return "Finalizado";
	}
}


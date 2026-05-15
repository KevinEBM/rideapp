package state;

import model.Viaje;

public interface EstadoViaje {
	void solicitar(Viaje viaje);
	void asignar(Viaje viaje);
	void iniciar(Viaje viaje);
	void finalizar(Viaje viaje);
	void cancelar(Viaje viaje);

	String getNombreEstado();
}

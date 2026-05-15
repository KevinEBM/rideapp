package observer;

public class ConsolaObserver implements Observador {

	@Override
	public void actualizar(String mensaje) {
		System.out.println("[Observer] " + mensaje);
	}
}


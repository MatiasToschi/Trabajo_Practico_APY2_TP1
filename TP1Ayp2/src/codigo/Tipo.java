package codigo;

public abstract class Tipo {

	protected enum listadoDeTipos {
		AGUA, FUEGO, TIERRA, AIRE
	}

	protected static double porcentajeDePlus = 0.2;

	public Tipo() {
	}

	public abstract double calcularVentajaDesventaja(Tipo tipo,
			double valorDeAtaque);
	
	public abstract listadoDeTipos getTipo();
}

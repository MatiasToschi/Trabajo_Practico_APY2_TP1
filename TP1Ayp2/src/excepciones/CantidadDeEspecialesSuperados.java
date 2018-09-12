package excepciones;

public class CantidadDeEspecialesSuperados extends Exception {

	public CantidadDeEspecialesSuperados() {
		super("Ya has utilizado todos los ataques especiales");
	}

}

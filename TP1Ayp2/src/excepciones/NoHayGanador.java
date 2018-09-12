package excepciones;

public class NoHayGanador extends Exception {

	public NoHayGanador(){
		super("Aun no hay ganador definido");
	}
	
}

package excepciones;

public class MonstruoFueraDeCombate extends Exception {

	public MonstruoFueraDeCombate() {
		super("Monstruo ya no puede combatir");
	}
}

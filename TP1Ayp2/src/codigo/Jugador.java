package codigo;

import excepciones.CantidadDeEspecialesSuperados;
import excepciones.MonstruoFueraDeCombate;
import excepciones.NoHayTipoSecundario;

public class Jugador {

	private String nombreJugador;
	private Monstruo monstruo;

	public Jugador(String nombreJugador, Monstruo monstruo) {
		this.nombreJugador = nombreJugador;
		this.monstruo = monstruo;
	}

	public void atacar(boolean esSecundario, boolean esFuerte, Jugador oponente)
			throws CantidadDeEspecialesSuperados, NoHayTipoSecundario {
		try{
		monstruo.atacar(esSecundario, esFuerte, oponente);
		} catch (MonstruoFueraDeCombate e){
			System.out.println(e.getMessage());
		}
	}
	
	public String getNombre(){
		return nombreJugador;
	}

	public Monstruo getMonstruo() {
		return monstruo;
	}

}

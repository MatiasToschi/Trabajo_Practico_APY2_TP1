package codigo;

import excepciones.*;

public class LuchaDeMonstruos {

	private Jugador jugadorUno;
	private Jugador jugadorDos;
	private int turno;
	private boolean jugadorDosAtaca;

	public LuchaDeMonstruos(Jugador jugadorUno, Jugador jugadorDos) {

		this.jugadorUno = jugadorUno;
		this.jugadorDos = jugadorDos;
		turno = 0;

	}
	
	public Jugador getJugadorUno() {
		return jugadorUno;
	}

	public Jugador getJugadorDos() {
		return jugadorDos;
	}

	public void atacar(boolean esSecundario, boolean esFuerte)
			throws CantidadDeEspecialesSuperados, NoHayTipoSecundario {
		getJugadorActual().atacar(esSecundario, esFuerte,
				getJugadorOponenteActual());
		jugadorDosAtaca = !jugadorDosAtaca;
		turno++;
	}

	public boolean hayGanador() {
		return (jugadorUno.getMonstruo().getPuntosDeVida() <= 0 || jugadorDos
				.getMonstruo().getPuntosDeVida() <= 0);
	}

	public Jugador getGanador() throws NoHayGanador {
		if (jugadorUno.getMonstruo().getPuntosDeVida() <= 0) {
			return jugadorDos;
		} else if (jugadorDos.getMonstruo().getPuntosDeVida() <= 0) {
			return jugadorUno;
		}
		throw new NoHayGanador();
	}

	public Jugador getJugadorActual() {
		if (!jugadorDosAtaca) {
			return jugadorUno;
		} else {
			return jugadorDos;
		}
	}

	public Jugador getJugadorOponenteActual() {
		if (!jugadorDosAtaca) {
			return jugadorDos;
		} else {
			return jugadorUno;
		}
	}
	
	public int getTurno(){
		return turno/2;
	}

}

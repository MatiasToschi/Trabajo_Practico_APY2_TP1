package pruebasUnitarias;

import org.junit.*;
import codigo.*;

public class TestDeLuchaDeMonstruos {

	public LuchaDeMonstruos pokemon;
	public Jugador jugadorUno, jugadorDos;
	public Monstruo monstruoUno, monstruoDos;

	@Before
	public void setup() {
		monstruoUno = new Monstruo(new Agua());
		monstruoDos = new Monstruo(new Agua());
		jugadorUno = new Jugador("Tomas", monstruoUno);
		jugadorDos = new Jugador("Teo", monstruoDos);
		pokemon = new LuchaDeMonstruos(jugadorUno, jugadorDos);
	}

	@Test
	public void devuelveJugador2ComoJugadorActualDepuesDeQueJugador1Ataca() {
		try {
			pokemon.atacar(false, false);
		} catch (Exception e) {

		}
		Assert.assertEquals(pokemon.getJugadorDos(), pokemon.getJugadorActual());
	}

	@Test
	public void devuelveJugador1ComoJugadorActualDepuesDeRotarElTurno() {
		try {
			pokemon.atacar(false, false);
			pokemon.atacar(false, false);
		} catch (Exception e) {

		}
		Assert.assertEquals(pokemon.getJugadorUno(), pokemon.getJugadorActual());
	}

	@Test
	public void devuelveAJugador1ComoGanador() {
		Jugador ganador = null;
		for (int x = 0; x < 19; x++) {
			try {
				pokemon.atacar(false, false);
			} catch (Exception e) {

			}
		}
		try {
			ganador = pokemon.getGanador();
		} catch (Exception e) {

		}
		System.out.println("Este es jugador 1 "
				+ pokemon.getJugadorUno().getMonstruo().getPuntosDeVida());
		System.out.println("Este es jugador 2 "
				+ pokemon.getJugadorDos().getMonstruo().getPuntosDeVida());
		System.out.println("El ganador es " + ganador.getNombre());
		Assert.assertEquals(ganador, pokemon.getJugadorUno());
	}

	@Test
	public void devuelveAJugador2ComoGanador() {
		Jugador ganador = null;
		try {
			for (int x = 0; x < 8; x++) {
				pokemon.atacar(false, false);
				/*
				 * System.out.println("Este es jugador 1 " +
				 * pokemon.getJugadorUno().getMonstruo() .getPuntosDeVida());
				 * System.out.println("Este es jugador 2 " +
				 * pokemon.getJugadorDos().getMonstruo() .getPuntosDeVida());
				 */
			}
			pokemon.atacar(false, false); /* Este ultimo golpe es del 1 */
			pokemon.atacar(false, true);
			pokemon.atacar(false, false);
			pokemon.atacar(false, true);
			pokemon.atacar(false, false);
			pokemon.atacar(false, true);
			pokemon.atacar(false, false);
			pokemon.atacar(false, true);

		} catch (Exception e) {

		}
		try {
			ganador = pokemon.getGanador();

		} catch (Exception e) {

		}
		System.out.println("\n");
		System.out.println("<----------->");
		System.out.println("Este es jugador 1 "
				+ pokemon.getJugadorUno().getMonstruo().getPuntosDeVida());
		System.out.println("Este es jugador 2 "
				+ pokemon.getJugadorDos().getMonstruo().getPuntosDeVida());
		System.out.println("El ganador es " + ganador.getNombre());
		Assert.assertEquals(ganador, pokemon.getJugadorDos());
	}

}

package pruebasUnitarias;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import codigo.*;
import excepciones.CantidadDeEspecialesSuperados;
import excepciones.MonstruoFueraDeCombate;
import excepciones.NoHayGanador;
import excepciones.NoHayTipoSecundario;

public class TestDeExcepciones {

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
	public void seRealizanTantosAtaquesEspecialesSePueda() {
		try {
			for (int x = 0; x < 9; x++) {
				pokemon.atacar(false, true);
			}

		} catch (NoHayTipoSecundario e) {

		} catch (CantidadDeEspecialesSuperados e) {
			Assert.assertEquals(
					"Ya has utilizado todos los ataques especiales",
					e.getMessage());

		}
	}

	@Test
	public void seIntentaAtacarPorTipoSecundarioDeUnMonstruoQueNoLoTiene() {
		try {
			pokemon.atacar(false, true);
		} catch (NoHayTipoSecundario e) {
			Assert.assertEquals("Este monstruo no tiene segundo tipo",
					e.getMessage());
		} catch (CantidadDeEspecialesSuperados e) {

		}
	}

	@Test
	public void seIniciaPartidaYSePreguntaPorGanadorSinHaberFinalizadoLaMisma() {
		try {
			pokemon.atacar(false, false);
			pokemon.getGanador();
		} catch (NoHayGanador e) {
			Assert.assertEquals("Aun no hay ganador definido", e.getMessage());
		} catch (NoHayTipoSecundario e) {

		} catch (CantidadDeEspecialesSuperados e) {

		}
	}

	@Test
	public void sePideAUnMonstruoFueraDeCombateAtacar() {
		try {
			for (int i = 0; i < 20; i++) {
				monstruoUno.atacar(false, false, jugadorDos);
			}
			monstruoDos.atacar(false, false, jugadorUno);
		} catch (NoHayTipoSecundario e) {

		} catch (CantidadDeEspecialesSuperados e) {

		} catch(MonstruoFueraDeCombate e){
			System.out.println("vida de monstruo 1 = " + monstruoUno.getPuntosDeVida());
			System.out.println("vida de monstruo 2 = " + monstruoDos.getPuntosDeVida());
			Assert.assertEquals("Monstruo ya no puede combatir", e.getMessage());
		}
		
	}
	// No hay test para NoSeJuegaPartida ya que esta es lanzada y tratada en la
	// consola directamente

}

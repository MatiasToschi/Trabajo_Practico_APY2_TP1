package pruebasUnitarias;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import codigo.*;

public class TestDeMonstruo {

	Monstruo monstruoA, monstruoB;
	Jugador fantasma;
	Fuego fuego;
	Agua agua;
	Tierra tierra;
	Aire aire;

	@Before
	public void setup() {
		agua = new Agua();
		fuego = new Fuego();
		tierra = new Tierra();
		aire = new Aire();
	}

	@Test
	public void monstruoAAtacaSimpleAMonstruoBConPlus() {
		monstruoA = new Monstruo(fuego);
		monstruoB = new Monstruo(tierra);
		fantasma = new Jugador("Tomy", monstruoB);
		try {
			monstruoA.atacar(false, false, fantasma);
			System.out.println("SCP " + monstruoB.getPuntosDeVida());
			org.junit.Assert.assertEquals(88.0, monstruoB.getPuntosDeVida(),
					0.0);
		} catch (Exception e) {

		}
	}

	@Test
	public void monstruoAAtacaSimpleAMonstruoBConPlusEnContra() {
		monstruoA = new Monstruo(aire);
		monstruoB = new Monstruo(tierra);
		fantasma = new Jugador("Tomy", monstruoB);
		try {
			monstruoA.atacar(false, false, fantasma);
			System.out.println("SCPC " + monstruoB.getPuntosDeVida());
			Assert.assertEquals(92.0, monstruoB.getPuntosDeVida(), 0.0);
		} catch (Exception e) {

		}
	}

	@Test
	public void monstruoAAtacaSimpleAMonstruoBSinPlus() {
		monstruoA = new Monstruo(agua);
		monstruoB = new Monstruo(tierra);
		fantasma = new Jugador("Tomy", monstruoB);
		try {
			monstruoA.atacar(false, false, fantasma);
			System.out.println("SSP " + monstruoB.getPuntosDeVida());
			Assert.assertEquals(90.0, monstruoB.getPuntosDeVida(), 0.0);
		} catch (Exception e) {

		}
	}

	@Test
	public void monstruoAAtacaEspecialAMonstruoBConPlus() {
		monstruoA = new Monstruo(fuego);
		monstruoB = new Monstruo(tierra);
		fantasma = new Jugador("Tomy", monstruoB);
		try {
			monstruoA.atacar(false, true, fantasma);
			System.out.println("ECP " + monstruoB.getPuntosDeVida());
			Assert.assertEquals(82.0, monstruoB.getPuntosDeVida(), 0.0);
		} catch (Exception e) {

		}
	}

	@Test
	public void monstruoAAtacaEspecialAMonstruoBConPlusEnContra() {
		monstruoA = new Monstruo(aire);
		monstruoB = new Monstruo(tierra);
		fantasma = new Jugador("Tomy", monstruoB);
		try {
			monstruoA.atacar(false, true, fantasma);
			System.out.println("ECPC " + monstruoB.getPuntosDeVida());
			Assert.assertEquals(88.0, monstruoB.getPuntosDeVida(), 0.0);
		} catch (Exception e) {

		}
	}

	@Test
	public void monstruoAAtacaEspecialAMonstruoBSinPlus() {
		monstruoA = new Monstruo(agua);
		monstruoB = new Monstruo(tierra);
		fantasma = new Jugador("Tomy", monstruoB);
		try {
			monstruoA.atacar(false, true, fantasma);
			System.out.println("ESP " + monstruoB.getPuntosDeVida());
			Assert.assertEquals(85.0, monstruoB.getPuntosDeVida(), 0.0);
		} catch (Exception e) {

		}
	}

}

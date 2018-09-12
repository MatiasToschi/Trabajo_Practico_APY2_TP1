package pruebasUnitarias;

import codigo.*;

import org.junit.Assert;
import org.junit.Test;

public class TestDeTipo {

	@Test
	public void testDeTipoAgua() {
		Tipo agua = new Agua();
		Tipo fuego = new Fuego();
		Tipo tierra = new Tierra();
		Tipo aire = new Aire();
		double aguaContraFuego = agua.calcularVentajaDesventaja(fuego, 15);
		double aguaContraAire = agua.calcularVentajaDesventaja(aire, 15);
		double aguaContraAgua = agua.calcularVentajaDesventaja(agua, 15);
		double aguaContraTierra = agua.calcularVentajaDesventaja(tierra, 15);
		Assert.assertEquals(3.0, aguaContraFuego, 0.0);
		Assert.assertEquals(-3.0, aguaContraAire, 0.0);
		Assert.assertEquals(0.0, aguaContraAgua, 0.0);
		Assert.assertEquals(0.0, aguaContraTierra, 0.0);
	}

	@Test
	public void testDeTipoFuego() {
		Tipo agua = new Agua();
		Tipo fuego = new Fuego();
		Tipo tierra = new Tierra();
		Tipo aire = new Aire();
		double fuegoContraFuego = fuego.calcularVentajaDesventaja(fuego, 15);
		double fuegoContraAire = fuego.calcularVentajaDesventaja(aire, 15);
		double fuegoContraAgua = fuego.calcularVentajaDesventaja(agua, 15);
		double fuegoContraTierra = fuego.calcularVentajaDesventaja(tierra, 15);
		Assert.assertEquals(0.0, fuegoContraFuego, 0.0);
		Assert.assertEquals(-3.0, fuegoContraAire, 0.0);
		Assert.assertEquals(0.0, fuegoContraAgua, 0.0);
		Assert.assertEquals(3.0, fuegoContraTierra, 0.0);
	}

	@Test
	public void testDeTipoTierra() {
		Tipo agua = new Agua();
		Tipo fuego = new Fuego();
		Tipo tierra = new Tierra();
		Tipo aire = new Aire();
		double tierraContraFuego = tierra.calcularVentajaDesventaja(fuego, 15);
		double tierraContraAire = tierra.calcularVentajaDesventaja(aire, 15);
		double tierraContraAgua = tierra.calcularVentajaDesventaja(agua, 15);
		double tierraContraTierra = tierra
				.calcularVentajaDesventaja(tierra, 15);
		Assert.assertEquals(0.0, tierraContraFuego, 0.0);
		Assert.assertEquals(3.0, tierraContraAire, 0.0);
		Assert.assertEquals(-3.0, tierraContraAgua, 0.0);
		Assert.assertEquals(0.0, tierraContraTierra, 0.0);
	}

	@Test
	public void testDeTipoAire() {
		Tipo agua = new Agua();
		Tipo fuego = new Fuego();
		Tipo tierra = new Tierra();
		Tipo aire = new Aire();
		double aireContraFuego = aire.calcularVentajaDesventaja(fuego, 15);
		double aireContraAire = aire.calcularVentajaDesventaja(aire, 15);
		double aireContraAgua = aire.calcularVentajaDesventaja(agua, 15);
		double aireContraTierra = aire.calcularVentajaDesventaja(tierra, 15);
		Assert.assertEquals(0.0, aireContraFuego, 0.0);
		Assert.assertEquals(0.0, aireContraAire, 0.0);
		Assert.assertEquals(3.0, aireContraAgua, 0.0);
		Assert.assertEquals(-3.0, aireContraTierra, 0.0);
	}

}

package codigo;

import excepciones.*;

public class Monstruo {

	private double puntosDeVida = 100;
	private int cantidadDeAtaquesEspeciales = 4;
	private Tipo tipoPrincipal;
	private Tipo tipoSecundario;
	private static double ataqueSimple = 10;
	private static double ataqueEspecial = 15;

	public Monstruo(Tipo tipoPrincipal) {
		this.tipoPrincipal = tipoPrincipal;
		this.tipoSecundario = null;
		cantidadDeAtaquesEspeciales = 4;

	}

	public Monstruo(Tipo tipoPrincipal, Tipo tipoSecundario) {
		this.tipoPrincipal = tipoPrincipal;
		this.tipoSecundario = tipoSecundario;
		cantidadDeAtaquesEspeciales = 4;

	}

	public void atacar(boolean esSecundario, boolean esFuerte, Jugador oponente)
			throws CantidadDeEspecialesSuperados, NoHayTipoSecundario, MonstruoFueraDeCombate {
		double danoEfectivo = 0;
		Monstruo monstruoOponente = oponente.getMonstruo();
		Tipo oponenteTipoPrincipal = monstruoOponente.getTipoPrincipal();
		Tipo oponenteTipoSecundario = monstruoOponente.getTipoSecundario();
		if (puntosDeVida > 0 && monstruoOponente.getPuntosDeVida() > 0) {
			if (!esSecundario && !esFuerte) {
				// Significa que el ataque es de su tipo primario y es ataque
				// simple

				danoEfectivo = ataqueSimple
						+ tipoPrincipal.calcularVentajaDesventaja(
								oponenteTipoPrincipal, ataqueSimple);
				if (oponenteTipoSecundario != null) {
					danoEfectivo = danoEfectivo
							+ tipoPrincipal.calcularVentajaDesventaja(
									oponenteTipoSecundario, ataqueSimple);
				}

			} else if (esSecundario && !esFuerte && tipoSecundario != null) {

				// Significa que el ataque es de su tipo secundario y es ataque
				// simple

				danoEfectivo = ataqueSimple
						+ tipoSecundario.calcularVentajaDesventaja(
								oponenteTipoPrincipal, ataqueSimple);
				if (oponenteTipoSecundario != null) {
					danoEfectivo = danoEfectivo
							+ tipoSecundario.calcularVentajaDesventaja(
									oponenteTipoSecundario, ataqueSimple);
				}

			} else if (!esSecundario && esFuerte
					&& cantidadDeAtaquesEspeciales > 0) {

				// Significa que el ataque es de su tipo primario y es ataque
				// fuerte
				// o especial

				danoEfectivo = ataqueEspecial
						+ tipoPrincipal.calcularVentajaDesventaja(
								oponenteTipoPrincipal, ataqueEspecial);
				if (oponenteTipoSecundario != null) {
					danoEfectivo = danoEfectivo
							+ tipoPrincipal.calcularVentajaDesventaja(
									oponenteTipoSecundario, ataqueEspecial);
				}
				cantidadDeAtaquesEspeciales--;

			} else if (esSecundario && esFuerte
					&& cantidadDeAtaquesEspeciales > 0
					&& tipoSecundario != null) {

				// Significa que el ataque es de su tipo secundario y es ataque
				// fuerte o especial

				danoEfectivo = ataqueEspecial
						+ tipoPrincipal.calcularVentajaDesventaja(
								oponenteTipoPrincipal, ataqueEspecial);
				if (oponenteTipoSecundario != null) {
					danoEfectivo = ataqueEspecial
							+ tipoPrincipal.calcularVentajaDesventaja(
									oponenteTipoSecundario, ataqueEspecial);
					cantidadDeAtaquesEspeciales--;
				}
			} else if (esSecundario && tipoSecundario == null) {
				throw new NoHayTipoSecundario();
			} else {
				throw new CantidadDeEspecialesSuperados();
			}
			monstruoOponente.restarVida(danoEfectivo);
		}else{
			throw new MonstruoFueraDeCombate();
		}
	}

	public Tipo getTipoPrincipal() {
		return tipoPrincipal;
	}

	public Tipo getTipoSecundario() {
		return tipoSecundario;
	}

	private void restarVida(double danoEfectivo) {
		if(puntosDeVida-danoEfectivo >= 0){
		puntosDeVida -= danoEfectivo;
		}else{
			puntosDeVida = 0;
		}
	}

	public double getPuntosDeVida() {
		return puntosDeVida;
	}
}

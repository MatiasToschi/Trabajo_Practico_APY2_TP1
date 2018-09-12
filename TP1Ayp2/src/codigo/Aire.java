package codigo;

public class Aire extends Tipo {

	public double calcularVentajaDesventaja(Tipo tipo, double valorAtaque) {
		if (tipo.getTipo() == listadoDeTipos.AGUA) {
			return (valorAtaque * porcentajeDePlus);
		} else if (tipo.getTipo() == listadoDeTipos.TIERRA) {
			return -(valorAtaque * porcentajeDePlus);
		}
		return 0;
	}

	public listadoDeTipos getTipo() {
		return listadoDeTipos.AIRE;
	}
}

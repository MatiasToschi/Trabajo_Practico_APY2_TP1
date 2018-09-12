package codigo;

public class Tierra extends Tipo {

	public double calcularVentajaDesventaja(Tipo tipo, double valorAtaque) {
		if(tipo.getTipo() == listadoDeTipos.AIRE){
			return (valorAtaque * porcentajeDePlus);
		}else if(tipo.getTipo() == listadoDeTipos.AGUA){
			return -(valorAtaque * porcentajeDePlus);			
		}
			return 0;
		}

	public listadoDeTipos getTipo() {
		return listadoDeTipos.TIERRA;
	}
}

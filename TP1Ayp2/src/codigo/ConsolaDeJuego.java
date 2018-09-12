package codigo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import excepciones.*;

public class ConsolaDeJuego {

	public static void main(String[] args) {

		InputStreamReader lectorDeEntrada = new InputStreamReader(System.in);
		BufferedReader gameboy = new BufferedReader(lectorDeEntrada);
		LuchaDeMonstruos pokemon;
		String input;
		String nombreJugador1 = null, nombreJugador2 = null;
		String tipoPrincipalMonstruo1 = null, tipoSecundarioMonstruo1 = null;
		String tipoPrincipalMonstruo2 = null, tipoSecundarioMonstruo2 = null;
		boolean respuestaValida = false;
		

		try {
			System.out.println("¿ Desea iniciar partida ? ");
			while (!respuestaValida) {
				input = gameboy.readLine().toLowerCase();
				if (input.equals("si")) {
					respuestaValida = true;
				} else if (input.equals("no")) {
					throw new NoSeJuegaPartida();
				} else {
					System.out
							.println("La respuesta ingresada no es valida, responda 'si o no' ");
				}

			}
		} catch (IOException e) {

		} catch (NoSeJuegaPartida e) {
			// Buscar forma de detener o reiniciar consola
			System.out.println("No se inicia partida");
			System.exit(0);
		}
				
		try {

			System.out.println("Ingrese nombre Jugador 1: ");
			String respuesta = gameboy.readLine();
			while (respuesta.equals("")) {
				System.out.println("El nombre ingresado no es valido");
				System.out.println("Ingrese nombre Jugador 1: ");
				respuesta = gameboy.readLine();
			}
			nombreJugador1 = respuesta;

		} catch (IOException e) {

		}

		try {

			System.out.println("Ingrese primer Tipo del Monstruo");
			input = gameboy.readLine().toLowerCase();
			while (input.equals("")
					|| !(input.equals("fuego") || input.equals("agua")
							|| input.equals("tierra") || input.equals("aire"))) {
				System.out.println("El tipo no es valido");
				System.out.println("Ingrese primer Tipo del Monstruo");
				input = gameboy.readLine().toLowerCase();
			}
			tipoPrincipalMonstruo1 = input;

		} catch (IOException e) {

		}

		try {

			System.out.print("¿Desea ingresar un segundo tipo? \n");
			respuestaValida = false;
			while (!respuestaValida) {
				input = gameboy.readLine().toLowerCase();
				if (input.equals("si")) {
					// ----- //
					System.out.println("Ingrese segundo Tipo del Monstruo");
					input = gameboy.readLine().toLowerCase();
					while (input.equals("")
							|| input.equals(tipoPrincipalMonstruo1)
							|| !(input.equals("fuego") || input.equals("agua")
									|| input.equals("tierra") || input
										.equals("aire"))) {
						System.out.println("El tipo no es valido");
						System.out.println("Ingrese segundo Tipo del Monstruo");
						input = gameboy.readLine().toLowerCase();
					}
					respuestaValida = true;
					tipoSecundarioMonstruo1 = input;

				} else if (input.equals("no")) {
					// Avanza sobre lo demás
					respuestaValida = true;
				} else {
					System.out
							.println("La respuesta ingresada no es valida, responda 'si o no' ");
				}

			}

		} catch (IOException e) {

		}

		try {

			System.out.println("Ingrese nombre Jugador 2: ");
			String respuesta = gameboy.readLine();
			while (respuesta.equals("")) {
				System.out.println("El nombre ingresado no es valido");
				System.out.println("Ingrese nombre Jugador 2: ");
				respuesta = gameboy.readLine();
			}
			nombreJugador2 = respuesta;
		} catch (IOException e) {

		}

		try {
			System.out.println("Ingrese primer Tipo del Monstruo");
			input = gameboy.readLine().toLowerCase();
			while (input.equals("")
					|| !(input.equals("fuego") || input.equals("agua")
							|| input.equals("tierra") || input.equals("aire"))) {
				System.out.println("El tipo no es valido");
				System.out.println("Ingrese primer Tipo del Monstruo");
				input = gameboy.readLine().toLowerCase();
			}
			tipoPrincipalMonstruo2 = input;

		} catch (IOException e) {

		}

		try {

			System.out.print("¿Desea ingresar un segundo tipo? \n");
			respuestaValida = false;
			while (!respuestaValida) {
				input = gameboy.readLine().toLowerCase();
				if (input.equals("si")) {
					// ----- //
					System.out.println("Ingrese segundo Tipo del Monstruo");
					input = gameboy.readLine().toLowerCase();
					while (input.equals("")
							|| input.equals(tipoPrincipalMonstruo2)
							|| !(input.equals("fuego") || input.equals("agua")
									|| input.equals("tierra") || input
										.equals("aire"))) {
						System.out.println("El tipo no es valido");
						System.out.println("Ingrese segundo Tipo del Monstruo");
						input = gameboy.readLine().toLowerCase();
					}
					respuestaValida = true;
					tipoSecundarioMonstruo2 = input;

				} else if (input.equals("no")) {
					// Avanza sobre lo demás
					respuestaValida = true;
				} else {
					System.out
							.println("La respuesta ingresada no es valida, responda 'si o no' ");
				}

			}
		} catch (IOException e) {

		}
		try {
			/*
			 * momento de crear los objetos
			 */
			if (tipoSecundarioMonstruo1 == null
					&& tipoSecundarioMonstruo2 == null) {
				// esto es si ambos mounstruos son de un tipo
				pokemon = new LuchaDeMonstruos(
						crearJugador(
								nombreJugador1,
								crearMonstruo(estableceElTipo(tipoPrincipalMonstruo1))),
						crearJugador(
								nombreJugador2,
								crearMonstruo(estableceElTipo(tipoPrincipalMonstruo2))));
			} else if (tipoSecundarioMonstruo1 == null) {
				// esto es si el primer mounstro es de solo un tipo
				pokemon = new LuchaDeMonstruos(
						crearJugador(
								nombreJugador1,
								crearMonstruo(estableceElTipo(tipoPrincipalMonstruo1))),
						crearJugador(
								nombreJugador2,
								crearMonstruo(
										estableceElTipo(tipoPrincipalMonstruo2),
										estableceElTipo(tipoSecundarioMonstruo2))));

			} else if (tipoSecundarioMonstruo2 == null) {
				// esto es si el segundo monstruo es de solo un tipo
				pokemon = new LuchaDeMonstruos(
						crearJugador(
								nombreJugador1,
								crearMonstruo(
										estableceElTipo(tipoPrincipalMonstruo1),
										estableceElTipo(tipoSecundarioMonstruo1))),
						crearJugador(
								nombreJugador2,
								crearMonstruo(estableceElTipo(tipoPrincipalMonstruo2))));

			} else {
				// esto es si ambos mounstruos son de doble tipo
				pokemon = new LuchaDeMonstruos(
						crearJugador(
								nombreJugador1,
								crearMonstruo(
										estableceElTipo(tipoPrincipalMonstruo1),
										estableceElTipo(tipoSecundarioMonstruo1))),
						crearJugador(
								nombreJugador2,
								crearMonstruo(
										estableceElTipo(tipoPrincipalMonstruo2),
										estableceElTipo(tipoSecundarioMonstruo2))));

			}

			System.out.println("La partida ha iniciado con exito");

			while (!pokemon.hayGanador()) {
				boolean esSecundario = false;
				boolean esFuerte = false;
				System.out.println(pokemon.getJugadorActual().getNombre()
						+ " es tu turno ataca a "
						+ pokemon.getJugadorOponenteActual().getNombre());
				System.out.println("¿Atacas por tu tipo principal?");
				respuestaValida = false;
				while (!respuestaValida) {
					input = gameboy.readLine().toLowerCase();

					if (input.equals("si")) {
						esSecundario = false;
						respuestaValida = true;
					} else if (input.equals("no")) {
						esSecundario = true;
						respuestaValida = true;
					} else {
						System.out
								.println("La respuesta ingresada no es valida, responda 'si o no' ");
					}
				}
				System.out.println("El ataque ¿Es simple?");
				respuestaValida = false;
				while (!respuestaValida) {
					input = gameboy.readLine().toLowerCase();
					if (input.equals("si")) {
						esFuerte = false;
						respuestaValida = true;
					} else if (input.equals("no")) {
						esFuerte = true;
						respuestaValida = true;
					} else {
						System.out
								.println("La respuesta ingresada no es valida, responda 'si o no' ");
					}
				}
				try {
					pokemon.atacar(esSecundario, esFuerte);
					/*-----------------*/
				} catch (CantidadDeEspecialesSuperados e) {
					System.out.println(e.getMessage());
					try {
						pokemon.atacar(esSecundario, false);
					} catch (NoHayTipoSecundario e2) {
						try {
							System.out.println(e2.getMessage());
							pokemon.atacar(false, false);
						} catch (Exception e3) {
							// Es imposible que llegue aca
						}
					} catch (CantidadDeEspecialesSuperados e2) {
						// Es imposible que llegue aca
					}
					/*-----------------*/
				} catch (NoHayTipoSecundario e) {
					System.out.println(e.getMessage());
					try {
						pokemon.atacar(false, esFuerte);
					} catch (Exception e2) {
						try {
							pokemon.atacar(false, false);
						} catch (Exception e3) {
							// Es imposible que llegue aca
						}
					}
				}
				// System.out.println("es secundario " + esSecundario);
				// System.out.println("es principal " + esFuerte);
				// System.out.println("desde aqui llame a atacar 1");
				// -Esto es despues de atacar- //
				System.out.println("jugador 1 "
						+ pokemon.getJugadorUno().getMonstruo()
								.getPuntosDeVida());
				System.out.println("jugador 2 "
						+ pokemon.getJugadorDos().getMonstruo()
								.getPuntosDeVida());

			}
			// Esto es despues del while
			try {
				System.out.println("El ganador es ... "
						+ pokemon.getGanador().getNombre());

			} catch (NoHayGanador e) {
				System.out.println(e.getMessage());
			}
		} catch (IOException e) {

		} finally {

		}
	}

	private static Jugador crearJugador(String nombreJugador, Monstruo monstruo) {
		return new Jugador(nombreJugador, monstruo);
	}

	private static Monstruo crearMonstruo(Tipo tipoUnico) {
		return new Monstruo(tipoUnico);
	}

	private static Monstruo crearMonstruo(Tipo tipoPrincipal,
			Tipo tipoSecundario) {
		return new Monstruo(tipoPrincipal, tipoSecundario);
	}

	private static Tipo estableceElTipo(String nombreDelTipo) {
		if (nombreDelTipo.equals("fuego")) {
			return new Fuego();
		} else if (nombreDelTipo.equals("agua")) {
			return new Agua();
		} else if (nombreDelTipo.equals("tierra")) {
			return new Tierra();
		} else if (nombreDelTipo.equals("aire")) {
			return new Aire();
		}
		return null;
	}
}
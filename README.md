# Trabajo_Practico_APY2_TP1
Trabajo practico Nro 1º de algoritmos y programacion 2 UNTREF 2018 [Batalla de monstruos]

## Para poder ejecutarlo

1. Debe descargar el proyecto
2. Debe importarse en un interprete de Java con consola (Eclipse preferentemente, donde fue programado)
3. Seleccionar la clase ConsolaDeJuego(la cual posee el main para iniciar el programa) y correr(run)

## Decisiones de diseño

#### ConsolaDeJuego: Clase concreta que se encarga de iniciar una nueva partida, la cual recibe los nombres de los jugadores, el/los tipo/s de los monstruos y se encarga de enviar las ordenes a los monstruos para que peleen.

#### LuchaDeMonstruos: Clase concreta “principal” de nuestro programa la cual posee el método ‘atacar ’, que llama al jugador.

#### Jugador: Clase concreta que posee el método ‘atacar’ que llama al monstruo.

#### Monstruo: Clase concreta que posee el método ‘atacar’ que utiliza las propiedades de ‘ventajaDesventaja’ de la clase abstracta Tipo y su herencia dependiendo de las propiedades del monstruo. 

#### Tipo: Clase abstracta "padre" de :
- Agua
- Aire
- Tierra
- Fuego

##### Utilizada por la clase Monstruo para instanciar un objeto monstruo con tipos de Tipo, primario y secundario utilizados en la clase principal ‘LuchaDeMonstruos’.

##### Agua: Clase hija de la clase abstracta Tipo la cual posee los cálculos de ventaja y desventaja sobre otros tipos.

##### Aire: Clase hija de la clase abstracta Tipo las cuales posee los cálculos de ventaja y desventaja sobre otros tipos.

##### Tierra: Clase hija de la clase abstracta Tipo la cual posee los cálculos de ventaja y desventaja sobre otros tipos.

##### Fuego: Clase hija de la clase abstracta Tipo la cual posee los cálculos de ventaja y desventaja sobre otros tipos. archivos

## Lista de archivos

src/ codigo/ ConsolaDeJuego.java

src/ codigo/ LuchaDeMonstruos.java

src/ codigo/Jugador.java

src/ codigo/ Monstruo.java

src/ codigo/ Tipo.java

src/ codigo/ Agua.java

src/ codigo/ Fuego.java

src/ codigo/ Tierra.java

src/ codigo/ Aire.java

src/ excepciones/    CantidadDeEspecialesSuperados.java

src/ excepciones/ NoHayGanador.java

src/ excepciones/ NoSeJuegaPartida.java

src/ excepciones/ NoHayTipoSecundario.java

src/ pruebasUnitarias/TestDeExcepciones.java

src/ pruebasUnitarias/TestDeLuchaDeMonstruos.java

src/ pruebasUnitarias/TestDeMonstruo

src/ pruebasUnitarias/TestDeTipo

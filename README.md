# Trabajo_Practico_APY2_TP1
Trabajo practico de algoritmos y programacion 2. 

Decisiones de diseño

ConsolaDeJuego: Clase concreta que se encarga de iniciar una nueva partida, la cual recibe los nombres de los jugadores, el/los tipo/s de los monstruos y se encarga de enviar las ordenes a los monstruos para que peleen.

LuchaDeMonstruos: Clase concreta “principal” de nuestro programa la cual posee el método ‘atacar ’, que llama al jugador.


Jugador: Clase concreta que posee el método ‘atacar’ que llama al monstruo.

Monstruo: Clase concreta que posee el método ‘atacar’ que utiliza las propiedades de ‘ventajaDesventaja’ de la clase abstracta Tipo y su herencia dependiendo de las propiedades del monstruo. 

Tipo: Clase abstracta padre de
-Agua
-Aire
-Tierra
-Fuego
Utilizada por la clase Monstruo para instanciar un objeto monstruo con tipos de Tipo, primario y secundario utilizados en la clase principal ‘LuchaDeMonstruos’.

Agua: Clase hija de la clase abstracta Tipo la cual posee los cálculos de ventaja y desventaja sobre otros tipos.

Aire: Clase hija de la clase abstracta Tipo las cuales posee los cálculos de ventaja y desventaja sobre otros tipos.

Tierra: Clase hija de la clase abstracta Tipo la cual posee los cálculos de ventaja y desventaja sobre otros tipos.

Fuego: Clase hija de la clase abstracta Tipo la cual posee los cálculos de ventaja y desventaja sobre otros tipos. archivos

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
src/ pruebasUnitarias 
src/ pruebasUnitarias
src/ pruebasUnitarias
src/ pruebasUnitarias
src/ pruebasUnitarias

###########################
Anotacions sobre propietats
###########################

* Autor/a: Sergio Cordero

* Data: 16/03/2026

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de *propietats*
dins de la *programació orientada a objectes*.

Les anotacions responen a diferents preguntes sobre aquest codi:

::

    01   public class GatRenat {
    02       int vides = 7;                // vides disponibles del gat Renat
    03       public static void main(String[] args) {
    04           GatRenat renat;           // declarem la referència al gat
    05           renat = new GatRenat();   // creem la instància del gat Renat.
    06           System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    07       }
    08   }

Pregunta 1. El nom del fitxer
=============================

Per que funcioni, el nom del fitxer que contingui el programa anterior ha
de ser ``GatRenat.java``.

Si reanomeno el fitxer anterior a ``UnNomQualsevol.java``, em trobo el
següent resultat a l'hora de compilar:

::

    $ javac UnNomQualsevol.java
    ERROR: el programa s'anomena GatRenat.java

Pregunta 2. Sortida
===================

En executar el programa ``GatRenat`` m'ha generat la següent sortida:

::

    $ java GatRenat
    Al gat Renat li queden 7 vides

Pregunta 3. Declaració de ``renat``.
====================================

La línia en que està declarada la variable ``renat`` que apareix a la
línia 6 és la linia 4.

Pregunta 4. Inicialització
==========================

El valor que es mostra per pantalla, és assignat a la línia 2.

Pregunta 5. No inicialització
=============================

Si a la línia especificada per la pregunta anterior no li assignem cap
valor, el que es mostrarà per pantalla és:

::

    Al gat Renat li queden 0 vides.
    
Això és així perque agafa el valor per defecte quan no s'inicialitza.

Pregunta 6. Eliminem la línia 5
===============================

En cas que la línia 5 no hi sigui (per exemple, si la comento), es
produeix el següent resultat:

Error

Penso que passa això perquè no s'ha creat cap instància del gat Renat, llavors la variable renat no apunta a cap objecte.

Pregunta 7. Referència
======================

Penso que el el comentari de la línia 4 parla de *referència* perquè la variable renat no apunta a cap objecte.

Crec que la  relació entre *referència* i *variable* és: la variable guarda la referencia en objecte.


Pregunta 8. Instància
=====================

Respecte la línia 5:

* la instància és: new GatRenat();

* la variable és: renat

* la referència és: GatRenat renat

* la classe és: GatRenat

Pregunta 9. ``vides`` i variables globals
=========================================

Les diferències presenta la variable ``vides`` respecte les 
*variables globals* són:

1. vides és una variable que pertany a la classe GatRenat i les globals pertanyen a tot el programa.

2. vides només es pot accedir mitjançant una variable que apunta a un objecte, per exemple ``renat.vides`` i les globals es poden utilitzar des de qualsevol punt del programa.

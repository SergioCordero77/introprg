#############################
Anotacions sobre accés extern
#############################

* Autor/a: Sergio Cordero

* Data: 21/03/2026

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de *accés
extern* dins de la *programació orientada a objectes*.

Disposem ara de dos fitxers amb codi:

* ``GatRenat.java``

  ::

    01   public class GatRenat {
    02       int vides = 7;                // vides disponibles del gat Renat
    03       public static void main(String[] args) {
    04           GatRenat renat;           // declarem la referència al gat
    05           renat = new GatRenat();   // creem la instància del gat Renat.
    06           System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    07       }
    08   }



* ``UsaGatRenat.java``

  ::

    01      public class UsaGatRenat {
    02          public static void main(String[] args) {
    03              GatRenat renat = new GatRenat();
    04              System.out.println("Al gat Renat li queden " + renat.vides + " vides");
    05          }
    06      }

Pregunta 1. On està el ``main()``
=================================

El punt d'entrada ``main()`` d'aquest programa es troba al fitxer GatRenat i UsaGatRenat, pero només s'executa el de la classe que indiquem en executar el programa.

Pregunta 2. Distingint dos ``main()``
=====================================

Ara tenim dos fitxers amb ``main()``. Java pot saber quin dels dos volem
executar gracies a la classe.

Pregunta 3. Definició de la classe
==================================

La classe del gat Renat està definida al fitxer GatRenat.

Pregunta 4. Quants programes
============================

El nombre de programes que es podrien construir fent ús de la definició del gat Renat és infinit.

Penso això perquè la classe està definida a GatRenat, llavors qualsevol programa podria utilitzar-lo sempre que sigui accessible.

Pregunta 5. Eliminant ``main()``
================================

Quan elimino el ``main()`` de ``GatRenat`` (per exemple, comentant-lo) em trobo que en intentar
tornar a compilar/executar ``UsaGatRenat``, funcionarà perque GatRenat encara existeix i només necessita la definició de la seva classe, no el main().

El que sí ha deixat de funcionar és l'execució de GatRenat.

Pregunta 6. Diferents directoris
================================

Després de moure el fitxer ``UsaGatRenat.java`` a una carpeta diferent d'on es
troba ``GatRenat.java``, m'he trobat que ja no funciona perquè es troben en carpetas diferents i UsaGatRenat no pot trobar la classe GatRenat.

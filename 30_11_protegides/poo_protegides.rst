##########################################
Anotacions sobre les propietats protegides
##########################################

* Autor/a: Sergio Cordero

* Data: 23/03/2026

Introducció
===========

En aquest exercici incloc les meves anotacions sobre el tema de
*propietats protegides* dins de la *programació orientada a objectes*.

Considerarem la nova versió de ``GatRenat``::


::

    01   public class GatRenat {
    02       private int vides = 7;
    03       public int getVides() {  //  retorna el nombre de vides
    04           return vides;
    05       }
    06       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
    07           if (novesVides >= 0) {
    08               vides = novesVides;
    09           }
    10       }
    11   }


Pregunta 1. L'accés de sempre
=============================

Si ``UsaGatRenat`` fos:

::

       public class UsaGatRenat {
           public static void main(String[] args) {
               GatRenat renat = new GatRenat();
               System.out.println("El gat Renat té " + renat.vides + " vides");
           }
       }

Ens trobem que el programa no podrà accedir a les propietats de GatRenat.

Penso que passa perquè la propietat int vides es private.

Pregunta 2. Un nou accés
========================

En modificar el codi de ``UsaGatRenat`` com:

::

     public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }

La diferència respecte a la versió de la pregunta anterior és que ara accedeix a la propietat int vides a través de getVides().

El resultat ara és El gat Renat té 7 vides.

Penso que passa això perquè el métode getVides() és public.

Pregunta 3. Canviant valor
==========================

Per què des del ``main()`` de ``UsaGatRenat`` poguem dir que ``renat`` té
5 vides, cal fer setVides(5).

El codi de ``UsaGatRenat`` seria:

::

    public class UsaGatRenat {
         public static void main(String[] args) {
             GatRenat renat = new GatRenat();
             renat.setVides(5);
             System.out.println("El gat Renat té " + renat.getVides() + " vides");
         }
     }

La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat Renat té 5 vides


La meva explicació de perquè això és així és cambiem el número mitjançant el getVides() que és public.


Pregunta 4. Un valor absurd
===========================

En intentar assignar de la manera anterior -12 en comptes de 5 vides, ens
trobem que no es pot cambiar i retorna el valor que tenía inicialment

El codi seria:

::

       public class UsaGatRenat {
            public static void main(String[] args) {
                GatRenat renat = new GatRenat();
                renat.setVides(-12);
                System.out.println("El gat Renat té " + renat.getVides() + " vides");
            }
        }


La sortida en executar-lo seria:

:: 

    $ java UsaGatRenat
    El gat Renat té 7 vides


La meva explicació de perquè això és que així és que el mètode setVides() no permet assignar valors negatius (comprova novesVides >= 0). Per tant, el valor no es modifica i es manté el valor inicial (7).


Pregunta 5. I des de ``GatRenat``?
==================================

He experimentat com es comporta ``private`` des del ``main()`` del propi
``GatRenat``. En concret, he provat:

::

   public class GatRenat {
       private int vides = 7;
       public int getVides() {  //  retorna el nombre de vides
           return vides;
       }
       public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
           if (novesVides >= 0) {
               vides = novesVides;
           }
       }
       public static void main(String[] args) {
           GatRenat renat = new GatRenat();
           renat.vides = -12;
           System.out.println("El gat Renat té " + renat.vides + " vides");
       }
   }

En intentar compilar i executar aquesta versió em trobo què imprimeix valors per sota del 0.

Comparant-lo amb el que passava a la pregunta 1, veiem que aquest programa sí que pot accedir als valors encara que siguin private.

La meva explicació és que els valors private només poden ser accedits per la mateixa classe i poden ser modificats sense fer servir un getter ni setter.

Pregunta 6. Valors absurds novament
===================================

Un cop hem vist el funcionament d'aquesta versió de ``GatRenat``, ens
podem fer la següent pregunta:

    És possible posar un valor absurd a les vides d'una instància de
    GatRenat sense modificar el programa ``GatRenat.java``?

La meva resposta és SÍ perquè podem accedir a les propietats i modificar-les desde la mateixa classe.

Pregunta 7. públic i privat
===========================

La meva idea del paper que juguen les paraules ``public`` i ``private`` a
les propietats d'una classe és que diuen si podem accedir directament a elles desde un altre programa.

Pregunta 8. Només *getter*
==========================

Aquesta implementació de ``GatRenat`` disposa de *getter* i de *setter*.
Aquests venen definits pels mòduls public int getVides() i public void setVides(int novesVides).

En cas que ``GatRenat`` només disposés de *getter*, el resultat seria 7 ja que només podem consultar el valor, però no podem modificar-lo.

En canvi, si només en tingués *setter* el que passaria és que modificaria pel valor que li passem (sempre per sobre de 0). El podem modificar, però no el podem consultar directament.

Finalment, si no en tingués cap dels dos, ens trobaríem que els valors només podrien ser modificats per la propia classe.


Pregunta 9. Diferències amb els mòduls ja coneguts
==================================================

Els mòduls ``getVides()`` i ``setVides()`` tenen una definició
lleugerament diferent als mòduls que hem declarat abans del tema de POO.
En concret, aquests mètodes formen part del concepte d'encapsulació.
Aquests mètodes serveixen per accedir i modificar atributs i permeten controla i validar els valors abans de modificar-los.

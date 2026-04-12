/*
 * Interface Ensinistrable
 *
 * Representa el comportament d’un animal que pot ser ensinistrat,
 * canviant la seva posició i permetent consultar-la.
 *
 * Mètodes:
   //indicacions:
   - esDret()     -> indica si està dret
   - esAssegut()  -> indica si està assegut
   - esEstirat()  -> indica si està estirat
   //accions:
   - aixecat()    -> acció de posar-se dret
   - seu()        -> acció de seure
   - estirat()    -> acció d’estirar-se
 */
public interface Ensinistrable{

    boolean esDret ();
    boolean esAssegut ();  
    boolean esEstirat ();
    
    String aixecat();
    String seu();
    String estirat();    
}

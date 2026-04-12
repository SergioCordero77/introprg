/*
 * Interfície EsserViu
 *
 * Representa el comportament bàsic d’un ésser viu dins del sistema.
 * Qualsevol classe que implementi aquesta interfície ha de permetre:
    - saber si està viu
    - morir
    - reviure
 *
 * Mètodes:
    - boolean esViu()  -> indica si l’ésser està viu
    - String mor()     -> acció de morir
    - String reviu()   -> acció de reviure
 */

public interface EsserViu{

    boolean esViu();
    String mor();
    String reviu();
}

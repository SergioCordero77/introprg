/*
 * Programa que accedeix a la classe GatRenat i indica:
    - Les vides del GatRenat.
    - La posició inicial del GatRenat.
    - La posició final del GatRenat.
 */
public class UsaGatRenat{
    public static void main (String [] args){
        GatRenat renat = new GatRenat();
        
        System.out.println("Vides inicials: " + renat.vides);
        System.out.println("Posició inicial: " + renat.posicio);
         
        renat.posicio = "assegut"; 
         
        System.out.println("Posició final: " + renat.posicio);
    }
}

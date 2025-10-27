/*
 * Programa que codififa una hora en 
 * format digital.
 */
public class Hora {
    public static void main (String [] args){
    System.out.println("Hora?");
    String hora = Entrada.readLine();
    
    char c0 = hora.charAt(0);
    char c1 = hora.charAt(1);
    char c2 = hora.charAt(2);
    char c3 = hora.charAt(3);
    char c4 = hora.charAt(4);
    char c5 = hora.charAt(5);
    
    if (hora != 6 || hora.isBlank() || !Character.isLetter(c0) || !Character.isLetter(c1) || !Character.isLetter(c2) || !Character.isLetter(c3) || !Character.isLetter(c4) || !Character.isLetter(c5)){
        System.out.println("ERROR");
    }
    }
}

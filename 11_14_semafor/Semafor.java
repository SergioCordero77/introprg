/*
 * Programa que et diu com reaccionar segons el color del seàfor.
 *
 */
 public class Semafor {
    public static void main (String[] args) {
        System.out.println("Color?");
        String color = Entrada.readLine();

        
        if (color.equals("verd")) {
            System.out.println ("passa");
        }
        else if (color.equals("groc")) {
            System.out.println ("corre!");
        }
        else if (color.equals("vermell")) {
            System.out.println ("espera");
        } 
        else
            System.out.println ("Un semàfor només té 3 colors: verd, groc i vermell");
    }
 }

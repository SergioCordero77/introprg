/*
 * Programa que ordena tres nombres
 */
 public class TresEnOrdre {
    public static void main (String[] args) {
        System.out.println("Primer?");
        int a = Integer.parseInt(Entrada.readLine());
        System.out.println("Segon?");
        int b = Integer.parseInt(Entrada.readLine());
        System.out.println("Tercer?");
        int c = Integer.parseInt(Entrada.readLine());
        
        if (a<=b && b<=c) {
            System.out.println (a + ", " + b + " i " + c);
        }
        else if (a<=c && c<=b) {
            System.out.println (a + ", " + c + " i " + b);
        }
        else if (b<=a && a<=c) {
            System.out.println (b + ", " + a + " i " + c);
        }
        else if (b<=c && c<=a) {
            System.out.println (b + ", " + c + " i " + a);
        }
        else if (c<=a && a<=b) {
            System.out.println (c + ", " + a + " i " + b);
        }
        else {
            System.out.println (c + ", " + b + " i " + a);
        }    
    }
 }

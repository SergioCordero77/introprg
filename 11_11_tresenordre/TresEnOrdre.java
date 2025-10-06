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
        
        if ((a<=b && a<=c) && (b>=a && b<=c) && (c>=a && c>=b)) {
            System.out.println (a + ", " + b + " i " + c);
        }
        else if ((a<=b && a<=c) && (c>=a && c<=b) && (b>=a && b>=c)) {
            System.out.println (a + ", " + c + " i " + b);
        }
        else if ((b<=a && b<=c) && (a>=b && a<=c) && (c>=a && c>=b)) {
            System.out.println (b + ", " + a + " i " + c);
        }
        else if ((b<=c && b<=a) && (c>=a && c<=b) && (a>=b && a>=c)) {
            System.out.println (b + ", " + c + " i " + a);
        }
        else if ((c<=a && c<=b) && (a>=c && a<=b) && (b>=a && b>=a)) {
            System.out.println (c + ", " + a + " i " + b);
        }
        else {
            System.out.println (c + ", " + b + " i " + a);
        }    
    }
 }

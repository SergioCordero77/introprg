/*
 * Programa que del metge virtual "especialista" en refredats.
 * Segons els nostres símptomes, el metge ens recomenarà diferents tractaments.
 */
 public class Metge {
    public static void main (String[] args) {
        System.out.println("Estornuts? (sí o no)");
        String estornut = Entrada.readLine();
        System.out.println("Mal de cap? (sí o no)");
        String malCap = Entrada.readLine();
        System.out.println("Problemes d'estomac? (sí o no)");
        String malEstomac = Entrada.readLine();
        System.out.println("Tos? (sí o no)");
        String tos = Entrada.readLine();
        System.out.println("Edat?");
        int edat = Integer.parseInt (Entrada.readLine());
        
        if (estornut.equals("sí") && malCap.equals("sí") && malEstomac.equals("no")) { 
            System.out.println ("Pren una aspirina.");
        }
        else if (estornut.equals("sí") && malCap.equals("sí") && malEstomac.equals("sí")) { 
            System.out.println ("Pren un paracetamol.");
        }
        else if (estornut.equals("sí") && malCap.equals("no") && tos.equals("sí") && edat<12) { 
            System.out.println ("Pren un caramel de mel");
        }
        else if (estornut.equals("sí") && malCap.equals("no") && tos.equals("sí") && edat>12) { 
            System.out.println ("Pren un caramel d'eucaliptus");
        }
        else { 
            System.out.println ("Vine a la consulta");
        }
    }
 }

/*
 * Programa que diu els pisos que pujes i baixes
 * amb l'ascensor
 */
 public class Ascensor {
    public static void main (String[] args) {
        System.out.println("pis?");
        String pis = Entrada.readLine();
        System.out.println("botó?");
        String boto = Entrada.readLine();
        
        if (pis.equals("primer pis") && boto.equals("baixar un") || pis.equals("segon pis") && boto.equals("baixar dos")) { 
            System.out.println ("planta baixa");
        }
        else if (pis.equals("planta baixa") && boto.equals("pujar un") || pis.equals("segon pis") && boto.equals("baixar un")) { 
            System.out.println ("primer pis");
        }
        else if (pis.equals("planta baixa") && boto.equals("pujar dos") || pis.equals("primer pis") && boto.equals("pujar un")) { 
            System.out.println ("segon pis");
        }
        else {
            System.out.println ("error");
        }
    }
 }

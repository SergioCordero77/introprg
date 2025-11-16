/*
 * Programa que demana dos valors i sumarà tots els nombres que hi hagi entre els dos, incloent-los.
 * Els valors d'entrada seràn enters.
 */
public class SumaInterval{
    public static void main (String [] args){
    
    System.out.println("primer?");
    int primer = Integer.parseInt(Entrada.readLine());
    
    System.out.println("segon?");
    int segon = Integer.parseInt(Entrada.readLine());
    
    int inicial = 0;
    int resultat = 0;
    
        for (int numero = primer;
            numero<=segon;
            numero ++){
                
                resultat = inicial + numero;
                System.out.println("" + inicial + " + " + "" + numero + " = " + resultat);
                inicial = resultat;
        }
    
    }
}

/*
 * Programa que demana dos valors i sumarà tots els nombres que hi hagi entre els dos, incloent-los.
 * Els valors d'entrada seràn enters.
 */
public class SumaInterval{
    public static void main (String [] args){
    
    int valorGran = 0; // Variable auxiliar
    int valorPetit= 0;
    
    System.out.println("primer?");
    int primer = Integer.parseInt(Entrada.readLine());
    
    System.out.println("segon?");
    int segon = Integer.parseInt(Entrada.readLine());
    
        if (segon > primer) {
            valorGran = segon;
            valorPetit = primer;
        }
        else{
            valorGran = primer;
            valorPetit = segon;
        }
    
    int inicial = 0;
    int resultat = 0;
    
        for (int numero = valorPetit; numero<=valorGran; numero ++){
                
                resultat = inicial + numero;
                System.out.println("" + inicial + " + " + "" + numero + " = " + resultat);
                inicial = resultat;
        }
    
    }
}

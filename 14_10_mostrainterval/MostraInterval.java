/*
 * Programa que demana dos valors i mostrarà tots els nombres que hi hagi entre els dos, incloent-los.
 * Els valors d'entrada seràn enters.
 */
public class MostraInterval{
    public static void main (String [] args){
    
    int valorGran = 0; // Variable auxiliar
    int valorPetit= 0; // Variable auxiliar
    
    System.out.println("inici?");
    int primer = Integer.parseInt(Entrada.readLine());
    
    System.out.println("final?");
    int segon = Integer.parseInt(Entrada.readLine());
    
        if (segon > primer) {
            for (int numero = primer; numero<=segon; numero ++){
                System.out.println(numero);
            }
        }
        else{
            for (int numero = primer; numero>=segon; numero --){
                System.out.println(numero);
            }
        }  
    }
}

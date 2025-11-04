/*
 * Programa que va demanant números de forma creixent, de manera que quan s'introdueix un número que no és més gran que l'anterior, el programa s'acaba.
 * Al finla del programa s'indica el númer d'entrades que s'han fet.
 */
public class SequenciaCreixent{
    public static void main (String [] args){
    
        int NumEntrades = 0;
        
        int valorAnterior = 0;
        
        System.out.println("Introdueix un valor:");
        int valorPosterior = Integer.parseInt(Entrada.readLine());
        
        do{
        
            NumEntrades ++;
        
            if (valorAnterior < valorPosterior){
                valorAnterior = valorPosterior;
            }
        
        System.out.println("Introdueix un valor:");
        valorPosterior = Integer.parseInt(Entrada.readLine());
        
        } while (valorAnterior < valorPosterior);
    
    System.out.println("Longitud de la seqüència creixent: " + NumEntrades);
    
    }
}

/*
 * El programa demana a l'usuario quants valors vol introduir. Després es llegirà els valors indicats. Finalment, mostrarà els valors separats per comes.
 */
public class EntersEntreComes{
    public static void main (String [] args){
    
    System.out.println("Quants?");
    int quantitat = Integer.parseInt(Entrada.readLine());
    
    int cont = 0;
    
    if (quantitat>0){
    int[] valors;
    valors = new int [quantitat];
       
    while (cont<quantitat){
        System.out.println("Valor "+ (cont+1) + "?");
        int numero = Integer.parseInt(Entrada.readLine());
        
        valors[cont] = numero;
        
        cont ++;
    }
        
        System.out.print(valors[0]);
        for (int i = 1; i < valors.length; i++) {
            System.out.print(", " + valors[i]);
        }
        System.out.println();
    }
    }
}

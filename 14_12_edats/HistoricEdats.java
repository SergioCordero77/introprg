/*
 * El programa demanará el nom d'una persona, la seva edat, i l'any actual. El programa escriurà l'edat que tenia aquella persona cada any des del seu neixement. 
 * Al final el programa s'acomiadarà de la persona dient "Adéu 'nom'".
 */
public class HistoricEdats{
    public static void main (String[] args) {
    
    System.out.println("nom?");
    String nom = Entrada.readLine();
    
    System.out.println("edat?");
    int edat = Integer.parseInt (Entrada.readLine());
    
    System.out.println("any actual?");
    int any = Integer.parseInt (Entrada.readLine());
    
    int anyNeixement = any - edat; //any de neixement
    
        if (!nom.isBlank() && edat>=0 && any>=1971) {
            for (int i = anyNeixement; i<any; i++){
            
                int edatAntiga = i - anyNeixement; // Resta per trobar l'edat que correspón segons l'any.
                
                    if (edatAntiga == 0){
                        System.out.print("El " + i + " vau néixer");
                    }
                    else if (edatAntiga == 1) {
                        System.out.print("El " + i + " teníeu " + edatAntiga + " any");
                    }
                    else {
                        System.out.print("El " + i + " teníeu " + edatAntiga + " anys");
                    }
        
                System.out.println();
            }
                System.out.println("Adéu " + nom);
        }
        else if (!nom.isBlank() && edat==0 && any>=1971) {
            System.out.println("Adéu " + nom);
        }
        else{
            System.out.println("Entrada incorrecta");
        }
    }
}

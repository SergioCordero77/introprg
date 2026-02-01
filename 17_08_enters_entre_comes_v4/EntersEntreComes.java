/*
 * El programa permetrà decidir quin és el caràcter de separació a mostrar entre els valors.

Per fer-ho, demanarà aquest caràcter i agafarà el primer caràcter que li introdueixin ignorant la resta. En cas que la cadena introduïda sigui buida, considerarà la coma.

La separació dels valors numèrics, la realitzarà un mòdul amb la següent signatura:

public static String entreComes(int[], char)
El primer paràmetre correspon amb l'array d'enters mentre que el segon indica el caràcter de separació entre un valor i el següent.

Malgrat el nostre programa no ho necessita, entreComes() serà capaç de funcionar correctament quan l'array estigui buit (és a dir, tingui longitud 0)

Com aquest mòdul pot ser útil en futures ocasions i retorna un String, de moment el posarem a UtilString

Ja no podem considerar que els valors que ens introdueixin els usuaris seran sempre adequats. Sort que tenim UtilString.esEnter() oi?

Podem seguir considerant que els valors d'entrada seran enters.

Considera les següents simulacions:

Quants?
cinc
Per favor, un valor enter
5
Separador?
; i la resta la pots ignorar
Valor 1?
1
Valor 2?
dos
Per favor, un valor enter
he dit 2
Per favor, un valor enter
2
Valor 3?
3
Valor 4?
4
Valor 5?
5
1; 2; 3; 4; 5
 */
public class EntersEntreComes{
    public static void main (String [] args){
    
    System.out.println("Quants?");
    String numeroEnter = Entrada.readLine();
    
    int quantitat = demanaEnter (numeroEnter);
    
    System.out.println("Separador?");
    String separador = Entrada.readLine();
        char c = ' ';
        
        if (separador.isEmpty()){
            c = ',';
        }
        else{
            c = separador.charAt(0);
        }
    
        int cont = 0;
    
        int[] valors;
        valors = new int [quantitat];
           
        while (cont<quantitat){
            System.out.println("Valor "+ (cont+1) + "?");
            String numero = Entrada.readLine();
            
            valors [cont] = demanaEnter (numero);
            
            cont ++;
        }
        
        System.out.println (UtilString.entreComes(valors, c));
    }
    
    public static int demanaEnter (String numeroEnter) {
        
        while (true){
        
            if (!UtilString.esEnter(numeroEnter)){
                System.out.println("Per favor, un valor enter");
            }
            else{
                break;
            }
            
            numeroEnter = Entrada.readLine();
        }
        
        int enter = Integer.parseInt(numeroEnter);
        
        return enter;
    
    }
    
    public static String entreComes(int[] valors, char separador){
    
        String resultatFinal = "" + valors[0];
        
        for (int i = 1; i < valors.length; i++) {
            resultatFinal += separador + " " + valors[i];
        }
        return resultatFinal;
    }
}

/*
 * Programa on s'ha d'endevinar el número pensat. El número pensat el passarem per la línia de comandes ( args[0] ). 
 Després el programa demanarà un número per comparar-lo amb el que hem donat al principi i veure si s'endivina o no. 
 Possibles respostes després de fer la comparació:
 - Si el valor que hem donat és més gran que el valor pensat: "Massa gran"
 - Si el valor que hem donat és més petit que el valor pensat: "Massa petit"
 - Si el valor que hem donat és 0 o menor o és més gran que 100: "Fora de rang"
 - Si el valor que hem donat és igual al valor pensat: "Encertat!"
 - Si el valor no es un enter: "Només digit"
 El programa podrá ser canel·lat quan l'usuari passi una cadena buida. la resposta que rebrem será:
 - "Cancel·lat!"
 */
public class EndevinaNombre {
    public static void main (String [] args){
    
    int numeroEndevinar = Integer.parseInt (args[0]);
    
    System.out.println ("Nombre?");
    String textNumero = Entrada.readLine();
    
    boolean endevinat = false;
    
        while (!textNumero.isEmpty()) {        
            
            for(int i=0; i<textNumero.length(); i++){
                char c = textNumero.charAt(i);
                
                if (!Character.isDigit(c)){
                    System.out.println("Només nombres");
                    break;
                }
                else{
                    int numero = Integer.parseInt(textNumero);
            
                    if (numero > 100 || numero <= 0) {
                        System.out.println ("Fora de rang");
                        break;   
                    }
                    else if (numero > numeroEndevinar) {
                        System.out.println ("Massa gran");
                        break;
                    }
                    else if (numero == numeroEndevinar){
                        endevinat = true;
                        System.out.println ("Encertat!");
                        return;
                    }
                    else{
                        System.out.println ("Massa petit");
                        break;
                    }
                }
            }
                
            if (!endevinat){    
                System.out.println ("Nombre?");
                textNumero = Entrada.readLine();      
            }
        }
        
            System.out.println ("Cancel·lat!");

    }
}

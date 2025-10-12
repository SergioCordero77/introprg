/*
 * Programa que del metge virtual "especialista" en refredats.
 * Segons els nostres símptomes, el metge ens recomenarà diferents tractaments.
 */
public class Metge {
    public static void main (String[] args) {
        
        System.out.println ("Estornuts? (sí o no)");
        String resposta = Entrada.readLine();    
        
        if (resposta.equals("sí")) {
            System.out.println ("Mal de cap? (sí o no)");
            resposta = Entrada.readLine();
        
            if (resposta.equals ("sí")) {
                System.out.println ("Problemes d'estómac? (sí o no)");
                resposta = Entrada.readLine();
                    if (resposta.equals ("sí")) {
                        System.out.println ("Pren un paracetamol.");
                    }
                    else if (resposta.equals ("no")) {
                        System.out.println ("Pren una aspirina.");
                    }
            }
            else if (resposta.equals("no")) {
            System.out.println ("Tos? (sí o no)");
            resposta = Entrada.readLine();
            
                if (resposta.equals ("sí") ) {
                    System.out.println ("Edat?");
                    int edat = Integer.parseInt(Entrada.readLine());
                
                    if (edat<12) {
                        System.out.println ("Pren un caramel de mel");
                    }
                    else if (edat>=12) {
                        System.out.println ("Pren un caramel d'eucaliptus");
                    }
                }   
                else {
                        System.out.println ("Vine a la consulta");
                }
            }
        }  
        else if (resposta.equals("no")) {
            System.out.println ("Tos? (sí o no)");
            resposta = Entrada.readLine();
            
            if (resposta.equals ("sí") ) {
                System.out.println ("Edat?");
                int edat = Integer.parseInt(Entrada.readLine());
            
                if (edat<12) {
                    System.out.println ("Pren un caramel de mel");
                }
                else if (edat>=12) {
                    System.out.println ("Pren un caramel d'eucaliptus");
                }
            }    
            else {
                    System.out.println ("Vine a la consulta");
            }                
        }
    }
}

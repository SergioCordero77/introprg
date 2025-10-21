/*
 * Programa que del metge virtual "especialista" en refredats.
 * Segons els nostres símptomes, el metge ens recomenarà diferents tractaments.
 */
public class Metge {
    public static void main (String[] args) {
        
        String recomanacio = "";
        
        boolean pastilles = true; 
        
        System.out.println ("Esternuts? (sí o no)");
        String resposta = Entrada.readLine();    
        
        if (resposta.equals("sí")) {                                        //Esternuts = sí
            System.out.println ("Mal de cap? (sí o no)");
            resposta = Entrada.readLine();
        
            if (resposta.equals ("sí")) {                                   //Mal de cap = sí
                System.out.println ("Problemes d'estómac? (sí o no)");
                resposta = Entrada.readLine();
                    if (resposta.equals ("sí")) {                           //Mal d'estomac = sí
                        recomanacio = "Pren paracetamol";
                    }
                    else if (resposta.equals ("no")) {                      //Mal d'estomac = no
                        recomanacio = "Pren aspirina";
                    }
            }
            else if (resposta.equals("no")) {                               //Mal de cap = no
                pastilles = false;
            }
        }  
        else if (resposta.equals("no")) {                                   //Esternuts = no
            pastilles = false;
        }
        
        if (!pastilles) {       
            System.out.println ("Tos? (sí o no)");
            resposta = Entrada.readLine();
            
            if (resposta.equals ("sí") ) {
                System.out.println ("Edat?");
                int edat = Integer.parseInt(Entrada.readLine());
            
                if (edat<12) {
                    recomanacio = "Pren un carmel de mel";
                }
                else if (edat>=12) {
                    recomanacio = "Pren un carmel d'eucaliptus";
                }
            }    
            else {
                    recomanacio = "Vine a la consulta";
            }
        }
            
        System.out.println (recomanacio);
    }
}

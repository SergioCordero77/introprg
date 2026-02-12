public class prova {
     public static void main (String [] args){
        
        String text = Entrada.readLine();
        
        int cont = 0;
        
        boolean dinsParaula = false;
        boolean hihaEspai = false;
        
        for (int i = 0; i<text.length(); i++){
            char c = text.charAt(i);
            
                if (!Character.isWhitespace(c) && !dinsParaula){
                    dinsParaula = true;
                    hihaEspai = false;
                    cont ++;
                }
                else if (Character.isWhitespace(c)){
                    if (hihaEspai){
                        continue;
                    }

                    dinsParaula = false;
                    hihaEspai = true;
                    cont ++; 
                }
        }
        
        String[] cadenaParaules = new String [cont];
          
        int inici = 0;
        
        boolean ultimaLletra = false;
        
        for (int i = 0; i<cont; i++){
        
        String paraula ="";       
           
            for (int j = inici; j<text.length(); j++){
                char c = text.charAt(j);
                inici ++;
                
                
                    if (j<text.length()-2){
                    char cPost = text.charAt(j + 1);
                    
                    // Detecció de la última lletra
                    if (!Character.isWhitespace(c) && Character.isWhitespace(cPost)){
                        paraula += c;
                        break;
                        
                    }
                    
                    // Detecció de l'últim espai
                    if (Character.isWhitespace(c)){
                        if (Character.isWhitespace(c) && !Character.isWhitespace(cPost)){
                            
                            paraula += c;
                            break;
                        }
                        else{
                            paraula += c;
                            continue;
                        }
                    }
                }
                
                paraula += c;

            }
            
            cadenaParaules [i] = paraula; 
        }
    
     for (int i = 0; i<cadenaParaules.length; i++){
        System.out.println("- \"" + cadenaParaules[i] + "\"");
     }    
        
     }
} 

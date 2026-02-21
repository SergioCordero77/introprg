public class CadenaContinua{
    public static void main (String [] args){
    System.out.println("Text?");
    String text = Entrada.readLine();
    
        if (text.isBlank()){
            System.out.println("error");    
        }
        else{
            System.out.println("Nombre?");
            String nombre = Entrada.readLine();        
            
            /*String numero = "";
            
                for (int i = 0; i<nombre.length(); i++){
                    char c = nombre.charAt (i);
                
                    if (!Character.isDigit(c)){
                        System.out.println("error");
                        return;
                    }
                    else{
                        numero += c;
                    }
                }*/
                
                if (UtilString.esEnter(nombre) /*&& UtilString.aEnter(nombre) >= 0*/){
                    System.out.println(UtilString.cadenaContinua(text, UtilString.aEnter(nombre)));
                }
                else{
                    System.out.println("error");
                }
                
                
            
            /*System.out.println(UtilString.cadenaContinua(text,Integer.parseInt(numero)));*/
    
        }
    }
}

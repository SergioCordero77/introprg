public class CadenaContinua{
    public static void main (String [] args){
    System.out.println("Text?");
    String text = Entrada.readLine();
    
        if (text.isBlank()){
            System.out.println("ERROR: el text no conté caràcters no blancs");    
        }
        else{
            System.out.println("Nombre?");
            String nombre = Entrada.readLine();
            
            String numero = "";
            
                for (int i = 0; i<nombre.length(); i++){
                    char c = nombre.charAt (i);
                
                    if (!Character.isDigit(c)){
                        System.out.println("error");
                        return;
                    }
                    else{
                        numero += c;
                    }
                }
            
            System.out.println(UtilString.cadenaContinua(text,Integer.parseInt(numero)));
    
        }
    }
}

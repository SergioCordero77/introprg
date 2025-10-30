public class lahora {
    public static void main (String [] args){
    
    String hora = Entrada.readLine();
    
    if (hora.length() > 6 )
        System.out.println("ERROR");
        
    else if (hora.isBlank()){
        System.out.println("00:00:00");
    }        
    else{
        if (hora.length() == 1 && 
            Character.isDigit(hora.charAt(0))){
            
            char c0 = hora.charAt(0);
            
            System.out.println("00:00:0" + c0);
        }
        else if (hora.length() == 2 && 
                Character.isDigit(hora.charAt(0)) && Character.isDigit(hora.charAt(1)) &&
                (hora.charAt(0)-'0')<6){
                
            char c0 = hora.charAt(0);
            char c1 = hora.charAt(1);
            
            System.out.println("00:00:" + c0 + c1);
        }
        else if (hora.length() == 3 && 
                Character.isDigit(hora.charAt(0)) && Character.isDigit(hora.charAt(1)) && Character.isDigit(hora.charAt(2)) &&
                (hora.charAt(1)-'0')<6){
            
            char c0 = hora.charAt(0);
            char c1 = hora.charAt(1);
            char c2 = hora.charAt(2);
            
            System.out.println("00:0" + c0 + ":" + c1 + c2);
        }
        else{
            System.out.println("ERROR");
        }
    }
    }
}

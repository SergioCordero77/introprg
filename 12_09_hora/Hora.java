/*
 * Programa que codififa una hora en 
 * format digital.
 */
public class Hora {
    public static void main (String [] args){
    
    String hora = Entrada.readLine();
    
    if (hora.length() < 0 && hora.length() > 6 )
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
        else if (hora.length() == 4 && 
                Character.isDigit(hora.charAt(0)) && Character.isDigit(hora.charAt(1)) && Character.isDigit(hora.charAt(2)) && Character.isDigit(hora.charAt(3)) &&
                (hora.charAt(0)-'0')<6 && (hora.charAt(2)-'0')<6){
            
            char c0 = hora.charAt(0);
            char c1 = hora.charAt(1);
            char c2 = hora.charAt(2);
            char c3 = hora.charAt(3);
                
            System.out.println("00:"+ c0 + c1 + ":" + c2 + c3);
        }
        else if (hora.length() == 5 && 
                Character.isDigit(hora.charAt(0)) && Character.isDigit(hora.charAt(1)) && Character.isDigit(hora.charAt(2)) && Character.isDigit(hora.charAt(3)) && Character.isDigit(hora.charAt(4)) &&
                (hora.charAt(1)-'0')<6 && (hora.charAt(3)-'0')<6){
            
            char c0 = hora.charAt(0);
            char c1 = hora.charAt(1);
            char c2 = hora.charAt(2);
            char c3 = hora.charAt(3);
            char c4 = hora.charAt(4);
                
            System.out.println("0" + c0 + ":"+ c1 + c2 + ":" + c3 + c4);
        }
        else if (hora.length() == 6 && 
                Character.isDigit(hora.charAt(0)) && Character.isDigit(hora.charAt(1)) && Character.isDigit(hora.charAt(2)) && Character.isDigit(hora.charAt(3)) && Character.isDigit(hora.charAt(4)) && Character.isDigit(hora.charAt(5)) &&
                (hora.charAt(0)-'0')<2 && (hora.charAt(2)-'0')<6 && (hora.charAt(4)-'0')<6){
            
            char c0 = hora.charAt(0);
            char c1 = hora.charAt(1);
            char c2 = hora.charAt(2);
            char c3 = hora.charAt(3);
            char c4 = hora.charAt(4);
            char c5 = hora.charAt(5);
                
            System.out.println("" + c0 + c1 + ":"+ c2 + c3 + ":" + c4 + c5); 
        }
        else if (hora.length() == 6 && 
                Character.isDigit(hora.charAt(0)) && Character.isDigit(hora.charAt(1)) && Character.isDigit(hora.charAt(2)) && Character.isDigit(hora.charAt(3)) && Character.isDigit(hora.charAt(4)) && Character.isDigit(hora.charAt(5)) &&
                (hora.charAt(0)-'0')<3 && (hora.charAt(1)-'0')<4 && (hora.charAt(2)-'0')<6 && (hora.charAt(4)-'0')<6){
            
            char c0 = hora.charAt(0);
            char c1 = hora.charAt(1);
            char c2 = hora.charAt(2);
            char c3 = hora.charAt(3);
            char c4 = hora.charAt(4);
            char c5 = hora.charAt(5);
                
            System.out.println("" + c0 + c1 + ":"+ c2 + c3 + ":" + c4 + c5);
        }
        else{
            System.out.println("ERROR");
        }
    }
    }
}

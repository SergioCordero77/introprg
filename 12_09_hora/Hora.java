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
        
        char c0 = hora.charAt(0);
        char c1 = hora.charAt(1);
        char c2 = hora.charAt(2);
        char c3 = hora.charAt(3);
        char c4 = hora.charAt(4);
        char c5 = hora.charAt(5);
        
        int valor = Integer.parseInt(hora);
        
        if (hora.length() == 1 && 
            Character.isDigit(c0)){
            System.out.println("00:00:0" + c0);
        }
        else if (hora.length() == 2 && 
                Character.isDigit(c0) && Character.isDigit(c1) &&
                c1<6){
            System.out.println("00:00:" + c0 + c1);
        }
        else if (hora.length() == 3 && 
                Character.isDigit(c0) && Character.isDigit(c1) && Character.isDigit(c2) &&
                c1<6){
            System.out.println("00:0" + c0 + ":" + c1 + c2);
        }
        else if (hora.length() == 4 && 
                Character.isDigit(c0) && Character.isDigit(c1) && Character.isDigit(c2) && Character.isDigit(c3) &&
                c1<6 && c3<6){
            System.out.println("00:"+ c0 + c1 + ":" + c2 + c3);
        }
        else if (hora.length() == 5 && 
                Character.isDigit(c0) && Character.isDigit(c1) && Character.isDigit(c2) && Character.isDigit(c3) && Character.isDigit(c4) &&
                c1<6 && c3<6){
            System.out.println("0" + c0 + ":"+ c1 + c2 + ":" + c3 + c4);
        }
        else if (hora.length() == 6 && 
                Character.isDigit(c0) && Character.isDigit(c1) && Character.isDigit(c2) && Character.isDigit(c3) && Character.isDigit(c4) && Character.isDigit(c5) &&
                c1<6 && c3<6 && c5<=2){
            System.out.println(c0 + c1 + ":"+ c2 + c3 + ":" + c4 + c5);
        }
        else{
            System.out.println("ERROR");
        }
    }
    }
}

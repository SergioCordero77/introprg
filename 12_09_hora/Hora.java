/*
 * Programa que codififa una hora en 
 * format digital.
 */
public class Hora {
    public static void main (String [] args){
    System.out.println("00:00:00");
    String hora = Entrada.readLine();
    
    if (hora.length() != 6)
        System.out.println("ERROR");
        
    else if (hora.isBlank()){
        hora="0";
    }
    else{
        
        char c0 = hora.charAt(0);
        char c1 = hora.charAt(1);
        char c2 = hora.charAt(2);
        char c3 = hora.charAt(3);
        char c4 = hora.charAt(4);
        char c5 = hora.charAt(5);
        
        int valor = Integer.parseInt(hora);
        
        if ((c5<=1 && c4<=9 && c3<6 && c2<=9 && c1<6 && c0<=9) ||
            (c5==2 && c4<=3 && c3<6 && c2<=9 && c1<6 && c0<=9)){
           
            System.out.println(c5 + c4 + ":" + c3 + c2 + ":" + c1 + c0);
        }
        else{
            System.out.println("ERROR");
        }
    }
    }
}

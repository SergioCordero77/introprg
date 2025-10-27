/*
 * Programa que codififa una hora en 
 * format digital.
 */
public class Hora {
    public static void main (String [] args){
    System.out.println("Hora?");
    String hora = Entrada.readLine();
    int valor = Integer.parseInt(hora);
    
    if (hora.isBlank()){
        System.out.println("ERROR");
    }
    else{
        if (valor <= 9){
            System.out.println("00:00:0"+hora);
        }
        else if (valor <= 59){
            System.out.println("00:00:"+hora);
        }
        else if (valor <= 959){
            char c0 = hora.charAt(0);
            char c1 = hora.charAt(1);
            char c2 = hora.charAt(2);
            System.out.println("00:0"+c0+":"+c1+c2);
        }
        else if (valor <= 5959){
            char c0 = hora.charAt(0);
            char c1 = hora.charAt(1);
            char c2 = hora.charAt(2);
            char c3 = hora.charAt(3);
            System.out.println("00:"+c0+c1+":"+c2+c3);
        }
        else if (valor <= 95959){
            char c0 = hora.charAt(0);
            char c1 = hora.charAt(1);
            char c2 = hora.charAt(2);
            char c3 = hora.charAt(3);
            char c4 = hora.charAt(4);
            System.out.println("0"+c0+":"+c1+c2+":"+c3+c4);
        }
        else if (valor <= 235959){
            char c0 = hora.charAt(0);
            char c1 = hora.charAt(1);
            char c2 = hora.charAt(2);
            char c3 = hora.charAt(3);
            char c4 = hora.charAt(4);
            char c5 = hora.charAt(5);
            System.out.println(c0+c1+":"+c2+c3+":"+c4+c5);
        }
        else{
            System.out.println("ERROR");
        }
    }
    }
}

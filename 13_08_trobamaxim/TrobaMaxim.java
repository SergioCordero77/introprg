/*
 * Programa que demana números enters fins que rep un número negatiu.
 * En el moment que rep un número negatiu, el programa s'atura i dona com a resultat el número máxim positiu donat fins el moment.
 */
public class TrobaMaxim {
    public static void main (String [] args){
    
    System.out.println("Introdueix un valor");
    int valor = Integer.parseInt (Entrada.readLine());
    
    int maxim = 0;
    
    while (valor > 0){
    
        if (valor > maxim){
            maxim = valor;
        }
    
    System.out.println("Introdueix un valor");
    valor = Integer.parseInt (Entrada.readLine());
    }
    
    System.out.println("El màxim és " + maxim);
    
    }
}

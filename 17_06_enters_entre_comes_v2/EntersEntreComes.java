/*
 * Una nova versió del programa enters entre comes.

En aquesta ocasió, el programa tindrà les següents modificacions:

Els valors de l'array en comptes de ser assignats des del programa, els especificaran els usuaris del programa.

De moment suposarem que els valors d'entrada són sempre enters vàlids.

En comptes de 3 valors a l'array, n'hi haurà 5

Una simulació d'execució seria:

Valor 1?
1
Valor 2?
2
Valor 3?
3
Valor 4?
4
Valor 5?
5
1, 2, 3, 4, 5
 */
public class EntersEntreComes{
    public static void main (String [] args){
    
    System.out.println("Valor 1?");
    int valor1 = Integer.parseInt(Entrada.readLine());
    
    System.out.println("Valor 2?");
    int valor2 = Integer.parseInt(Entrada.readLine());
    
    System.out.println("Valor 3?");
    int valor3 = Integer.parseInt(Entrada.readLine());
    
    System.out.println("Valor 4?");
    int valor4 = Integer.parseInt(Entrada.readLine());
    
    System.out.println("Valor 5?");
    int valor5 = Integer.parseInt(Entrada.readLine());
    
        int[] valors;
        valors = new int [5];
        
        valors[0] = valor1;
        valors[1] = valor2;
        valors[2] = valor3;
        valors[3] = valor4;
        valors[4] = valor5;
        
        System.out.print(valors[0]);
        for (int i = 1; i < valors.length; i++) {
            System.out.print(", " + valors[i]);
        }
        System.out.println();
    }
}

/*
 * Programa que demana un valor per línia de comandes i aquest valor determinarà el nombre de valors que s'imprimiran de forma ascendent i només imprimirà valors parells seran valors parells. Aquest cop am "for".
 */
public class NaturalsParells {
    public static void main (String [] args){
    
    int numeroFi = Integer.parseInt(args[0]);   // Declaració de la variable que serà el número final
    int numero = 2;                             // Declaració dels números que es sumarán de 2 en 2 per donar els números parells
    
    if (numeroFi < 1){  // Si el número final és més petit que 1, el programa no funcionarà
        System.out.println("Cap valor parell creixent entre 1 i " + numeroFi);
    }
    else{   // Si el valoer es major que 1, el programa començarà i entrarà al bucle
        for (int fi = numeroFi;     // Inicialitzacó de la variable
            numero <= fi;           // Condició
            numero = numero + 2){   // Actualització del numero
 
            System.out.println(numero); //Resultat final
        
        }
    }
    }
}

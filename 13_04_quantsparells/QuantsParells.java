/*
 * Programa que demana números positius i quan rebi un número negatiu, el programa finalitzarà i 
 * enseñarà quants números parells s'han introduït.
 */
public class QuantsParells {
    public static void main(String[] args) {
        
        int suma = 0;   //Declarem i inicialitzem variable suma per poderla utilitzar al while
        
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());   //Introduïm el primer valor
        
        while (valor >= 0){
            
            if (valor%2 == 0){      //Amb el residu 0 agafem els valors parells
            suma = suma + 1;        //Fem la suma dels valors parells. Cada vegada que hi hagi un valor parell li sumem +1 a la suma.
            }
            System.out.println("Introdueix un valor");  //Tornem a preguntar pel valor per seguir amb el bucle
            valor = Integer.parseInt(Entrada.readLine());
        }
              
        System.out.println ("Nombre de parells introduïts: " + suma);
    }
}

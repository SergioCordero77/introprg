/*
 * El programa començarà demanant un "àncora" que serà el valor de referencia per saber quin serà el valor més próxim.
 Tant l'àncora com els valors introduits han de ser enters positius. Si l'àncora té un número negatiu el programa finalitzarà. 
 El programa anirà demanant números fins que es doni un número negatiu. Això farà que s'aturi el programa i donarà el resultat, el valor més proper a l'àncora. En cas que hi hagi dos o més valors que estiguin a la mateixa distància, el programa es quedarà amb el valor més petit, per exemple:
 - Àncora = 32
 - Valors donats = 31 i 33
 Els dos valors estàn a la mateixa distancia (diferencia de 1). En aquest cas el programa es quedaría amb el 31.
 */
public class TrobaMesProxim{
    public static void main (String [] args){
    
    //Introduïm àncora
    System.out.println("Introdueix l'àncora");
    int ancora = Integer.parseInt(Entrada.readLine());
    
    
    if (ancora < 0) { // si té un valor negatiu, acaba el programa
        System.out.println("Àncora no vàlida");
    }
    else { // si té un valor possitiu, el programa pot començar
        //Introduïm el primer valor
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());
        
        //Declarem les variables per fer-les servir més endavant al bucle
        int valorProxAsc = 101;
        int valorProxDesc = valor;
        int valorExacte = 0;
            
            if (valor<0){ // si té un valor negatiu, acaba el programa
                System.out.println("No s'ha introduït cap valor positiu");
            }
            else{ // Si el valor es possitiu, pot començar el bucle
            
                boolean numeroExacte = false; //Declarem un boolean que diu que es false que hem trobat el valor exacte
            
                while (valor>=0){ // Mentre el valor sigui positiu o menor de 100, el bucle funcionarà
                
                    if (valor<ancora){ // Part que analitza els valors menors de ancora
                        if (ancora-valor<ancora-valorProxDesc){
                            valorProxDesc = valor; // Si la diferencia entre el l'ancora i el valor és menor que la diferencia entre l'àncora i el valorProxDesc, el transformem en aquest per poder-lo tornar a comparar després
                        }
                    }
                    else if (valor>ancora){ // Part que analitza els valors majors de ancora
                        if (valor-ancora<valorProxAsc-ancora){ 
                            valorProxAsc = valor; // Si la diferencia entre el valor i l'ancora és menor que la diferencia entre el valorProxAsc i l'àncora, el transformem en aquest per poder-lo tornar a comparar després
                        }
                    }
                    else { // Part que analitza si el valor és igual a l'àncora
                        numeroExacte = true; //canviem el boolean a True
                        valorExacte = valor; // Si el valor es igual a l'àncora, el transformem en el valorExacte per poder-lo tornar a comparar després
                    }
                    
                    System.out.println("Introdueix un valor"); // Tornem a demanar el valor per continuar amb el bucle
                    valor = Integer.parseInt(Entrada.readLine());
                
                }
                    // RESULTATS FINALS
                    if (numeroExacte){
                        System.out.println("El valor introduït més pròxim a " + ancora + " és " + valorExacte); // Si el valor és exacte el valor més pròxim serà el valorExacte
                    }
                    else if ((ancora-valorProxDesc)<(valorProxAsc-ancora)){
                    System.out.println("El valor introduït més pròxim a " + ancora + " és " + valorProxDesc); // Si la diferencia (resta de ancora-valorProxDesc) és més petita que la diferencia (resta valorProxAsc-ancora) el valor més pròxim serà valorProxDesc
                     }
                    else if ((ancora-valorProxDesc)>(valorProxAsc-ancora)){
                        System.out.println("El valor introduït més pròxim a " + ancora + " és " + valorProxAsc); // Si la diferencia (resta de ancora-valorProxDesc) és més gran que la diferencia (resta valorProxAsc-ancora) el valor més pròxim serà valorProxAsc
                    }
                    else{
                        System.out.println("El valor introduït més pròxim a " + ancora + " és " + valorProxDesc); // Si la diferencia (resta de ancora-valorProxDesc) és igual a la diferencia (resta valorProxAsc-ancora) el valor més pròxim serà valorProxDesc
                    }
            }    
    }   
    }
}

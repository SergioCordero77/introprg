/*
 * Programa que va demanant texts, aquest indicarà si correspón o no a un nombre enter escrit amb dígits. Si el primer caràceter és un + o -, el nombre seguirá sent un nombre enter.
 * El programa finalitzarà quan rebi una cadena buida.
 *
 * Aquest cop es farà de la següent manera:
 - La comprovació de si una cadena correspon o no a un enter, la realitzarà una funció anomenada UtilString.esEnter(), que rebrà el text corresponent i retornarà un booleà amb el resultat corresponent.

- El programa EsEnter indicarà que són enters vàlids aquelles cadenes que la funció esEnter() també indicaria que ho són, i també, aquelles altres cadenes que esEnter() hagués considerat com a vàlides si ignorés espais en blanc a inici i final de la cadena.
 */
public class EsEnter{
    public static void main (String [] args){
    
    System.out.println("Introdueix els texts a analitzar:");
    String text = Entrada.readLine();
    
    String textNet = UtilString.normalitzaBlancs(text);
    
    while (!text.isEmpty()){
        
        if (UtilString.esEnter(textNet)){
            System.out.println("\"" + text + "\" és enter");
        }
        else {
            System.out.println("\"" + text + "\" no és enter");
        }
        
        text = Entrada.readLine(); 
    }
    
    System.out.println("Adéu");
    
    }
}

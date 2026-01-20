/*
 * Programa que codifica un text.
 Es demana un text i un número, el número determinará quants caràcters ha de saltar.
 La codificació es realitzarà dins del grup de cada caràcter. És a dir, si el caràcter és una lletra minúscula, el resultat serà una altra lletra minúscula. El mateix passarà si és una majúscula o un número.
 
 Simulació:
 Text?
 Avui estem a dia 19
 Index?
 2
 Cxwk guvgo c fkc 32
 */
public class Codifica {
    public static void main (String [] args){
        
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        System.out.println("Index?");
        int index = Integer.parseInt(Entrada.readLine());
        
        if (index<0){
            index = 0;
        }
        
        System.out.println(mostraCodificat(text, index));
        
    }
        
    public static String mostraCodificat(String text, int index){
        String textCodificat = "";
        
        for (int i=0; i<text.length(); i++){
        
            char c = text.charAt(i);

            if (c >= 'a' && c <= 'z'){
                
                c = (char)('a'+(c-'a'+index)%26);
                
                textCodificat += c; 
            }
            
           if (c >= 'A' && c <= 'Z'){
                
                 c = (char)('A'+(c-'A'+index)%26);
                 
                 textCodificat += c;  
            }
            
           if (Character.isDigit(c)){

                c = (char)('0'+(c-'0'+index)%10);
                
                textCodificat += c;
            }
            
            if (Character.isWhitespace(c) || (!Character.isLetter(c) && !Character.isDigit(c))){
                
                textCodificat += c;
            }
            
        }     
        return textCodificat;
    }
}

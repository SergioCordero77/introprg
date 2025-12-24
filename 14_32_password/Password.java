/*
 * Programa anomenat Password que demana una contrasenya i digui si és vàlida o no segons els següents criteris:

- Té una llargària mínima de 8 caràcters i màxima de 16

- Ha de contenir un mínim d'un número

- Ha de contenir un mínim d'una lletra majúscula

- Ha de contenir un mínim d'una lletra minúscula. Considera que una lletra és minúscula si no és majúscula.

- Ha de contenir un mínim d'un símbol

- El nombre de lletres majúscules no pot ser inferior al de minúscules

- No pot contenir espais en blanc

- No es poden repetir caràcters excepte si són vocals (a,e,i,o,u)

- No poden ser més de 4 caràcters seguits del mateix tipus. Els tipus són números, lletres majúscules, lletres minúscules i símbols. Ex. "91235a!A" no és vàlid perquè té més de quatre dígits seguits.

- No poden contenir més de tres números consecutius. Ex. "1234Abc!" no es vàlid perquè inclou els números consecutius 1, 2, 3 i 4. Atenció: No es considera consecutius "8901", és a dir, no són consecutius circulars.
*/
public class Password{
    public static void main (String [] args){
    
    System.out.println("Contrasenya:");
    String text = Entrada.readLine();
    
    int contMajuscules = 0;
    int contMinuscules = 0;
    
    String cadenaCaracter = "";
    String nomesVocals = "";
    
    String vocals = "AEIOU";
    
    if (text.length()>=8 && text.length()<=16){
        
        boolean hihaDigit = false;
        boolean hihaMajuscula = false;
        boolean hihaMinuscula = false;
        boolean hihaSimbol = false;
        boolean nombreMajuscules = false;
        
        for (int i = 0; i<text.length(); i++){
            char c = text.charAt(i);
            
            if (Character.isDigit(c)){
                hihaDigit = true;        
            }
              
            if (Character.isUpperCase(c)){
                hihaMajuscula = true;
                contMajuscules ++;
            }
            
            if (Character.isLetter(c) && !Character.isUpperCase(c)){
                hihaMinuscula = true;
                contMinuscules ++;
            }
            
            if (!Character.isLetter(c) && !Character.isDigit(c) && !Character.isWhitespace(c)){
                hihaSimbol = true;
            }
            
            if (Character.isWhitespace (c)){
                System.out.println("Contrasenya no vàlida");
                return;
            } 
                
                char cMaj = Character.toUpperCase(c);
                
                boolean esVocal = false;
                
                for (int v = 0; v < vocals.length(); v++) {
                    if (cMaj == vocals.charAt(v)) {
                        esVocal = true;   
                    }
                }
                 
                    if (esVocal){
                        // Vocals repetides
                        boolean vocalRepetida = false;
                        for (int n = 0; n<nomesVocals.length(); n++){
                            if (cMaj==nomesVocals.charAt(n)){
                                vocalRepetida = true;
                                continue;
                            }
                        }
                            if (!vocalRepetida){
                                nomesVocals = nomesVocals + c;
                            }
                    }
                    else {
                        // Caracters repetits
                        boolean caracterRepetit = false;
                        for (int j=0; j<cadenaCaracter.length(); j++){
                            if(c == cadenaCaracter.charAt(j)){
                                caracterRepetit = true;
                                System.out.println("Contrasenya no vàlida");
                                return;
                            }
                        }
                            if (!caracterRepetit){
                                cadenaCaracter = cadenaCaracter + c;
                            } 
                    }                
            
             
            
        }
        
        if (contMajuscules >= contMinuscules){
                nombreMajuscules = true;
            }
        
        if (hihaDigit && hihaMajuscula && hihaMinuscula && hihaSimbol && nombreMajuscules){
            System.out.println("Contrasenya vàlida");
        }
        else{
            System.out.println("Contrasenya no vàlida");
        }
    }
    else{
        System.out.println("Contrasenya no vàlida");
    }
    
    }
}

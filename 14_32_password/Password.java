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
    
    String text = Entrada.readLine();
    
    int contMajuscules = 0;
    int contMinuscules = 0;
    int contMayusculesRep = 0;
    int contMinusculesRep = 0;
    int contSimbolsRep = 0;
    int contDigitsRep = 0;
    int contConsecutius = 1;

    char cAnt = ' ';
    
    String cadenaCaracter = "";
    String nomesVocals = "";
    
    String vocals = "AEIOU";
    
    if (text.length()>=8 && text.length()<=16){
        
        boolean hihaDigit = false;
        boolean hihaMajuscula = false;
        boolean hihaMinuscula = false;
        boolean hihaSimbol = false;
        boolean hihaEspai = false;
        
        boolean digitRepetit = false;
        boolean digitConsecutiu = false;
        boolean nombreMajuscules = false;
        boolean majusculaRepetida = false;
        boolean minusculaRepetida = false;
        boolean simbolRepetit = false;
        
        
        for (int i = 0; i<text.length(); i++){
            char c = text.charAt(i);
            
            // Conté digit
            if (Character.isDigit(c)){
                hihaDigit = true;
                
                // Increment de comptador
                contDigitsRep++;
                
                // Reinici de comptadors
                contMayusculesRep = 0;
                contMinusculesRep = 0;
                contSimbolsRep = 0;

                if (contDigitsRep > 4) {
                    digitRepetit = true;
                }

                // Dígits consecutius
                if (Character.isDigit(cAnt)) {
                    int numActual = c - '0';
                    int numAnterior = cAnt - '0';

                    if (numActual == numAnterior + 1) {
                        contConsecutius++;
                        if (contConsecutius > 3) {
                            digitConsecutiu = true;
                        }
                    } else {
                        contConsecutius = 1;
                    }
                } else {
                    contConsecutius = 1;
                }
            }
            
            // actualitzar carácter anterior
            cAnt = c;        

            // Conté Majúscula  
            if (Character.isLetter(c) && Character.isUpperCase(c)){
                hihaMajuscula = true;
                
                // Increment de comptadors
                contMajuscules ++;
                contMayusculesRep++;
                
                //Reinici de comptadors
                contMinusculesRep = 0;
                contSimbolsRep = 0;
                contDigitsRep = 0;
                contConsecutius = 1;

                if (contMayusculesRep > 4) {
                    majusculaRepetida = true;
                }
            }
            
            // Conté Minúscula
            if (Character.isLetter(c) && !Character.isUpperCase(c)){
                hihaMinuscula = true;
                
                // Increment de comptadors
                contMinuscules ++;
                contMinusculesRep++;
                
                // Reinici de comptadors
                contMayusculesRep = 0;
                contSimbolsRep = 0;
                contDigitsRep = 0;
                contConsecutius = 1;

                if (contMinusculesRep > 4) {
                    minusculaRepetida = true;
                }
            }
            
            // Conté Símbom
            if (!Character.isLetter(c) && !Character.isDigit(c) && !Character.isWhitespace(c)){
                hihaSimbol = true;
                
                //Increment de comptador
                contSimbolsRep++;
                
                // Reinici de comptadors
                contMayusculesRep = 0;
                contMinusculesRep = 0;
                contDigitsRep = 0;
                contConsecutius = 1;

                if (contSimbolsRep > 4) {
                    simbolRepetit = true;
                }
            }
            
            // Conté espais en blanc
            if (Character.isWhitespace (c)){
                hihaEspai = true;
            } 
            
            // Anàlisis de vocal repetida o qualsevol altre caràcter repetit    
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
        
        // RESULTATS
        
        // COMPROVACIÓ SI ESTÀN TOTS ELS ELEMENTS
        
        if (!hihaDigit) {
            System.out.println("El password ha de contenir com a mínim un numero.");
            return;
        }
        
        if (!hihaMajuscula) {
            System.out.println("El password ha de contenir com a mínim una lletra majúscula.");
            return;
        }
        
        if (!hihaMinuscula) {
            System.out.println("El password ha de contenir com a mínim una lletra minúscula.");
            return;
        }
        
        if (!hihaSimbol) {
            System.out.println("El password ha de contenir com a mínim un símbol.");
            return;
        }
        
        if (!nombreMajuscules) {
            System.out.println("El password no pot contenir menys majúscules que minúscules.");
            return;
        }
        
        // COMPROVACIÓ SI HI HA REPETICIÓ D'ELEMENTS
        
        if (digitRepetit) {
            System.out.println("El password no pot contenir numeros repetits.");
            return;
        }
        
        if (digitConsecutiu) {
            System.out.println("El password ha de contenir més de 3 números consecutius.");
            return;
        }
        
        if (majusculaRepetida) {
            System.out.println("El password no pot contenir una majúscula repetida.");
            return;
        }
        
        if (minusculaRepetida) {
            System.out.println("El password no pot contenir una minúscula repetida.");
            return;
        }
        
        // COMPROVCIÓ SI HI HA ESPAIS
        
        if (hihaEspai){   
            System.out.println("El password no pot contenir espais en blanc.");
            return;
        } 
        
        
        
        if (hihaDigit && hihaMajuscula && hihaMinuscula && hihaSimbol && nombreMajuscules){
            System.out.println("El Password és vàlid");
        }
        else{
            System.out.println("El Password no vàlid");
        }
    }
    else{
        System.out.println("El password ha de tenir entre 8 i 16 caràcters.");
    }
    
    }
}

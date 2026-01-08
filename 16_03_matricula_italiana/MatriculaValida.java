/*
 * Programa que valida si una matricula es vàlida. La matricula ha de tenir el següent format:
 Lletra majúscula-Lletra majúscula-Número-Número-Número-Lletra majúscula-Lletra majúscula
 Les lletres han de ser de l'abecedari llatí. Quedaràn excloses les lletres 'I','O','Q' i 'U'. 
 Exemple de matrícula vàlida:
    DD029YJ
 
 Es farà servir la funció esLletraValidaPerMatriculaItaliana() que rep un caràcter i retorna un booleà a cert quan el caràcter pot ser una lletra vàlida per una matrícula italiana.
 */
public class MatriculaValida { 
    public static void main (String [] args){ 
    
    System.out.println ("Introduïu una matrícula"); 
    String matricula = Entrada.readLine(); 
    
        if ((matricula.isEmpty()) || (Character.isWhitespace(matricula.charAt(0)))){ 
            System.out.println ("El text no té lletres"); 
        } 
        else if (matricula.length() != 7) { 
            System.out.println ("No és una matrícula italiana vàlida"); 
        } 
        else { 
            formatValid(matricula); 
        } 
        
        if (formatValid(matricula)){ 
            System.out.println ("És una matrícula italiana vàlida"); 
        } 
        else { 
            System.out.println ("No és una matrícula italiana vàlida"); 
        } 
    }
    
    public static boolean formatValid (String matricula){
    
        char c0 = matricula.charAt(0);
        char c1 = matricula.charAt(1);
        char c2 = matricula.charAt(2);
        char c3 = matricula.charAt(3);
        char c4 = matricula.charAt(4);
        char c5 = matricula.charAt(5);
        char c6 = matricula.charAt(6);
            
        return  esLletraValidaPerMatriculaItaliana(c0) && esLletraValidaPerMatriculaItaliana (c1) && esLletraValidaPerMatriculaItaliana (c5) && esLletraValidaPerMatriculaItaliana (c6) &&
                esNumeroValidPerMatriculaItaliana(c2) && esNumeroValidPerMatriculaItaliana (c3) && esNumeroValidPerMatriculaItaliana (c4);
                
    }
    
    public static boolean esLletraValidaPerMatriculaItaliana(char c){
    
        return  Character.isLetter(c) && 
                Character.isUpperCase(c) &&
                c !='I' && c != 'O' && c != 'Q' && c != 'U' &&
                (c>='A' && c<='Z');
    
    }
    
    public static boolean esNumeroValidPerMatriculaItaliana(char c){         
        
        return  (Character.isDigit(c));

    }        
}

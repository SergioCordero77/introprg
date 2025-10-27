/*
 * Programa que mostra si la matricula introduida
 * és vàlida o no i dona informació adicional.
 */
public class MatriculaValidaAmpliada {
    public static void main (String [] args){
    
    System.out.println ("Introduïu una matrícula");
    String matricula = Entrada.readLine();
    
        if ((matricula.isBlank())){
            System.out.println ("El text no té lletres");
        }
        else if (matricula.length() < 7) {
            System.out.println ("No és una matrícula italiana vàlida: massa curta");
        }
        else if (matricula.length() > 7) {
            System.out.println ("No és una matrícula italiana vàlida: massa llarga");
        }
        else {
            char c0 = matricula.charAt(0);
            char c1 = matricula.charAt(1);
            char c2 = matricula.charAt(2);
            char c3 = matricula.charAt(3);
            char c4 = matricula.charAt(4);
            char c5 = matricula.charAt(5);
            char c6 = matricula.charAt(6);
        
            if  ((Character.isLetter(c0)) && (Character.isLetter(c1)) && (Character.isDigit(c2)) && (Character.isDigit(c3)) && (Character.isDigit(c4)) && (Character.isLetter(c5)) && (Character.isLetter(c6)) && 
                (Character.isUpperCase(c0)) && (Character.isUpperCase(c1)) && (Character.isUpperCase(c5)) && (Character.isUpperCase(c6)) && 
                c0 !='I' && c0 != 'O' && c0 != 'Q' && c0 != 'U' && 
                c1 !='I' && c1 != 'O' && c1 != 'Q' && c1 != 'U' &&
                c5 !='I' && c5 != 'O' && c5 != 'Q' && c5 != 'U' &&
                c6 !='I' && c6 != 'O' && c6 != 'Q' && c6 != 'U' &&
                ((c0>='A') && (c0<='Z')) && ((c1>='A') && (c1<='Z')) && ((c5>='A') && (c5<='Z')) && ((c6>='A') && (c6<='Z'))
                ){
                
            System.out.println ("És una matrícula italiana vàlida");
        }
            else {
            System.out.println ("No és una matrícula italiana vàlida");
                if (Character.isLetter(c0) && Character.isUpperCase(c0) && c0 !='I' && c0 != 'O' && c0 != 'Q' && c0 != 'U' && c0 != 'Ñ' && (c0>='A') && (c0<='Z')){
                    System.out.println ((c0) + ": Correcte");
                }
                else if (Character.isLowerCase (c0)) {
                    System.out.println ((c0) + ": Ha de ser majúscula");
                }
                else {
                    System.out.println (c0 + ": Ha de ser una lletra");
                }
                if (Character.isLetter(c1) && Character.isUpperCase(c1) && c1 !='I' && c1 != 'O' && c1 != 'Q' && c1 != 'U' && c1 != 'Ñ' && (c1>='A') && (c1<='Z')){
                    System.out.println (c1 + ": Correcte");
                }
                else if (Character.isLowerCase (c1)) {
                    System.out.println ((c1) + ": Ha de ser majúscula");
                }
                else {
                    System.out.println (c1 + ": Ha de ser una lletra");
                }
                if (Character.isDigit(c2)){
                    System.out.println (c2 + ": Correcte");
                }
                else {
                    System.out.println (c2 + ": Ha de ser un dígit");
                }
                if (Character.isDigit(c3)){
                    System.out.println (c3 + ": Correcte");
                }
                else {
                    System.out.println (c3 + ": Ha de ser un dígit");
                }
                if (Character.isDigit(c4)){
                    System.out.println (c4 + ": Correcte");
                }
                else {
                    System.out.println (c4 + ": Ha de ser un dígit");
                }
                if (Character.isLetter(c5) && Character.isUpperCase(c5) && c5 !='I' && c5 != 'O' && c5 != 'Q' && c5 != 'U' && c5 != 'Ñ' && (c5>='A') && (c5<='Z')){
                    System.out.println (c5 + ": Correcte");
                }
                else if (Character.isLowerCase (c5)) {
                    System.out.println ((c5) + ": Ha de ser majúscula");
                }
                else {
                    System.out.println (c5 + ": Ha de ser una lletra");
                }
                if (Character.isLetter(c6) && Character.isUpperCase(c6) && c6 !='I' && c6 != 'O' && c6 != 'Q' && c6 != 'U' && c6 != 'Ñ' && (c6>='A') && (c6<='Z')){
                    System.out.println (c6 + ": Correcte");
                }
                else if (Character.isLowerCase (c6)) {
                    System.out.println ((c6) + ": Ha de ser majúscula");
                }
                else {
                    System.out.println (c6 + ": Ha de ser una lletra");
                }
            }
        }       
    }
}

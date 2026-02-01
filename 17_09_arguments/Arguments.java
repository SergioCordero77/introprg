/*
 * Programa que analitza els arguments que es passen per la linia de comandes i distingeix si són o no enters.
 */
public class Arguments{
    public static void main (String [] args){
    
    if (args.length == 0) {
            System.out.println("Cap argument");
    }
    else{
        for (int i=0; i<args.length; i++){
            String argument = args [i];
            
            if (UtilString.esEnter(argument)){
                System.out.println("[" + i + "] \"" + argument + "\": és enter"); 
            }
            else{
                System.out.println("[" + i + "] \"" + argument + "\": no és enter"); 
            }
        }
    }
    }
}

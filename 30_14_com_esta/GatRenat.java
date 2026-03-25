/*
 * Classe GatRenat implementada amb els seus atributs i funcions.
 */
public class GatRenat {
    int vides = 7;
    String posicio = "estirat";
    
    public static boolean esViu (int vides){
        if(vides>0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean esDret (String posicio){
        if(posicio.equals("dret")){
            return true;
        }
        else{
            return false;
        }
    }
    
    public static boolean esAssegut (String posicio){
        if(posicio.equals("assegut")){
            return true;
        }
        else{
            return false;
        }
    }
      
    public static boolean esEstirat (String posicio){
        if(posicio.equals("estirat")){
            return true;
        }
        else{
            return false;
        }
    }
}

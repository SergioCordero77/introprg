/*
 * Classe GatRenat implementada amb els seus atributs i funcions.
 */
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    
    public boolean esViu (int vides){
        if(vides>0){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean esDret (String posicio){
        if(posicio.equals("dret")){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean esAssegut (String posicio){
        if(posicio.equals("assegut")){
            return true;
        }
        else{
            return false;
        }
    }
      
    public boolean esEstirat (String posicio){
        if(posicio.equals("estirat")){
            return true;
        }
        else{
            return false;
        }
    }
    
    public int getVides(){    //consulta el valor de vides
        return vides;
    }
    
    public void setVides (int novesVides){    //modifica el valor de vides
        vides = novesVides;
    }
    
    public String getPosicio(){    //consulta el valor de pis
        return posicio;
    }
    
    public void setPosicio (String novaPosicio){    //modifica el valor de pis
    
        if (novaPosicio.equals("dret") || 
            novaPosicio.equals("assegut")){
            posicio = novaPosicio;
        }
        else{
            posicio = "estirat";
        }
    }
}

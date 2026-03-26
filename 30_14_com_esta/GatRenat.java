/*
 * Classe GatRenat implementada amb els seus atributs i funcions.
 */
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    
    public boolean esViu (){
        return vides > 0;
    }
    
    public boolean esDret (){
        return posicio.equals("dret");
    }
    
    public boolean esAssegut (){
        return posicio.equals("assegut");
    }
      
    public boolean esEstirat (){
        return posicio.equals("estirat");
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

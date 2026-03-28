/*
 * Aquesta classe representa un gat anomenat Renat amb dos atributs principals:
 * - vides: indica el nombre de vides que té el gat (per defecte 7).
 * - posicio: indica en quina posició es troba el gat ("estirat", "dret" o "assegut").
 * 
 * Inclou mètodes getters i setters per accedir i modificar aquests atributs,
 * aplicant certes restriccions per assegurar valors correctes:
 * - Les vides no poden ser negatives.
 * - La posició només pot ser una de les definides.
 * 
 * També inclou booleans per saber si el gat està viu, dret, assegut o assegut.
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

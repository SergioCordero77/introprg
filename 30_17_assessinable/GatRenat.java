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
 * Métodes:
 * - booleans per saber si el gat està viu, dret, assegut o assegut.
 * - String per a que el gat faci l'acció d'aixecar-se, estirar-se o seure.
 * 
 */
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    
    //El gat es mort o reviu
    public String mor(){
        if(vides>0){
            if (vides==1){
                vides--;
                return "ximpún";
            }
            vides--;
            return "auch";
        }
        else{
            return "...";
        }
    }
    
    public String reviu(){
        if(esViu()){
            return "...";
        }
        else{
            return "guai!";
        }
    }
    
    public String reviu(int vides){
        if(esViu()){
            return "...";
        }
        else{
            this.vides = vides;
            return "guai!";
        }
    }
    
    //Accions del gat
    public String aixecat(){
        if (esDret()){
            return "passo de fer res";
        }
        else{
            posicio = "dret";
            return "ja m'aixeco";
        }
    }
    
    public String seu(){
        if (esAssegut()){
            return "passo de fer res";
        }
        else{
            posicio = "assegut";
            return "ja m'assec";
        }
    }
    
    public String estirat(){
        if (esEstirat()){
            return "passo de fer res";
        }
        else{
            posicio = "estirat";
            return "ja m'estiro";
        }
    }
    
    //Condicions del gat
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
    
    //getters i setters
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

/*
 * Classe GatRenat.
 * Representa un gat anomenat Renat amb l'atribut vides, posicio, picarol i hihaPicarol.
 *
 * Funcionament:
 * 
 * - El mètode agafaPicarol(Picarol): assigna un picarol. Si en tenia un, el substitueix pel nou i retorna l'anterior. Si no en tenia cap, retorna el valor null.
 * - El mètode deixaPicarol(): retorna el picarol i a partir d'aquest moment deixa de tenir picarol. Si no en tenia cap, retorna null.
 * - El mètode hihaPicarol(): cert si té un picarol assignat. En néixer, el gat Renat no en té.
 */
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    private Picarol picarol;
    
/****************** getters i setters ******************/
    //vides
    public int getVides() { return vides; }
    public void setVides(int novesVides) {
        if (novesVides >= 0)  {
            vides = novesVides;
        }
    }
    
    //posicio
    public String getPosicio() { return posicio; }
    public void setPosicio(String posicio) {
        if (posicio.equals("dret")){
            this.posicio = posicio;
        }
        else if (posicio.equals("assegut")){
            this.posicio = posicio;
        }
        else{
            this.posicio = "estirat";
        }
    }
    
/********************** mètodes **********************/
    public Picarol agafaPicarol(Picarol picarol){
        Picarol anterior = this.picarol;
        this.picarol = picarol;
            
        return anterior;
    }
    
    public Picarol deixaPicarol(){
        Picarol anterior = this.picarol;
        this.picarol = null;
        
        return anterior;
    }
    
    public boolean hihaPicarol(){
        return picarol != null;
    }
    
    //Accions del gat
    public String aixecat(){
        if (esDret()){
            return "passo de fer res";
        }
        else{
            posicio = "dret";
            if (hihaPicarol()){
                picarol.sona();
            }
            return "ja m'aixeco";
        }
    }
    
    public String seu(){
        if (esAssegut()){
            return "passo de fer res";
        }
        else{
            posicio = "assegut";
            if (hihaPicarol()){
                picarol.sona();
            }
            return "ja m'assec";
        }
    }
    
    public String estirat(){
        if (esEstirat()){
            return "passo de fer res";
        }
        else{
            posicio = "estirat";
            if (hihaPicarol()){
                picarol.sona();
            }
            return "ja m'estiro";
        }
    }
    
    //Condicions de posicio
    public boolean esDret (){
        return posicio.equals("dret");
    }
    
    public boolean esAssegut (){
        return posicio.equals("assegut");
    }
      
    public boolean esEstirat (){
        return posicio.equals("estirat");
    }
}

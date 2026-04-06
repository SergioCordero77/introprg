/* 
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
public class GatRenat extends Gat{
    
    //Accions del gat
    public String aixecat(){
        if (esDret()){
            return "passo de fer res";
        }
        else{
            setPosicio ("dret");
            return "ja m'aixeco";
        }
    }
    
    public String seu(){
        if (esAssegut()){
            return "passo de fer res";
        }
        else{
            setPosicio ("assegut");
            return "ja m'assec";
        }
    }
    
    public String estirat(){
        if (esEstirat()){
            return "passo de fer res";
        }
        else{
            setPosicio ("estirat");
            return "ja m'estiro";
        }
    }
    
    //Condicions del gat
    public boolean esViu (){
        return getVides() > 0;
    }
    
    public boolean esDret (){
        return getPosicio().equals("dret");
    }
    
    public boolean esAssegut (){
        return getPosicio().equals("assegut");
    }
      
    public boolean esEstirat (){
        return getPosicio().equals("estirat");
    }
}

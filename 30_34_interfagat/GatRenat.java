/* 
 * Classe GatRenat.
 * Representa un gat concret anomenat Renat que és un tipus de Gat
 * amb capacitat d’ensinistrament i d’animal de companyia.
 *
 * Aquesta classe afegeix un estat de posició (dret, assegut o estirat)
 * i permet modificar-lo mitjançant accions d’ensinistrament.
 *
 * Funcionalitats principals:
 * - Manté el nom fix "Renat" (heretat de Gat)
 * - Manté i gestiona la posició del gat
 * - Permet saber i canviar la posició (dret, assegut, estirat)
 * - Implementa comportament d’AnimalDeCompanyia
 * - Implementa comportament d’Ensinistrable
 *
 * Constructors:
 * - GatRenat() -> crea el gat en posició "estirat"
 * - GatRenat(String posicio) -> crea el gat amb una posició inicial
 *
 */
public class GatRenat extends Gat implements AnimalDeCompanyia, Ensinistrable{
    private String posicio = "estirat";

/****************** constructors ******************/    
    //constructor sense parametres
    public GatRenat() {
        super("Renat");
        this.posicio = "estirat";
    }
    
    //constructor amb el paràmetre posicio
    public GatRenat(String posicio) {
        super("Renat");
        this.posicio=posicio;
    }
    
/****************** getters i setters ******************/    
    public String getPosicio(){    //consulta el valor de pis
        return posicio;
    }
    
/****************** mètodes ******************/    
    public boolean esDret (){
        return posicio.equals("dret");
    }
    
    public boolean esAssegut (){
        return posicio.equals("assegut");
    }
      
    public boolean esEstirat (){
        return posicio.equals("estirat");
    }
    
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
    
    public String deixatEstimar(){
        return "em deixo estimar";
    }
}

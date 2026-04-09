/*
 * Classe Gat
 *
 * Funcionament:
 * - Hi ha 4 constructors:
        - Constructor que rep nom per paràmetres.
        - Constructor que rep nom i vides per paràmetre.
        - Constructor que rep nom i posicio per paràmetre.
        - Constructor que rep nom, vides i posicio per paràmetres.
 * - El mètode getNom() permet consultar el nom actual.
 * - El mètode getVides() permet consultar el nombre de vides actual.
 * - El mètode setVides() permet canviar les vides.
 * - El mètode getPosicio() permet consultar la posició actual.
 * - El mètode setPosicio() permet canviar la posició.
 * - booleans per saber si el gat està viu, dret, assegut o assegut.
 * - String per a que el gat faci l'acció d'aixecar-se, estirar-se o seure.
 */
public class Gat{
    final private String NOM;
    private int vides = 7;
    private String posicio = "estirat";
    
/****************** constructors ******************/
    public Gat(String nom){
        if (nom==null || nom.isBlank()){
            this.NOM = "anònim";
        }
        else{
            this.NOM = nom;
        }
    }
    
    public Gat(String nom, int vides){
        if (nom==null || nom.isBlank()){
            this.NOM = "anònim";
        }
        else{
            this.NOM = nom;
        }
        
        setVides(vides);
    }
    
    public Gat(String nom, String posicio){
        if (nom==null || nom.isBlank()){
            this.NOM = "anònim";
        }
        else{
            this.NOM = nom;
        }
        
        setPosicio(posicio);
    }
    
    public Gat(String nom, int vides, String posicio){
        if (nom==null || nom.isBlank()){
            this.NOM = "anònim";
        }
        else{
            this.NOM = nom;
        }
        
        setVides(vides);
        setPosicio(posicio);
    }
/****************** getters i setters ******************/
    public String getNom(){    //consulta el nom
        return NOM;
    }
    
    public int getVides(){    //consulta el valor de vides
        return vides;
    }
    
    public void setVides(int vides){    //modifica el valor de vides
        if(vides>=0){
            this.vides = vides;
        }
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
    
/****************** mètodes ******************/    
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
    

}

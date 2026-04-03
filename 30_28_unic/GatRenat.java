/* 
 * Classe GatRenat.
 * Representa un gat anomenat Renat amb l'atribut vides, posició i GatRenat(instància).
 *
 * Funcionament:
 * - Hi ha 4 constructors:
        - Constructor que no rep res per paràmetres.
        - Constructor que rep vides per paràmetre. (privat)
        - Constructor que rep posicio per paràmetre. (privat)
        - Constructor que rep vides i posicio per paràmetres. (privat)
 *
 * - El mètode getInstancia() permet consultar propietat instancia és null. Si ho és, crida el constructor corresponent i assigna el resultat a instancia. Finalment retorna el valor de instancia.
 * - El mètode getInstancia(int vides) permet consultar propietat instancia és null. Si ho és, crida el constructor corresponent i assigna el resultat a instancia. Finalment retorna el valor de instancia amb els valors indicats en els paràmetres.
 * - El mètode getInstancia(String posicio) permet consultar propietat instancia és null. Si ho és, crida el constructor corresponent i assigna el resultat a instancia. Finalment retorna el valor de instancia amb els valors indicats en els paràmetres.
 * - El mètode getInstancia(int vides, String posicio) permet consultar propietat instancia és null. Si ho és, crida el constructor corresponent i assigna el resultat a instancia. Finalment retorna el valor de instancia amb els valors indicats en els paràmetres.
 *
 * - El mètode getVides() permet consultar el nombre de vides actual.
 * - El mètode setVides() permet canviar les vides.
 * - El mètode getPosicio() permet consultar la posició actual.
 * - El mètode setPosicio() permet canviar la posició.
 *
 * - El mètode toString() retorna una representació en format text de l’estat del gat.
 *
 * - El mètode main crea una instància de GatRenat i mostra les seves vides per pantalla.
 */
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    private static GatRenat instancia;
    
/******************** constructors ********************/  
    //constructor sense parametres
    private GatRenat() {
    }
    
    //constructor amb el paràmetre vides
    private GatRenat(int vides) {
        setVides(vides);
    }
    
    //constructor amb el paràmetre posicio
    private GatRenat(String posicio) {
        setPosicio(posicio);
    }
    
    //constructor amb el paràmetre vides i el paràmetre posicio
    private GatRenat(int vides, String posicio) {
        setVides(vides);
        setPosicio(posicio);
    }
/*******************************************************/

/****************** getters i setters ******************/
    
    public static GatRenat getInstancia(){
        if (instancia == null){
            GatRenat novaInstancia = new GatRenat();
            instancia = novaInstancia;
            return instancia;
        }
        return instancia;
    }
    
    public static GatRenat getInstancia(int vides){
        if (instancia == null){
            GatRenat novaInstancia = new GatRenat(vides);
            instancia = novaInstancia;
            return instancia;
        }
        instancia.setVides(vides);
        
        return instancia;
    }
    
    public static GatRenat getInstancia(String posicio){
        if (instancia == null){
            GatRenat novaInstancia = new GatRenat(posicio);
            instancia = novaInstancia;
            return instancia;
        }
        instancia.setPosicio(posicio);
        
        return instancia;
    }
    
    public static GatRenat getInstancia(int vides, String posicio){
        if (instancia == null){
            GatRenat novaInstancia = new GatRenat(vides,posicio);
            instancia = novaInstancia;
            return instancia;
        }
        instancia.setVides(vides);
        instancia.setPosicio(posicio);
        
        return instancia;
    }
    
    public int getVides() { return vides; }
    public void setVides(int novesVides) {
        if (novesVides >= 0)  {
            vides = novesVides;
        }
    }
    
    public String getPosicio() { return posicio; }
    public void setPosicio(String posicio) {
        if (posicio.equals("dret") || posicio.equals("assegut")){
            this.posicio = posicio;
        }
        else{
            this.posicio = "estirat";
        }
    }
/*******************************************************/

/*********************** mètodes ***********************/
    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }
/*******************************************************/

/************************ main ************************/
    public static void main(String[] args) {
        GatRenat[] renats = {
            new GatRenat(),         // tot per defecte
            new GatRenat(8),        // 8 vides i posició per defecte
            new GatRenat("dret"),   // posició dret i vides per defecte
            new GatRenat(8, "dret") // 8 vides i posició dret

        };
        for (GatRenat renat: renats) {
            System.out.println(renat);
        }
    }
}

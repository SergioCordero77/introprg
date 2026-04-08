/* 
 * Classe GatRenat.
 * Representa un gat anomenat Renat amb l'atribut vides, posició ullDret i UllEsquerre.
 *
 * Funcionament:
 * - Hi ha 4 constructors:
        - Constructor que no rep res per paràmetres. Dins del constructor creem els dos ulls i l'inicialitzem tancats ja que el gat es troba estirat inicialment.
        - Constructor que rep posicio per paràmetre. Dins del constructor creem els dos ulls i l'inicialitzem tancats ja que el gat es troba estirat inicialment.
 * - El mètode getVides() permet consultar el nombre de vides actual.
 * - El mètode setVides() permet canviar les vides.
 * - El mètode getPosicio() permet consultar la posició actual.
 * - El mètode getUllDret() permet consultar l'ull dret.
 * - El mètode getUllEsquerre() permet consultar l'ull esquerre
 * - Els mètodes aixecat(), estirat() i seu() canvien la posició del gat i canvia l'estat dels ulls segons la posició.
 * - El mètode toString() retorna una representació en format text de l’estat del gat.
 * - El mètode main crea una instància de GatRenat i mostra l'estat dels ulls segons la posició del gat.
 */
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    private UllDeGat ullDret;
    private UllDeGat ullEsquerre;

/******************** constructors ********************/ 
    //constructor sense parametres
    public GatRenat() {
        ullDret = new UllDeGat();
        ullEsquerre = new UllDeGat();
        
        ullDret.tancat();
        ullEsquerre.tancat();
    }
    
    //constructor amb el paràmetre posicio
    public GatRenat(String posicio) {
        ullDret = new UllDeGat();
        ullEsquerre = new UllDeGat();
        
        setPosicio(posicio);
    }
    
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
            
            ullDret.obret();
            ullEsquerre.obret();
        }
        else if (posicio.equals("assegut")){
            this.posicio = posicio;
            
            ullDret.obret();
            ullEsquerre.tancat();
        }
        else{
            this.posicio = "estirat";
            
            ullDret.tancat();
            ullEsquerre.tancat();
        }
    }
    
    //ull
    public UllDeGat getUllDret(){
        UllDeGat copiaUllDret = new UllDeGat(ullDret.esObert());
        
        return copiaUllDret;
    }
    
    public UllDeGat getUllEsquerre(){
        UllDeGat copiaUllEsquerre = new UllDeGat(ullEsquerre.esObert());
        
        return copiaUllEsquerre;
    }
    
/*********************** mètodes ***********************/
    //Accions del gat
    public String aixecat(){
        setPosicio("dret");
        
        return "dret";
    }
    
    public String seu(){
        setPosicio("assegut");
        
        return "assegut";
    }
    
    public String estirat(){
        setPosicio("estirat");
        
        return "estirat";
    }
    
    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }

/************************ main ************************/
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        UllDeGat ullDret = renat.getUllDret();
        UllDeGat ullEsquerre = renat.getUllEsquerre();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().esObert(),
                renat.getUllEsquerre().esObert());
        renat.seu();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().esObert(),
                renat.getUllEsquerre().esObert());
        renat.aixecat();
        System.out.printf("Quan està %s: %b + %b%n",
                renat.getPosicio(),
                renat.getUllDret().esObert(),
                renat.getUllEsquerre().esObert());
    }
}

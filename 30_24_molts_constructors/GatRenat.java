/* 
 * Classe GatRenat.
 * Representa un gat anomenat Renat amb l'atribut vides i posició.
 *
 * Funcionament:
 * - Hi ha 4 constructors:
        - Constructor que no rep res per paràmetres.
        - Constructor que rep vides per paràmetre.
        - Constructor que rep posicio per paràmetre.
        - Constructor que rep vides i posicio per paràmetres.
 * - El mètode getVides() permet consultar el nombre de vides actual.
 * - El mètode setVides() permet canviar les vides.
 * - El mètode getPosicio() permet consultar la posició actual.
  * - El mètode setPosicio() permet canviar la posició.
 * - El mètode toString() retorna una representació en format text de l’estat del gat.
 * - El mètode main crea una instància de GatRenat i mostra les seves vides per pantalla.
 */
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    
    //constructor sense parametres
    public GatRenat() {
    }
    
    //constructor amb el paràmetre vides
    public GatRenat(int vides) {
        setVides(vides);
    }
    
    //constructor amb el paràmetre posicio
    public GatRenat(String posicio) {
        setPosicio(posicio);
    }
    
    //constructor amb el paràmetre vides i el paràmetre posicio
    public GatRenat(int vides, String posicio) {
        setVides(vides);
        setPosicio(posicio);
    }
    
    public int getVides() { return vides; }
    public void setVides(int novesVides) {
        if (novesVides >= 0)  {
            vides = novesVides;
        }
    }
    
    public String getPosicio() { return posicio; }
    public void setPosicio(String novaPosicio) {
        if (novaPosicio.equals("dret") || novaPosicio.equals("assegut")){
            posicio = novaPosicio;
        }
        else{
            posicio = "estirat";
        }
    }
    
    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s", vides, posicio); }
    
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

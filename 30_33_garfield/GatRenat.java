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
 */
public class GatRenat extends Gat{
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
}

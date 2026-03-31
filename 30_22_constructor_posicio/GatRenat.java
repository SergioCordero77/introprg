/* 
 * Classe GatRenat.
 * Representa un gat anomenat Renat amb l'atribut vides i posició.
 *
 * Funcionament:
 * - El constructor rep per paràmetre les vides i la posició de renat.
 * - El mètode getVides() permet consultar el nombre de vides actual.
 * - El mètode toString() retorna una representació en format text de l’estat del gat.
 * - El mètode main crea una instància de GatRenat i mostra les seves vides per pantalla.
 */
public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
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
        System.out.println(new GatRenat(7, "dret"));
    }
}

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
    private int vides;
    private String posicio;
    public GatRenat(int novesVides, String novaPosicio) {
        vides = novesVides;
        posicio = novaPosicio;
    }
    public int getVides() { return vides; }
    public String getPosicio() { return posicio; }
    @Override
    public String toString() {
        return String.format("Vides: %d. Posició: %s", vides, posicio);
    }
    public static void main(String[] args) {
        GatRenat renat = new GatRenat(7, "estirat");
        System.out.println(renat);
    }
}

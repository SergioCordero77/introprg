/* 
 * Classe GatRenat.
 * Representa un gat anomenat Renat amb l'atribut vides i posició.
 *
 * Funcionament:
 * - El constructor inicialitza les vides a 7.
 * - El mètode getVides() permet consultar el nombre de vides actual.
 * - El mètode toString() retorna una representació en format text de l’estat del gat.
 * - El mètode main crea una instància de GatRenat i mostra les seves vides per pantalla.
 *
 */
public class GatRenat {
    private int vides;
    private String posicio;
    public GatRenat() {
        vides = 7;
        posicio="estirat";
    }
    @Override
    public String toString() {
        return String.format("Vides: %d. Posicio: %s", vides, posicio);
    }
    public int getVides() { return vides; }
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println(renat);
    }
}

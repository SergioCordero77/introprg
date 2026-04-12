/* 
 * Programa que permet provar el comportament de diferents tipus de gats.
 *
 * Funcionament:
 * - Crea un array de gats amb diferents instàncies:
        - Un gat genèric (Gat).
        - Un gat de tipus GatRenat.
        - Un gat de tipus Garfield.
 * - Recorre tots els gats amb un bucle for-each.
 * - Per a cada gat, executa una seqüència d'accions:
        - Seure (seu()).
        - Aixecar-se dues vegades (aixecat()).
        - Estirar-se (estirat()).
 * - Mostra per pantalla el nom del gat i la resposta de cada acció.
 */
public class UsaGats{
    public static void main(String[] args) {
        Gat[] gats = new Gat[] {
            new Gat("Misifú"),
            new GatRenat(),
            new Garfield()
        };
        for (Gat gat: gats) {
            System.out.println("Entrenant el gat " + gat.getNom());
            System.out.println(gat.getNom() + " diu: "+ gat.seu());
            System.out.println(gat.getNom() + " diu: "+ gat.aixecat());
            System.out.println(gat.getNom() + " diu: "+ gat.aixecat());
            System.out.println(gat.getNom() + " diu: "+ gat.estirat());
            System.out.println();
        }
    }
}

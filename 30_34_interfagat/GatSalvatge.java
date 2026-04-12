/*
 * Classe GatSalvatge
 *
 * Representa un gat salvatge que és una subclasse de la classe Gat.
 *
 * Funcionament:
 * - Té un nom fix "Gat Salvatge"
 * - No és un animal de companyia
 * - Només hereta el comportament bàsic d’un gat (vida, mort i revisió d’estat)
 *
 * Funcionalitats principals:
 * - Pot viure, morir i reviure com qualsevol Gat
 * - No implementa comportaments d’ensinistrament ni domesticació
 * - No permet interacció com a animal de companyia
 *
 * Constructores:
 * - GatSalvatge() -> crea un gat salvatge amb nom fix
 */
public class GatSalvatge extends Gat{
    public GatSalvatge() {
        super("Gat Salvatge");
    }
}

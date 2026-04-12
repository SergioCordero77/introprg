/*
 * Classe Garfield
 *
 * Representa un gat anomenat Garfield, que és una especialització de Gat
 * amb comportament propi i més restrictiu.
 *
 * Característiques:
   - Nom fix: "Garfield"
   - Vides inicials: 9
   - Posició inicial: "estirat"
   - És un animal de companyia
 *
 * Comportament especial:
   - Sobreescriu el comportament d’AnimalDeCompanyia
 *   per expressar una forma particular de deixar-se estimar.
 *
 * Funcionament:
   - Constructor:
     - Garfield() -> inicialitza el gat amb nom "Garfield" i 9 vides
     
   - Mètodes:
     - deixatEstimar() -> retorna "em deixo estimar, però només una mica"
 *
 */
public class Garfield extends Gat implements AnimalDeCompanyia{

/****************** contructor ******************/
    public Garfield (){
        super("Garfield", 9);
    }

/****************** mètodes ******************/
    public String deixatEstimar(){
        return "em deixo estimar, però només una mica";
    }
}

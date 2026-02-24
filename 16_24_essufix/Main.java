/* Aquest programa comprova el funcionament de les funció UtilSTring.esSufix().
   El programa obté la modalitat de args[0] i finalitza amb error si no se li
   proporciona. En cas que l'entrada no sigui "laxe" considerarà la modalitat "estricte"
   Si tot ha anat bé, demana dos strings per entrada estàndard
   i retorna el resultat de comprovar si el segon és sufix del primer.
   */
public class Main {
    public static void main(String[] args) {
        boolean estricte = !args[0].equalsIgnoreCase("laxe");
        System.out.println("Text principal?");
        String text = Entrada.readLine();
        System.out.println("Sufix?");
        String sufix = Entrada.readLine();
        System.out.printf("esSufix(sufix: \"%s\", text: \"%s\", estricte: %b) -> %b%n",
                sufix, text, estricte,
                UtilString.esSufix(sufix, text, estricte));
    }
}

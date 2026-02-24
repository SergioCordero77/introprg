/* Aquest programa comprova el funcionament de les funció UtilString.esSubstring().
   El programa obté la modalitat de args[0] i finalitza amb error si no se li
   proporciona. En cas que l'entrada no sigui "laxe" considerarà la modalitat "estricte"

   Si tot ha anat bé, demana dos strings per entrada estàndard
   i retorna el nombre de vegades que substring apareix dins del text principal. */
public class Main {
    public static void main(String[] args) {
        boolean estricte = !args[0].equalsIgnoreCase("laxe");
        System.out.println("Text principal?");
        String text = Entrada.readLine();
        System.out.println("substring?");
        String substring = Entrada.readLine();
        System.out.printf("quants(substring: \"%s\", text: \"%s\", estricte: %b) -> %d%n",
                substring, text, estricte,
                UtilString.quants(substring, text, estricte));
    }
}

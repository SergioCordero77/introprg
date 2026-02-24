 /* Aquest programa comprova el funcionament de les funció UtilString.esSubstring().
    El programa obté la modalitat de args[0] i finalitza amb error si no se li
    proporciona. En cas que l'entrada no sigui "laxe" considerarà la modalitat "estricte"

    Si tot ha anat bé, demana dos strings per entrada estàndard
    i retorna el resultat de comprovar si el segon és substring del primer. */
 public class Main {
     public static void main(String[] args) {
         boolean estricte = ! args[0].equalsIgnoreCase("laxe");
         System.out.println("Text principal?");
         String text = Entrada.readLine();
         System.out.println("substring?");
         String substring = Entrada.readLine();
         System.out.printf("esSubstring(substring: \"%s\", text: \"%s\", estricte: %b) -> %b%n",
                 substring, text, estricte,
                 UtilString.esSubstring(substring, text, estricte));
     }
 }

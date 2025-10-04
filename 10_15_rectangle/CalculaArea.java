/*
 * Aquest programa demana el valor del radi
 * i la unitat de mesura i finalment calcula l'àrea"
 */
public class CalculaArea {
    public static void main(String[] args) {
        System.out.println("Càlcul de l'àrea d'un rectangle");
        System.out.println("Introduïu la base:");
        String horitzontal = Entrada.readLine(); 
        System.out.println("Introduïu l'altura:");
        String vertical = Entrada.readLine(); 
        System.out.println("Introduïu les unitats (ex. cm):");
        String unitats = Entrada.readLine();
        int base = Integer.parseInt(horitzontal);
        int altura = Integer.parseInt(vertical); 
        int area = base * altura;
        System.out.println("L'àrea d'un rectangle de base " + base + unitats + " i altura " + altura + unitats + " és " + area + unitats + ("^2"));
    }
}

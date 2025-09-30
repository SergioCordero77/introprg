/*
 * Aquest programa demana el valor del radi
 * i la unitat de mesura i finalment calcula l'àrea"
 */
public class CalculaArea {
    public static void main(String[] args) {
        System.out.println("Càlcul de l'àrea d'un cercle");
        System.out.println("Introduïu el radi:");
        String linia = Entrada.readLine(); // Donem un valor al radi
        System.out.print("Introduïu les unitas (ex cm):");
        String unitats = Entrada.readLine(); // Indiquem quina unitat de mesura volem utilitzar
        float radi = Float.parseFloat(linia); // Transforma String a Float
        float area = (float)Math.PI * radi * radi;
        System.out.println("L'àrea és " + area + (" ") + unitats + ("²"));
    }
}
        
        

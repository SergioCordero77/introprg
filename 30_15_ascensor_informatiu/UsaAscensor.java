/*
 * Programa que accedeix a la classe Ascensor y ens diu el pis final, el moviment final 
 * i ens retorna un missatge que ens diu el moviment i el pis on es troba l'ascensor.
 * El pis i el moviment vindràn determinats per Entrada.readLine().
 */
public class UsaAscensor {
    // XXX considera si et cal algun mòdul d'ajut
    public static void main(String[] args) {
        Ascensor ascensor = new Ascensor();
        System.out.println("Pis inicial: " + ascensor.getPis());
        System.out.println("Moviment inicial: " + ascensor.getMoviment());
        System.out.println("Introdueix nou pis:");
        ascensor.setPis(Integer.parseInt(Entrada.readLine()));

        System.out.println("Introdueix nou moviment:");
        ascensor.setMoviment(Entrada.readLine());

        System.out.println("Pis final: " + ascensor.getPis());
        System.out.println("Moviment final: " + ascensor.getMoviment());
        System.out.println("Estat de l'ascensor: " + ascensor.comEsta());
    }
}

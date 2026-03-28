/*
 * Programa que ens retorna l'acció que fa el Renat.
 * Els missatges que ens retornarà seran: "ja m'estiro", "ja m'assec", "ja m'aixeco", i "passo de fer res".
 */
public class UsaGatRenat{
    public static void main (String [] args){
        GatRenat renat = new GatRenat();
        System.out.println("El Renat diu: "+ renat.aixecat());
        System.out.println("El Renat diu: "+ renat.seu());
        System.out.println("El Renat diu: "+ renat.estirat());
        System.out.println("El Renat diu: "+ renat.estirat());
    }
}

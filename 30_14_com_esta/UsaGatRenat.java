/*
 * Programa que verifica si el gat renat continua estant viu i si ha canviat de posició depenent
 * si ha canviat de posició depenent del que li passem per Entrada.readLine().
 */
public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println("Inicialment renat.esViu(): " + renat.esViu(renat.vides));
        System.out.println("Inicialment renat.esDret(): " + renat.esDret(renat.posicio));
        System.out.println("Inicialment renat.esAssegut(): " + renat.esAssegut(renat.posicio));
        System.out.println("Inicialment renat.esEstirat(): " + renat.esEstirat(renat.posicio));
        System.out.println("Introdueix quantes vides:");
        renat.vides = Integer.parseInt(Entrada.readLine());
        System.out.println("Introdueix nova posició:");
        renat.posicio = Entrada.readLine();
        System.out.println("Finalment renat.esViu(): " + renat.esViu(renat.vides));
        System.out.println("Finalment renat.esDret(): " + renat.esDret(renat.posicio));
        System.out.println("Finalment renat.esAssegut(): " + renat.esAssegut(renat.posicio));
        System.out.println("Finalment renat.esEstirat(): " + renat.esEstirat(renat.posicio));
    }
}

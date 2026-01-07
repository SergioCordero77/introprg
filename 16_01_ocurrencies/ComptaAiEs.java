/* Programa que ens permet comparar les ocurrències de dos caràcters qualsevol.*/
public class ComptaAiEs {
    public static void main(String[] args) {
        System.out.println("Introdueix un text");
        String entrada = Entrada.readLine();
        
        comptaLletra(entrada, 'a');
        comptaLletra(entrada, 'e');
        comparaOcurrencies(entrada, 'a', 'e');
    }
    public static void comptaLletra(String text, char lletra) {
        int comptador = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra) {
                comptador += 1;
            }
        }
        System.out.println("Nombre de '" + lletra + "'s: " + comptador);
    }
    public static void comparaOcurrencies(String text, char lletra1, char lletra2) {
        int comptadorA = 0;
        int comptadorE = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra1) {
                comptadorA += 1;
            } else if (text.charAt(i) == lletra2) {
                comptadorE += 1;
            }
        }
        if (comptadorA > comptadorE) {
            System.out.println("Hi ha més '"+lletra1+"'s que '"+lletra2+"'s");
        } else if (comptadorA < comptadorE) {
            System.out.println("Hi ha menys '"+lletra1+"'s que '"+lletra2+"'s");
        } else {
            System.out.println("Hi ha tantes '"+lletra1+"'s com '"+lletra2+"'s");
        }
    }
}

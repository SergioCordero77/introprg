/*
 * Programa que mostra el total d'ocurrències de totes les vocals catalanes 
 */
public class ComptaVocals {
    public static void main(String[] args) {
        
        System.out.println("Introdueix un text");
        String text = Entrada.readLine();
        
        int numAs = quantesOcurrencies(text, 'a');
        int numAsOberta = quantesOcurrencies(text, 'à');
        int numEs = quantesOcurrencies(text, 'e');
        int numEsOberta = quantesOcurrencies(text, 'è');
        int numEsTancada = quantesOcurrencies(text, 'é');
        int numIs = quantesOcurrencies(text, 'i');
        int numIsTancada = quantesOcurrencies(text, 'í');
        int numIsDieresi = quantesOcurrencies(text, 'ï');
        int numOs = quantesOcurrencies(text, 'o');
        int numOsTancada = quantesOcurrencies(text, 'ó');
        int numOsOberta = quantesOcurrencies(text, 'ò');
        int numUs = quantesOcurrencies(text, 'u');
        int numUsTancada = quantesOcurrencies(text, 'ú');
        int numUsDieresi = quantesOcurrencies(text, 'ü');
        
        //Ocurrencies
        mostraOcurrencies('a', numAs);
        mostraOcurrencies('à', numAsOberta);
        mostraOcurrencies('e', numEs);
        mostraOcurrencies('è', numEsOberta);
        mostraOcurrencies('é', numEsTancada);
        mostraOcurrencies('i', numIs);
        mostraOcurrencies('í', numIsTancada);
        mostraOcurrencies('ï', numIsDieresi);
        mostraOcurrencies('o', numOs);
        mostraOcurrencies('ó', numOsTancada);
        mostraOcurrencies('ò', numOsOberta);
        mostraOcurrencies('u', numUs);
        mostraOcurrencies('ú', numUsTancada);
        mostraOcurrencies('ü', numUsDieresi);
    }
    public static void mostraOcurrencies(char lletra, int quantes) {
        System.out.println("Nombre de '" + lletra + "'s: " + quantes);
    }
    public static int quantesOcurrencies(String text, char lletra) {
        int comptador = 0;
        for (int i=0; i < text.length(); i++) {
            if (text.charAt(i) == lletra) {
                comptador += 1;
            }
        }
        return comptador;
    }
}

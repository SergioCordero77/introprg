/*
 * Programa per saber quin dia de la setmana és
 * mitjançan Switch.
 *
 */
public class DiaSetmanaSwitch {
    public static void main (String[] args) {

        int diaSetmana = Integer.parseInt(Entrada.readLine());
        String dia;
        switch (diaSetmana) {
            case 1:  dia = "Dilluns";
                     break;
            case 2:  dia = "Dimarts";
                     break;
            case 3:  dia = "Dimecres";
                     break;
            case 4:  dia = "Dijous";
                     break;
            case 5:  dia = "Divendres";
                     break;
            case 6:  dia = "Dissabte";
                     break;
            case 7:  dia = "Diumenge";
                     break;
            default: dia = "Error";
                     break;
        }
        System.out.println(dia);
    }
}

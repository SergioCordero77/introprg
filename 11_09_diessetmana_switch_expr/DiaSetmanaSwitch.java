/*
 * Programa per saber quin dia de la setmana és
 * mitjançan Switch.
 *
 */
public class DiaSetmanaSwitch {
    public static void main (String[] args) {

        int diaSetmana = Integer.parseInt(args[0]);
        String dia;
        switch (diaSetmana) {
            case 1 ->  dia = "Dilluns";
            case 2 ->  dia = "Dimarts";
            case 3 ->  dia = "Dimecres";
            case 4 ->  dia = "Dijous";
            case 5 ->  dia = "Divendres";
            case 6 ->  dia = "Dissabte";
            case 7 ->  dia = "Diumenge";
            default -> dia = "Error";
        }
        System.out.println(dia);
    }
}

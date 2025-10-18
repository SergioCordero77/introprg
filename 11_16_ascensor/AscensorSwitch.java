/*
 * Programa del Ascensor
 * mitjançan Switch.
 *
 */
public class AscensorSwitch {
    public static void main (String[] args) {
        
        System.out.println("pis?");
        String pis = Entrada.readLine();
        
        System.out.println("botó?");
        String boto = Entrada.readLine();
        String nouPis = "";
    
        
        switch (pis) {
            case "planta baixa":
                switch (boto) {
                    case "pujar un": nouPis = "primer pis";
                        break;
                    case "pujar dos": nouPis = "segon pis";
                        break;
                    case "baixar un": nouPis = "error";
                        break;
                    case "baixar dos": nouPis = "error";
                        break;
                }
                break;
            case "primer pis":
                switch (boto) {
                    case "pujar un": nouPis = "segon pis";
                        break; 
                    case "pujar dos": nouPis = "error";
                        break;
                    case "baixar un": nouPis = "planta baixa";
                        break;
                    case "baixar dos": nouPis = "error";
                        break;
                }
                break;
            case "segon pis":
                switch (boto) {
                    case "pujar un": nouPis = "error";
                        break;
                    case "pujar dos": nouPis = "error";
                        break;
                    case "baixar un": nouPis = "primer pis";
                        break;
                    case "baixar dos": nouPis = "planta baixa";
                        break;
               }
               break;
        }
        System.out.println(nouPis);
    }
}


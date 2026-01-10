/*
 * Programa que ajuda a decidir que fer davant un semàfor (vermell, verd o groc). El programa demanarà de quin color està el semàfor i segons la resposta recomanarà respectivament espera, passa, o corre!.

En cas que el color introduït no sigui cap d'aquests, el programa respondrà amb el missatge "ves a l'oculista".

Aquesta versió fa servir la funció UtilitatsConfirmacio.respostaABoolean().
 */
public class Semafor{
    public static void main (String [] args){
    
    System.out.println("Ets major d'edat?");
    String resposta = Entrada.readLine();
    
        if (TestExercise.respostaABoolean(resposta)){
            System.out.println("Color?");
            String color = Entrada.readLine();
            
            demanaColor(color);
        }
        else{
            System.out.println("No pots fer servir aquest programa sense supervisió");
        }
    }
    
    public static void demanaColor(String color){  
        
        if (color.equals("vermell")){
            System.out.println("espera");
        }
        else if (color.equals("verd")){
            System.out.println("passa");
        }
        else if (color.equals("groc")){
            System.out.println("corre!");
        }
        else{
            System.out.println("ves a l'oculista");
        }
    }
}

/*
 * El programa anirà demanant valors enters fins que rebi un valor negatiu o una cadena buida o només espais en blanc.
 Per cada nombre que rebi, dibuixarà un rectangle d'asteriscs ('*') amb el nombre de columnes indicat pel número introduït, i el nombre de files indicat pel número anterior. En el cas del primer número, el nombre de files serà 1.
 El rectangle estarà encapçalat pel número de columna, començant per la 0. En cas que tingui més de 10 files, després de la 9 passarà un altre cop a la 1. D'igual manera, per cada fila també indicarà el número corresponent.
 Finalment mostrarà un resum amb el nombre de rectangles i punts dibuixats, o bé el missatge "Cap rectangle dibuixat".
 */
public class RectanglesAMida {
    public static void main (String [] args) {
    
    System.out.println("primer?");
    int primer = Integer.parseInt(Entrada.readLine());
    
    System.out.println("segon?");
    String segon1 = Entrada.readLine();
    
    int contRectangle = 0;
    int contPunts = 0;
    
    while (!segon1.isBlank()){
        
        int segon = Integer.parseInt(segon1);
        
        System.out.println(primer + " x " + segon);
     
            for (int linia = -1; primer>linia; linia++){
                if (linia > -1) {
                    System.out.print ("" + linia);
                }
                else{
                    System.out.print (" ");
                }
                for (int columna = 0; segon>columna; columna++){
                    if (linia == -1){
                        System.out.print ("" + columna);
                    }
                    else{
                        System.out.print ("*");
                    }
                }
                System.out.println();
            }
            
            contRectangle ++;
            contPunts = contPunts + (primer*segon);
            
            primer = segon;
            
            
        System.out.println(primer + " x ?");
        segon1 = Entrada.readLine();
    }
    
    System.out.println("Rectangles: " + contRectangle);
    System.out.println("Punts: " + contPunts);
    
    }
}
                
                
                
                
                
                

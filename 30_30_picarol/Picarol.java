/*
 * Classe Picarol
 * Té com atributs cops.
 *
 * Un Picarol ens permet fer dues coses:
 *  - sona(): fa sonar el picarol
 *  - Per simular el so del picarol, el mètode sona() escriurà per pantalla el missatge "clink-clink".
 *  - int vegades(): retornarà el nombre de cops que ha sonat el picarol des de que va ser creat.
 */
public class Picarol{
    private int cops;
    
    public void sona(){
        System.out.println("clink-clink");
        cops ++;
    }
    
    public int vegades(){
        return cops;
    }
}

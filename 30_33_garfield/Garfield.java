/* 
 * Classe Garfield.
 * Representa un gat anomenat Garfield amb un comportament especial respecte a les accions.
 *
 * Funcionament:
 * - Té un constructor que inicialitza el gat amb nom "Garfield", 9 vides i posició "estirat".
 * - Sobreescriu el mètode setVides() per limitar les vides entre 0 i 9.
 * - Sobreescriu els mètodes aixecat() i estirat() per modificar el comportament:
        - Si està estirat i se li demana aixecar-se, respon "Bai Maitea, bai".
        - Si està dret i se li demana estirar-se, respon "Bai Maitea, bai".
        - En altres casos, actua de manera similar a un gat normal.
 */
public class Garfield extends Gat{

/****************** contructor ******************/
    public Garfield (){
        super("Garfield", 9, "estirat");
    }

/****************** setter ******************/ 
    public void setVides (int vides){    //modifica el valor de vides
        if (vides>=0 && vides<=9){
            super.setVides(vides);
        }
    }

/****************** mètodes ******************/    
    //Accions del gat
    public String aixecat(){
        if (esDret()){
            return "passo de fer res";
        }
        else if(esAssegut()){
            super.setPosicio("dret");
            return "ja m'aixeco";
        }
        else{
            return "Bai Maitea, bai";
        }
    }
    
    public String estirat(){
        if (esEstirat()){
            return "passo de fer res";
        }
        else if(esAssegut()){
            super.setPosicio ("estirat");
            return "ja m'estiro";
        }
        else{
            return "Bai Maitea, bai";
        }
    }
}


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

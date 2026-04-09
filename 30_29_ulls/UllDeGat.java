/*
 * Classe UllDeGat
 * Representa l'ull del gat.
 * 
 * Funcionament:
 * Té 2 constructors:
    - El primer no rep res per paràmetres.
    - El segon rep per paràmetre un boolean per saber si l'ull està obert o tancat.
 * Té mètodes per obrir, tancar i boolean per saber si l'ull està oberto o tancat.
 */
public class UllDeGat{
    private boolean obert;

/******************** constructors ********************/ 
    public UllDeGat(){
    }
    
    public UllDeGat(boolean obert){
        if(obert){
            this.obert = true;
        }
        else{
            this.obert = false;
        }
    }

/*********************** mètodes ***********************/
    public void obret(){
        obert = true;
    }
    
    public void tancat(){
        obert = false;
    }
    
    public boolean esObert(){
        if (obert){
            return true;
        }
        return false;
    }
}

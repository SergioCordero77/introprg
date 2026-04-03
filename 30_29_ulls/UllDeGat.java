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

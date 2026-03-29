/*
 * Programa que defineix una classe que es diu Ascensor que té com a valors
    - pis: int.
    - moviment: String.
 */
public class Ascensor{
    private int pis = -1;
    private String moviment = "aturat";
    
    public boolean aturat(){
        if (!esAturat()) {
            moviment = "aturat";
            return true;
        }
        return false;
    }
    
    public boolean arrencaAmunt(){
        if (esAturat()){
            moviment = "pujant";
            return true;
        }
        return false;
    }
    
    public boolean arrencaAbaix(){
        if (esAturat()){
            moviment = "baixant";
            return true;
        }
        return false;
    }
    
    public int seguentPis(){
        if (moviment.equals("pujant")){
            if (esAdalt()){
                moviment = "baixant";
            }
            return pis++;
        }
        else if (moviment.equals("baixant")){
            if (esAbaix()){
                moviment = "pujant";
            }
            return pis--;
        }
        
        return pis;
    }
    
    public boolean esAbaix(){
        return pis==-1;
    }
    
    public boolean esAdalt(){
        return pis==10;
    }
    
    
    public boolean esAturat(){
        return moviment.equals("aturat");
    }
    
    public boolean esEnMoviment(){
        return esPujant() || esBaixant();
    }
    
    public boolean esPujant(){
        return moviment.equals("pujant");
    }
    
    public boolean esBaixant(){
        return moviment.equals("baixant");
    }
    
    public String comEsta(){
        if (esAturat()){
            return moviment + " al pis " + pis;
        }
        else if (esEnMoviment()){
            return moviment + " al pis " + pis;
        }
        else if (esPujant()){
            return moviment + " al pis " + pis;
        }
        else if (esBaixant()){
            return moviment + " al pis " + pis;
        }
        else{
            return moviment + " al pis " + pis;
        }
    }
    
    //getters i setters
    public int getPis(){    //consulta el valor de pis
        return pis;
    }
    
    public void setPis (int nouPis){    //modifica el valor de pis
        if (nouPis>=-1 && nouPis<=10){
            pis = nouPis;
        }
    }
    
    public String getMoviment(){    //consulta el valor de pis
        return moviment;
    }
    
    public void setMoviment (String nouMoviment){    //modifica el valor de pis
    
        if (nouMoviment.equals("aturat") || nouMoviment.equals("pujant") || nouMoviment.equals("baixant")){
            moviment = nouMoviment;
        }
    }
}

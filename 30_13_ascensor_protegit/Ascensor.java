/*
 * Programa que defineix una classe que es diu Ascensor que té com a valors
    - pis: int.
    - moviment: String.
 */
public class Ascensor{
    private int pis = -1;
    private String moviment = "aturat";
    
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

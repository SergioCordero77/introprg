public class Gat{
    private int vides = 7;
    private String posicio = "estirat";
    
    public int getVides(){
        return vides;
    }
    public void setVides(int vides){
        if(vides>=0){
            this.vides = vides;
        }
    }
    
    public String getPosicio(){
        return posicio;
    }
    public void setPosicio(String posicio){
        if (posicio.equals("dret") || 
            posicio.equals("assegut")){
            this.posicio = posicio;
        }
        else{
            this.posicio = "estirat";
        }
    }
}

public class Hora{
    int hores = 0;
    int minuts = 00;
    int segons = 00;
    
    //contructor sense parametres
    public Hora (){
    }
    
    //constructor amb paràmetres
    public Hora (int hores, int minuts, int segons){
        setHores(hores);
        setMinuts(minuts);
        setSegons(segons);
    }
    
    public int getHores(){
        return hores;
    }
    
    public int getMinuts(){
        return minuts;
    }
    
    public int getSegons(){
        return segons;
    }
    
    public void setHores(int hora){
        this.hores = hora;
    }
    
    public void setMinuts(int minuts){
        this.minuts = minuts;
    }
    
    public void setSegons(int segons){
        this.segons = segons;
    }
    
    public void incrementa (){
        this.segons ++;
        
        if (this.segons==60){
            this.segons=0;
            this.minuts++;
            
            if(this.minuts==60){
                this.minuts = 0;
                this.hores ++;
                
                if(this.hores>24){
                    this.hores = 0;
                }
            }
        }
    }
    
    public void decrementa (){
        this.segons --;
        
        if(this.segons<0){
            this.segons = 59;
            this.minuts --;
            
            if(this.minuts<0){
                this.minuts = 59;
                this.hores --;
                
                if(this.hores<0){
                    this.hores = 24;
                }
            }
        }
    }
    
    public void incrementa (int segons){
        if (segons>59){
            hores ++;
        }
    }
    
    public void decrementa (int segons){
        if (segons<1){
            hores --;
        }
    }
    
    public int compareTo(Hora hora){
        if (hores < hora.hores){
            return -1;
        }
        else if (hores > hora.hores){
            return 1;
        }
        else{
            if (minuts < hora.minuts){
                return -1;
            }
            else if (minuts > hora.minuts){
                return 1;
            }
            else{
                if (segons < hora.segons){
                    return -1;
                }
                else if (segons > hora.segons){
                    return 1;
                }
                else{
                    return 0;
                } 
            }
        }
    }
    
    public String toString(){
        if (segons<10 && minuts<10){
            return hores + ":0" + minuts + ":0" + segons;  
        }
        else if (minuts<10){
            return hores + ":0" + minuts + ":" + segons;  
        }
        else if (segons<10){
            return hores + ":" + minuts + ":0" + segons;  
        }
        return hores + ":" + minuts + ":" + segons;
    }
    
    /**
     * Compara dues hores i retorna l'operador corresponent
     * Per exemple, si hora1 és menor que hora2, l'operador serà "<". Els
     * altres dos valors possibles són ">" i "=="
     * @param hora1: primera hora a comparar
     * @param hora2: segona hora a comparar
     * @return operador resultant
     */
    private static String composaOperadorComparacio(Hora hora1, Hora hora2) {
        int comparacio = hora1.compareTo(hora2);
        if (comparacio < 0) {
            return "<";
        } else if (comparacio > 0) {
            return ">";
        } else {
            return "==";
        }
    }

    public static void main(String[] args) {
        Hora hora1 = new Hora();
        Hora hora2 = new Hora(0, 0, 2);
        System.out.printf("Inicialment hora1: %s %s hora2: %s%n",
                hora1,
                composaOperadorComparacio(hora1, hora2),
                hora2);
        System.out.println("Incrementem 1 segon a la primera i decrementem 1 segon a la segona");
        hora1.incrementa();
        hora2.decrementa();
        System.out.printf("Finalment hora1: %s %s hora2: %s%n",
                hora1,
                composaOperadorComparacio(hora1, hora2),
                hora2);
    }
}

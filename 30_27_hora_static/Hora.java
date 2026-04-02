/* 
 * Classe Hora.
 * Representa una hora concreta amb els atributs hora, minuts i segons.
 *
 * Funcionament:
 * - Hi ha 2 constructors:
        - Constructor que no rep res per paràmetres.
        - Constructor que rep hores, minuts i segons per paràmetre.
 * - Hi ha 3 getters:
 *      -El mètode getHores() permet consultar les hores.
 *      -El mètode getMinuts() permet consultar els minuts.
 *      -El mètode getSegons() permet consultar els segons.
 * - Hi ha 3 setters:
 *      -El mètode setHores() permet canviar les hores.
 *      -El mètode setMinuts() permet canviar els minuts.
 *      -El mètode setSegons() permet canviar els segons.
 * - El mètode incrementa() que afegeix un segon a la hora.
 * - El mètode decrementa() que treu un segon a la hora.
 * - El mètode incrementa(int segons) que afegeix tants segons a la hora com se li hagi passat per paràmetre.
 * - El mètode decrementa(int segons) que decrementa tants segons a la hora com se li hagi passat per paràmetre.
 * - El mètode comparteToHora(Hora) que compara 2 hores i ens retorna si hi ha una hora més gran o si són iguals.
 * - El mètode toString() retorna la hora en el següent format "0:00:00".
 * - El mètode main crea dos objectes hora, els compara i ens diu quina hora és més gran, 
 * després incrementa un segon la hora a hora1 i decrementa un segon a la hora2 i els torna a comparar.
 */
public class Hora{
    int hores = 0;
    int minuts = 0;
    int segons = 0;

/******************** constructors ********************/    
    //contructor sense parametres
    public Hora (){
    }
    
    //constructor amb paràmetres
    public Hora (int hores, int minuts, int segons){
           setHores(hores);
           setMinuts(minuts);
           setSegons(segons); 
        
        if(getHores()<0 || getHores()>23 ||
           getMinuts()<0 || getMinuts()>59 || 
           getSegons()<0 || getSegons()>59){
       
           this.hores = 0;
           this.minuts = 0;
           this.segons = 0;    
       }
    }
/*******************************************************/

/****************** getters i setters ******************/
    //getters
    public int getHores(){
        return hores;
    }
    
    public int getMinuts(){
        return minuts;
    }
    
    public int getSegons(){
        return segons;
    }
    
    //setter
    public void setHores(int hora){
        this.hores = hora;
    }
    
    public void setMinuts(int minuts){
        this.minuts = minuts;
    }
    
    public void setSegons(int segons){
        this.segons = segons;
    }
/*******************************************************/
    
    public static boolean esValida(int hores, int minuts, int segons){
        if (hores<0 || hores>23 ||
           minuts<0 || minuts>59 || 
           segons<0 || segons>59){
           return false;
        }
        return true;
    }
    
    public static int compareTo (Hora hora1, Hora hora2){
        if (hora1.hores < hora2.hores){
            return -1;
        }
        else if (hora1.hores < hora2.hores){
            return 1;
        }
        else{ //Si la hora es igual, s'hauran de comparar els minuts
            if (hora1.minuts < hora2.minuts){
                return -1;
            }
            else if (hora1.minuts > hora2.minuts){
                return 1;
            }
            else{ //Si els minuts són iguals, s'hauran de comparar els segons
                if (hora1.segons < hora2.segons){
                    return -1;
                }
                else if (hora1.segons > hora2.segons){
                    return 1;
                }
                else{
                    return 0;
                } 
            }
        }
    }
    
    public Hora duplica(){
        setHores(this.hores);
        setMinuts(this.minuts);
        setSegons(this.segons); 
           
        Hora copia = new Hora();
        return copia;
    }
    
    public static Hora duplica(Hora hora){
        Hora copia = new Hora(hora.hores, hora.minuts, hora.segons);
        return copia;
    }
    
    public void incrementa (){
        this.segons ++;
        
        if (this.segons==60){
            this.segons=0;
            this.minuts++;
            
            if(this.minuts==60){
                this.minuts=0;
                this.hores ++;
                
                if(this.hores>23){
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
                    this.hores = 23;
                }
            }
        }
    }
    
    public void incrementa (int segons){
        
        //Total de segons que hi ha a la nostra hora
        int segonsTotals =  hores*3600 +
                            minuts*60 +
                            this.segons;
        
        //Total de segons que hi ha en un dia                    
        int totalSegonsAlDia = 24*3600;
        
        //cicle de 24h
        int segonsNormalitzats = segons%totalSegonsAlDia;
        
        //increment de segons                 
        int increment = segonsTotals + segonsNormalitzats;
        
        //contron si l'increment és negatiu
        if (increment<0){
            increment = (totalSegonsAlDia + increment)%totalSegonsAlDia;
        }
        
        //conversió final de segons a hores, minuts i segons
        this.hores = (increment/3600)%24;
        this.minuts = (increment/60)%60;
        this.segons = increment%60;
    }
    
    public void decrementa (int segons){
        
        //Total de segons que hi ha a la nostra hora
        int segonsTotals =  hores*3600 +
                            minuts*60 +
                            this.segons;
        
        //Total de segons que hi ha en un dia                    
        int totalSegonsAlDia = 24*3600;
        
        //cicle de 24h
        int segonsNormalitzats = segons%totalSegonsAlDia;
        
        //decrement de segons                 
        int decrement = segonsTotals - segonsNormalitzats;
        
        //control si el decrement és negatiu
        if (decrement<0){
            decrement = (totalSegonsAlDia + decrement)%totalSegonsAlDia;
        }
        
        //conversió final de segons a hores, minuts i segons
        this.hores = (decrement/3600)%24;
        this.minuts = (decrement/60)%60;
        this.segons = decrement%60;
    }
    
    public int compareTo(Hora hora){
        if (hores < hora.hores){
            return -1;
        }
        else if (hores > hora.hores){
            return 1;
        }
        else{ //Si la hora es igual, s'hauran de comparar els minuts
            if (minuts < hora.minuts){
                return -1;
            }
            else if (minuts > hora.minuts){
                return 1;
            }
            else{ //Si els minuts són iguals, s'hauran de comparar els segons
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

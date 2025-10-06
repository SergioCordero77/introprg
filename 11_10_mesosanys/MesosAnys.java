/*
 * Programa per saber quin es el mes anterior i el següent
 * del que diem.
 *
 */
public class MesosAnys {
    public static void main (String[] args) {
    System.out.println("Mes?");
    int mes = Integer.parseInt(Entrada.readLine());
    System.out.println("Any?");
    int any = Integer.parseInt(Entrada.readLine());
   
        if (mes >= 2 && mes <= 11){
            System.out.println ("Mes anterior " + (mes-1) + "/" + any + " i mes següent " + (mes+1) + "/" + any);
        }
        else if (mes == 1){
            System.out.println ("Mes anterior " + (mes+11) + "/" + (any-1) + " i mes següent " + (mes+1) + "/" + any);
        }
        else if (mes == 12){
            System.out.println ("Mes anterior " + (mes-1) + "/" + any + " i mes següent " + (mes-11) + "/" + (any+1));
        }
        else {
            System.out.println ("Error");
        }
    }
}
    

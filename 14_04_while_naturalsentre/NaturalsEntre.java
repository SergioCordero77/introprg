/*
 * Programa que demana un valor inicial, un valor final i un valor pel salt. Tots els valors introduïts seràn no negatius.
 * El valors es rebrán per entrada estàndar i seràn números enters.
 * Elprograma comprovoarà que els valors no són negatiu. Que el primer no sigui menor o igual que el segon, i que el tercer sigui més gran que zero. En cas que un dels valors no compleixi les condicions, el programa deixarà de preguntar i ho indicarà amb el següent missatge: "Valor no vàlid" i finalitzarà. 
 * Si es compleixen les condicions el programa demanarà que s'introdueixi tants valors com el número de salts s'hagi introduït. Els valors introduïts no poden ser més petits que el valor anterior.
 */
public class NaturalsEntre {
    public static void main (String [] args){
    
    //iniciem les variables
    int inici = 0;
    int fi = 0;
    int salt = 0;
    int valor = 0;
    int cont = 0;
    
    System.out.println("Valor inicial?");
    inici = Integer.parseInt(Entrada.readLine());
        if (inici<0){
            System.out.println("Valor no vàlid");
        }
        else{
            System.out.println("Valor final?");
            fi = Integer.parseInt(Entrada.readLine());
                if (fi<0 || inici>fi){
                    System.out.println("Valor no vàlid");
                }
                else{
                    System.out.println("Salt?");
                    salt = Integer.parseInt(Entrada.readLine());
                        if (salt<0){
                            System.out.println("Valor no vàlid");
                        }
                        else{   // Si es donen totes les condicions, podem fer el codi
                            valor = inici;
                                    while (valor<=fi){
                                        System.out.println(valor);
                                        valor = valor + salt;
                                    }
                        }
                }
        }       
    }    
}

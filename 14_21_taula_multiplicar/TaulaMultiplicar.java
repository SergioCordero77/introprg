/*
 * Programa que permet construir taules de multiplicar personalitzades.
El programa demanarà quatre valors numèrics: 
 - valor inicial primers operands
 - valor final primers operands
 - valor inicial segons operands
 - valors finals segons operands

En cas que un valor inicial sigui més gran que un valor final, simplement començarà pel més petit i acabarà pel més gran. */
public class TaulaMultiplicar {
    public static void main(String[] args) {
        
        // Declaració de variables
        int primer1 = Integer.parseInt(args[0]);
        int primer2 = Integer.parseInt(args[1]);
        int segon1 = Integer.parseInt(args[2]);
        int segon2 = Integer.parseInt(args[3]);
        
        System.out.println("El primer argument és " + args[0]);
        System.out.println("El segon argument és  " + args[1]);
        System.out.println("El tercer argument és " + args[2]);
        System.out.println("El quart argument és  " + args[3]);
        
        // Condicions i for segons la condició
        if (primer1 <= primer2 && segon1 <= segon2){
            for (int i = primer1; i<=primer2; i++){
                    for (int s = segon1; s<=segon2; s++){
                        System.out.println(i + " x " + s + " = " + (s*i));
                    }
            }   
        }
        else if (primer2 <= primer1 && segon1 <= segon2){
            for (int i = primer2; i<=primer1; i++){
                    for (int s = segon1; s<=segon2; s++){
                        System.out.println(i + " x " + s + " = " + (s*i));
                    }
            }
        }
        else if (primer1 <= primer2 && segon2 <= segon1){
            for (int i = primer1; i<=primer2; i++){
                    for (int s = segon2; s<=segon1; s++){
                        System.out.println(i + " x " + s + " = " + (s*i));
                    }
            }   
        }
        else{   /*(primer2 < primer1 && segon2 <= segon1)*/
            for (int i = primer2; i<=primer1; i++){
                    for (int s = segon2; s<=segon1; s++){
                        System.out.println(i + " x " + s + " = " + (s*i));
                    }
            }
        }
    }
}

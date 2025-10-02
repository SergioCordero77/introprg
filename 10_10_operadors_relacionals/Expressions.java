/*
 * Aquest programa ens diu si els enunciats son 
 * vertitat o mentida (booleans)
 *
 */
 
public class Expressions {
    public static void main (String[] args) {
        
        System.out.println("Escriu la teva edat:");
        int edat = Integer.parseInt(Entrada.readLine());
        boolean majorEdat = edat>18;
        System.out.println("La teva edat és superior als 18 anys? " + majorEdat);
        
        System.out.println();
        
        System.out.println("Escriu el número de germans:");
        int germans = Integer.parseInt(Entrada.readLine());
        boolean numeroGermans = germans <5;
        System.out.println("Tens menys de 5 germans? " + numeroGermans);
       
        System.out.println();      
        
        System.out.println("Escriu quant és 2+5:");
        int suma = Integer.parseInt(Entrada.readLine());
        boolean resultatSuma = suma ==7;
        System.out.println("La suma de 2 més 5 és igual a 7? " + resultatSuma);
        
        System.out.println();
        
        System.out.println("Escriu quant és 2+5:");
        int sumaDiferent = Integer.parseInt(Entrada.readLine());
        boolean diferenciaSuma = sumaDiferent !=7;
        System.out.println("La suma de 2 més 5 és diferent de 7? " + diferenciaSuma);
        
        System.out.println();

        System.out.println("Escriu la teva edat:");
        int edatM = Integer.parseInt(Entrada.readLine());
        boolean edatMajor = edatM+1 ==18;        
        System.out.println("L'any que ve seràs major d'edat " + edatMajor);

        System.out.println();

        System.out.println("Escriu la teva edat:");
        int edatMenor = Integer.parseInt(Entrada.readLine());
        boolean menorEdat = edatMenor-1 <18;
        System.out.println("L'any passat encara no eres major d'edat? " + menorEdat);

        System.out.println();
        
        System.out.println("Escriu quants companys hi ha a classe:");
        int companys = Integer.parseInt(Entrada.readLine());
        System.out.println("Escriu quants anys tens:");
        int edatMeva = Integer.parseInt(Entrada.readLine());
        boolean companysClasse = companys == edatMeva;
        System.out.println("Hi ha el mateix nombre de companys a classe com anys tens? " + companysClasse);

        System.out.println();
        
        System.out.println("Escriu quants companys hi ha a classe:");
        int companysEdat = Integer.parseInt(Entrada.readLine());
        boolean numeroCompanys = companysEdat ==28;
        System.out.println("Tens tants companys a classe com anys? " + numeroCompanys);

        System.out.println();

        System.out.println("Escriu quantes potes té el Renat:");
        int potes = Integer.parseInt(Entrada.readLine());
        boolean potesRenat = potes==4;
        System.out.println("El Renat té " + potes + " potes? " + potesRenat);

        System.out.println();
        
        System.out.println("Escriu quina temperatura fa:");
        int graus = Integer.parseInt(Entrada.readLine());
        boolean grausTemperatura = graus>28;
        System.out.println("Estem a més de 28 graus? " + grausTemperatura);

        System.out.println();

        // inventades

        System.out.println("Escriu quantes torres hi ha al poble:");
        int torres = Integer.parseInt(Entrada.readLine());
        boolean torresPoble = torres==3;
        System.out.println("Al poble hi ha " + torres + " torres? " + torresPoble);

        System.out.println();
        
        System.out.println("Escriu quants equips de fútbol hi ha a la lliga:");
        int equips = Integer.parseInt(Entrada.readLine());
        boolean equipsFutbol = equips<30;
        System.out.println("Hi ha menys de 30 equips de fútbol a la lliga? " + equipsFutbol);
    }
}


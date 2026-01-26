/*
 * Desenvolupa un programa que vagi demanant les notes obtingudes pels estudiants de programació en el darrer examen (com a mínim dues) i indiqui quina ha estat la nota més alta.

Les notes estaran representades en base 10 i, per tant, els valors vàlids són els números enters del 1 fins el 10.

El programa deixarà de recollir notes quan rebi un valor negatiu.

Finalment, el programa mostrarà quina ha estat la nota més alta i també mostrarà tots els valors que s'han introduit.
 */
public class NotaMesAlta {
    public static void main (String [] args){

        System.out.println("Introdueix les notes (-1 per finalitzar)");
        int nota = Integer.parseInt(Entrada.readLine());

        int notaAlta = 0;
        String notes = "";
        int cont = 0;

        while (nota != -1){
            cont++;

            notes += nota + " ";

            if (nota > notaAlta){
                notaAlta = nota;
            }

            nota = Integer.parseInt(Entrada.readLine());
        }

        String notesFinals = "";

        if (cont <= 1){
            System.out.println("Com a mínim calen dues notes");
        }
        else{
            String numero = "";
            int comptadorNotes = 0;

            for (int i = 0; i < notes.length(); i++){
                char c = notes.charAt(i);

                if (c != ' '){
                    numero += c;
                }
                else{
                    comptadorNotes++;

                    if (comptadorNotes == cont){
                        notesFinals += " i " + numero;
                    }
                    else if (comptadorNotes == cont - 1){
                        notesFinals += numero;
                    }
                    else{
                        notesFinals += numero + ", ";
                    }

                    numero = "";
                }
            }

            System.out.println( "La nota més alta és " + notaAlta + " de les introduïdes: " + notesFinals);
        }
    }
}

/* 
 * Aquesta classe representa el GatRenat amb dos atributs principals:
 * - vides: indica el nombre de vides que té el gat (per defecte 7).
 * - posicio: indica en quina posició es troba el gat ("estirat", "dret" o "assegut").
 * 
 * Inclou mètodes getters i setters per accedir i modificar aquests atributs,
 * aplicant certes restriccions per assegurar valors correctes:
 */
public class GatRenat {
   private int vides = 7;
   private String posicio = "estirat";
   
   public int getVides() {  //  retorna el nombre de vides
       return vides;
   }
   
   public void setVides(int novesVides) {   // modifica el nombre de vides si ens donen un de vàlid
       if (novesVides >= 0) {
           vides = novesVides;
       }
   }
   
   public String getPosicio(){ //retorna la posicio
       return posicio;
   }
  
   public void setPosicio(String novaPosicio) {   // modifica la posicio
       if (novaPosicio.equals("estirat") || novaPosicio.equals("dret") || novaPosicio.equals("assegut")) {
           posicio = novaPosicio;
       }
   }
}

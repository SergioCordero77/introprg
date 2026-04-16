/*
 * Classe Gat
 *
 * És la classe base de tots els tipus de gats del programa.
 *
 * Cada gat té un nom i un nombre de vides, i implementa el comportament
 * bàsic d’un ésser viu.
 *
 * Funcionament:
 *
 * - Constructors:
     - Gat(String nom)
     - Gat(String nom, int vides)
 *
 * - El nom no es pot modificar després de la creació.
 *   Si el nom és null, buit o només espais, es converteix en "anònim".
 *
 * - Mètodes:
     - getNom()   -> retorna el nom del gat
     - getVides() -> retorna el nombre de vides
     - setVides() -> modifica el nombre de vides
 *
 * - Comportament d’ésser viu (EsserViu):
     - esViu() -> retorna true si vides > 0
     - mor()   -> fa morir el gat si està viu
     - reviu() -> fa reviure el gat si està mort
 *
 */
public class Gat implements EsserViu{
    private String nom = "anònim";
    private int vides = 7;
    
/****************** constructors ******************/
    public Gat(String nom){
        if (nom==null || nom.isBlank()){
            this.nom = "anònim";
        }
        else{
            this.nom = nom;
        }
    }
    
    public Gat(String nom, int vides){
        if (nom==null || nom.isBlank()){
            this.nom = "anònim";
        }
        else{
            this.nom = nom;
        }
        
        setVides(vides);
    }
    
/****************** getters i setters ******************/
    public String getNom(){    //consulta el nom
        return nom;
    }
    
    public int getVides(){    //consulta el valor de vides
        return vides;
    }
    
    public void setVides(int vides){    //modifica el valor de vides
        this.vides = vides;
    }

/****************** mètodes ******************/
    @Override
    public boolean esViu(){
        return vides>0;
    }
    
    @Override
    public String mor(){
        if(esViu()){
            return "adéu món cruel";
        }
        else{
            return "ja l'he espifiada";
        }
    }
    
    @Override
    public String reviu(){
        if(esViu()){
            return "encara miolo";
        }
        else{
            return "guai!";
        }
    }
}

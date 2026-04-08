/*
 * Main amb els mètodes adequats per a que imprimi la sortida esperada.
 *
 * Sortida esperada:
    Neix Felí
    Neix Felí
    Neix Gat
    Neix Felí
    Neix Gat
    Neix Renat
    Felí neteja urpes des de class Feli
    Felí neteja urpes des de class Gat
    Felí neteja urpes des de class GatRenat
    Gat miola des de class Gat
    Renat miola des de class GatRenat
    Neix Menjar("bacallà")
    Renat menja bacallà des de class GatRenat
    Felí neteja urpes des de class GatRenat
    Gat menja bacallà des de class GatRenat
    Felí menja bacallà des de class GatRenat
 */
public class DemoCrides{
    public static void main (String[] args){
        Feli feli = new Feli();
        Gat gat = new Gat();
        GatRenat renat = new GatRenat();
        
        feli.netejaUrpes();
        gat.netejaUrpes();
        renat.netejaUrpes();
        
        gat.miola();
        renat.miola();
        
        Menjar bacalla = new Menjar("bacalla");
        
        renat.menja(bacalla);
    }
}

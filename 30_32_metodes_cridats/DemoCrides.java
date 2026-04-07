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

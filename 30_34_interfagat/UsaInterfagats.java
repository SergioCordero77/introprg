/*
 * Programa principal que serveix per provar el funcionament
 * d’una jerarquia de classes de gats i les seves interfícies.
 *
 * Objectiu:
 * - Comprovar el comportament de diferents tipus de Gat:
 *   - GatRenat (ensinistrable i animal de companyia)
 *   - Garfield (animal de companyia)
 *   - GatSalvatge (només Gat)
 *   - Gat genèric (Gargamel)
 *
 * El programa treballa amb arrays polimòrfics per verificar:
 *
 * 1. Interfície Ensinistrable:
 *    - aixecat()
 *    - seu()
 *    - estirat()
 *    - esDret(), esAssegut(), esEstirat()
 *
 * 2. Interfície AnimalDeCompanyia:
 *    - deixatEstimar()
 *
 * 3. Interfície EsserViu:
 *    - esViu()
 *    - mor()
 *    - reviu()
 *
 * 4. Classe Gat:
 *    - getNom()
 *    - gestió de vides (setVides, getVides)
 *    - comportament de vida i mort
 *
 * El programa imprimeix per pantalla els resultats de cada prova
 * per comprovar que la implementació és correcta.
 *
 */
public class UsaInterfagats {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        Garfield garfield = new Garfield();
        GatSalvatge gatSalvatge = new GatSalvatge();
        Gat gargamel = new Gat("Gargamel");
        Gat[] gats = { renat, garfield, gatSalvatge, gargamel };
        AnimalDeCompanyia[] animalsDeCompanyia = { renat, garfield };
        Ensinistrable[] ensinistrables = { renat };
        EsserViu[] essersVius = {renat, garfield, gatSalvatge, gargamel };

        System.out.println("Comprovem els mètodes de ensinistrable");
        System.out.println("======================================");
        // XXX per cada element de l'array ensinistrable crida els
        // serveis següents en l'ordre indicat i mostra el seu resultat:
        for (Ensinistrable ensinistrable: ensinistrables) {
            // 1. demana que s'aixequi
            System.out.println(ensinistrable.aixecat());
            // 2. demana si està dret
            System.out.println(ensinistrable.esDret());
            // 3. demana que segui
            System.out.println(ensinistrable.seu());
            // 4. demana si està assegut
            System.out.println(ensinistrable.esAssegut());
            // 5. demana que s'estiri
            System.out.println(ensinistrable.estirat());
            // 6. demana si està estirat
            System.out.println(ensinistrable.esEstirat());
        }


        System.out.println();
        System.out.println("Comprovem els mètodes d'AnimalDeCompanyia");
        System.out.println("=========================================");
        // XXX per cada element de l'array animalsDeCompanyia crida els
        // serveis següents en l'ordre indicat i mostra el seu resultat:
        for (AnimalDeCompanyia animalDeCompanyia: animalsDeCompanyia) {
            // 1. demana que es deuxi estimar
            System.out.println(animalDeCompanyia.deixatEstimar());
        }

        System.out.println();
        System.out.println("Comprovem els mètodes d'Esser viu");
        System.out.println("=================================");
        // XXX per cada element de l'array essersVius crida els
        // serveis següents en l'ordre indicat i mostra el seu resultat:
        for (EsserViu esserViu: essersVius) {
            // 1. demana si està viu
            System.out.println(esserViu.esViu());
            // 2. demana que mori
            System.out.println(esserViu.mor());
            // 3. demana que revisqui
            System.out.println(esserViu.reviu());
        }
        
        System.out.println();
        System.out.println("Comprovem els mètodes de Gat");
        System.out.println("============================");
        // XXX per cada element de l'array gats crida els
        // serveis següents en l'ordre indicat i mostra el seu resultat:
        for (Gat gat: gats) {
            // 1. demana el nom
            System.out.println(gat.getNom());
            // 2. assigna-li una única vida
            gat.setVides(1);
            // 3. demana que revisqui
            System.out.println(gat.reviu());
            // 4. demana que mori
            System.out.println(gat.mor());
            gat.setVides(0);
            // 5. demana que mori un altre cop
            System.out.println(gat.mor());
            // 6. demana si està viu
            System.out.println(gat.esViu());
            // 7. demana que revisqui
            System.out.println(gat.reviu());
            gat.setVides(1);
            // 8. demana quantes vides li queden
            System.out.println(gat.getVides());
        }

    }
}

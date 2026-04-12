/*
 * Interfície AnimalDeCompanyia
 *
 * Representa el comportament d’un animal que pot conviure amb humans
 * i permetre ser estimat.
 *
 * Qualsevol classe que implementi aquesta interfície ha de definir
 * el comportament de deixar-se estimar.
 *
 * Mètodes:
 * - String deixatEstimar() -> retorna el missatge quan l’animal es deixa estimar
 */
public interface AnimalDeCompanyia{

    public String deixatEstimar();
}

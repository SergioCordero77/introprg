/* Utilitats de confirmació
 *
 * Aquest mòdul conté diferents utilitats per gestionar les confirmacions
 * Bé, de moment només en tenim una però potser anirem ampliant-ho
 */
public class UtilitatsConfirmacio {
    /*
     * Donada una resposta textual, aquesta funció tradueix la resposta a
     * un booleà.
     * Considera true quan la resposta és "si".
     * Altrament considera false.
     */
    public static boolean respostaABoolean(String resposta) {
        if (resposta.equals("si")) {
            return true;
        }
        else{
            return false;
        }
    }
}

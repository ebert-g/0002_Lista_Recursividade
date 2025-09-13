package ex07;

public class Palindromo {
    public static void main(String[] args) {
        String frase = "anotaram a data da maratona";
        System.out.println(ePalindromo(frase));

    }

    public static String ePalindromo(String frase) {
        String replaceFrase = frase.toLowerCase().replace(" ", "");
        if (replaceFrase.length() <= 1) {
            return "\nPALINDROMO";
        } else {
            if (replaceFrase.charAt(0) == replaceFrase.charAt(replaceFrase.length() - 1)) {
                return ePalindromo(replaceFrase.substring(1, (replaceFrase.length() - 1)));
            } else {
                return "\nNÃO É ! PALINDRMO";
            }
        }
    }
}

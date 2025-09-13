package ex11;

public class InverteString {

    public static void main(String[] args) {
        String frase = "ARARA";
        System.out.println("SAIDA: " + inverteString(frase));

    }

    public static String inverteString(String frase) {

        if (frase.length() == 1) {
            // return String.valueOf(frase.charAt(frase.length() - 1));
            return frase;
        } else {
            return String.valueOf(frase.charAt(frase.length() - 1))
                    + inverteString(frase.substring(0, frase.length() - 1));
        }

    }

}

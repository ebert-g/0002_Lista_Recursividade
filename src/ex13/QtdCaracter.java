package ex13;

public class QtdCaracter {
    public static void main(String[] args) {
        String frase = "arar*aaaaaa*aaaa*aaa*";
        String caracter = "*";

        System.out.println("Saida: " + qtdCaracter(frase, caracter));

    }

    public static int qtdCaracter(String frase, String caracter) {
        frase = frase.toLowerCase();
        caracter = caracter.toLowerCase();
        if (frase.length() == 1) {
            if (caracter.charAt(0) == frase.charAt(0)) {
                return 1;
            } else {
                return 0;
            }
        }
        if (caracter.charAt(0) == frase.charAt(0)) {

            return 1 + qtdCaracter(frase.substring(1, frase.length()), caracter);
        } else {
            return qtdCaracter(frase.substring(1, frase.length()), caracter);
        }

    }
}

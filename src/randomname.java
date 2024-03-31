import java.security.SecureRandom;

public class randomname {
    public static void main(String[] args) {
        int comprimento = 10; // Comprimento da palavra desejada

        String caracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        SecureRandom random = new SecureRandom();
        
        StringBuilder palavraAleatoria = new StringBuilder();

        for (int i = 0; i < comprimento; i++) {
            int index = random.nextInt(caracteresPermitidos.length());
            char caractereAleatorio = caracteresPermitidos.charAt(index);
            palavraAleatoria.append(caractereAleatorio);
        }

        System.out.println("Palavra aleatória: " + palavraAleatoria.toString());
    }
}

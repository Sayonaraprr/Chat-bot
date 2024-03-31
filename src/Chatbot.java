import java.util.Scanner;
import java.security.SecureRandom;

public class Chatbot {
    public static void main(String[] args) throws Exception {
        int Comprimento = 10;

        String CaracteresPermitidos = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789*#$";
        SecureRandom random = new SecureRandom();

        StringBuilder PalavraAleatoria = new StringBuilder();

        for (int i = 0; i < Comprimento; i++) {
            int index = random.nextInt(CaracteresPermitidos.length());
            char caractereAleatorio = CaracteresPermitidos.charAt(index);
            PalavraAleatoria.append(caractereAleatorio);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá e Bem vindo ao ChatJob! Vamos realizar o seu cadastro!");
        System.out.println("Essa é a sua palavra aleatória: " + PalavraAleatoria.toString() + "\n");
        
        System.out.println("Digite o seu nome:");
        String Nstr = scanner.nextLine();
        System.out.println("\n");

        System.out.println("Digite o seu CPF:");
        String CPFstr = scanner.nextLine();
        System.out.println("\n");

        System.out.println("Digite o seu CEP:");
        String CEPstr = scanner.nextLine();
        System.out.println("\n");

        System.out.println("Digite a sua senha: ");
        String Pass = scanner.nextLine();
        System.out.println("\n");

        System.out.println("Confirme a sua senha");
        String Passcheck = scanner.nextLine();
        System.out.println("\n");

        System.out.println("Confirme a palavra de segurança:");
        String Aleatoriocheck = scanner.nextLine();
        System.out.println("\n");

        if (Pass.equals(Passcheck) && PalavraAleatoria.toString().equals(Aleatoriocheck)) {
            System.out.println("***********************************");
            System.out.println("Senha e Palavra aleatória confirmadas!\n");
            System.out.println("Cadastro realizado!");
            System.out.println("***********************************");
            System.out.println("Essas são as suas informações de cadastro:\nNome:" + Nstr + "\nCPF:" + CPFstr + "\nCEP:" 
            + CEPstr + "\nSenha:" + Passcheck);
            System.out.println("***********************************");

        } else {
            System.out.println("***********************************");
            System.out.println("Senha ou Palavra Aleatória incorretas! Cadastro resetado!");
            System.out.println("***********************************");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int senha;

        do {
            System.out.print("Digite a senha: ");
            senha = scanner.nextInt();

            if (senha != 1234) {
                System.out.println("Senha incorreta!");
            }

        } while (senha != 1234);

        System.out.println("Acesso permitido!");

        scanner.close();
    }
}

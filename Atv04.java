import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Olá");
            System.out.println("2 - Mostrar número");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Olá!");
                    break;

                case 2:
                    System.out.print("Digite um número: ");
                    int numero = scanner.nextInt();
                    System.out.println("Número: " + numero);
                    break;

                case 3:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        scanner.close();
    }
}

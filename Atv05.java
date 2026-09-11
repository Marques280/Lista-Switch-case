import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldo = 500.00;
        double valor;
        int opcao;

        do {
            System.out.println("\n===== CAIXA ELETRÔNICO =====");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Sair");
            System.out.print("Escolha: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    System.out.printf("Saldo: R$ %.2f%n", saldo);
                    break;

                case 2:
                    System.out.print("Digite o valor do depósito: R$ ");
                    valor = scanner.nextDouble();

                    if (valor > 0) {
                        saldo = saldo + valor;
                        System.out.printf("Depósito realizado! Saldo: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Valor inválido!");
                    }
                    break;

                case 3:
                    System.out.print("Digite o valor do saque: R$ ");
                    valor = scanner.nextDouble();

                    if (valor > 0 && valor <= saldo) {
                        saldo = saldo - valor;
                        System.out.printf("Saque realizado! Saldo: R$ %.2f%n", saldo);
                    } else {
                        System.out.println("Saldo insuficiente ou valor inválido!");
                    }
                    break;

                case 4:
                    System.out.println("Programa encerrado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 4);

        scanner.close();
    }
}

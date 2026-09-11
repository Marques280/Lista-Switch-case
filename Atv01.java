import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número de 1 a 7: ");
        int numero = scanner.nextInt();

        switch (numero) {
            case 1:
                System.out.println("Dia: Segunda-feira");
                break;
            case 2:
                System.out.println("Dia: Terça-feira");
                break;
            case 3:
                System.out.println("Dia: Quarta-feira");
                break;
            case 4:
                System.out.println("Dia: Quinta-feira");
                break;
            case 5:
                System.out.println("Dia: Sexta-feira");
                break;
            case 6:
                System.out.println("Dia: Sábado");
                break;
            case 7:
                System.out.println("Dia: Domingo");
                break;
            default:
                System.out.println("Número inválido!");
        }

        scanner.close();
    }
}

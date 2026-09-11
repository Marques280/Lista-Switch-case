public class Exercicio2 {
    public static void main(String[] args) {

        int numero = 1;
        int soma = 0;

        while (numero <= 10) {
            System.out.println(numero);

            soma = soma + numero;

            numero++;
        }

        System.out.println("Soma = " + soma);
    }
}

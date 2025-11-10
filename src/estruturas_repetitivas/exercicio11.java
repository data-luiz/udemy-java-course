package estruturas_repetitivas;
import java.util.Scanner;

// Exercício 11 - Ler um número inteiro N e calcular todos os seus divisores.

public class exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");

        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            if (n % i == 0) {
                System.out.printf("%d é um divisor de %d%n", i, n);
            }
        }

        sc.close();

    }
}

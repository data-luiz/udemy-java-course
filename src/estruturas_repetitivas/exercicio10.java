package estruturas_repetitivas;
import java.util.Scanner;

// Exercício 10 - Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
//Lembrando que, por definição, fatorial de 0 é 1.

public class exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número para calcular o fatorial: ");

        int n = sc.nextInt();
        int fatorial = 1;

        for (int i = n; i > 1;  i--) {
            fatorial *= i;
        }

        System.out.printf("O fatorial de %d é %d%n", n, fatorial);

        sc.close();
    }
}

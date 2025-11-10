package estruturas_repetitivas;
import java.util.Scanner;

// Exercício 12 - Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas,
//começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o cubo do valor, conforme
//exemplo.

public class exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            int quadrado = i * i;
            int cubo = i * i * i;
            System.out.printf("%d %d %d%n", i, quadrado, cubo);
        }


    }
}

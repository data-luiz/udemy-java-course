package estruturas_condicionais;
import java.util.Scanner;

// Exercício 3 - Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.println("Digite um número inteiro: ");
        x = sc.nextInt();

        if (x % 2 == 0) {
        System.out.println("O número " + x + " é par.");
        } else {
            System.out.println("O número " + x + " é ímpar.");

        sc.close();

        }
    }
}

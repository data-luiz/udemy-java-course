package estruturas_condicionais;
import java.util.Scanner;

// Exercício 04 - Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B;

        System.out.println("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        B = sc.nextInt();

        if (A % B == 0 || B % A == 0) {
            System.out.println("São múltiplos");
        } else {
            System.out.println("Não são múltiplos");
        }

        sc.close();

    }
}

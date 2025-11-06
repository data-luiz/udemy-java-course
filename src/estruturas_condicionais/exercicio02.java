package estruturas_condicionais;
import java.util.Scanner;

// Exercício 02 - Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;

        System.out.print("Digite um número inteiro: ");
        x = sc.nextInt();

        if (x >= 0) {
            System.out.println("O número é positivo.");
        } else {
            System.out.println("O número é negativo.");

        sc.close();

        }
    }
}

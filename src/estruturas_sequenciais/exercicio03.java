package estruturas_sequenciais;
import java.util.Scanner;

// Exercício 3 - Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).


public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A, B, C, D, diferenca;

        System.out.println("Digite o valor de A: ");
        A = sc.nextInt();
        System.out.println("Digite o valor de B: ");
        B = sc.nextInt();
        System.out.println("Digite o valor de C: ");
        C = sc.nextInt();
        System.out.println("Digite o valor de D: ");
        D = sc.nextInt();

        diferenca = (A * B) - (C * D);
        System.out.println("Diferença = " + diferenca);

        sc.close();
    }
}

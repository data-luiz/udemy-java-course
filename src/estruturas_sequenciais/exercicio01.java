package estruturas_sequenciais;
import java.util.Scanner;

// Exercício 01 - Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, soma;

        System.out.println("Digite o primeiro valor inteiro: ");
        A = sc.nextInt();

        System.out.println("Digite o segundo valor inteiro: ");
        B = sc.nextInt();

        soma = A + B;
        System.out.printf("A soma entre %d e %d é dê: %d", A, B, soma);

        sc.close();
    }
}


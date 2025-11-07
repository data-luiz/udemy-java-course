package estruturas_repetitivas;
import java.util.Scanner;

// Exercício 01 - Escreva um programa que leia uma sequência de números inteiros do usuário e calcule a soma desses números.
// O programa deve continuar lendo números até que o usuário digite o número 0, que indica o fim da entrada.
// Após a entrada do número 0, o programa deve exibir a soma total dos números digitados.

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite números para somar (0 para sair):");

        int x = sc.nextInt();
        int soma = 0;

        while (x != 0) {
            soma += x;
            x = sc.nextInt();
        }

        System.out.println(soma);

        sc.close();
    }
}

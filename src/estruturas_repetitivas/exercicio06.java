package estruturas_repetitivas;
import java.util.Scanner;

// Exercício 06 - Leia um valor e mostre os impares até esse valor.

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");

        int N = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        sc.close();

    }
}

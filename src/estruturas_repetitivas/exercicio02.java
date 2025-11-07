package estruturas_repetitivas;
import java.util.Scanner;

// Exercício 2 - Escreva um programa que repita a leitura de uma senha até que ela seja válida. Para cada leitura de senha
//incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for informada corretamente deve ser
//impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que a senha correta é 159951.

public class exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a senha: ");
        int senha = sc.nextInt();

        while (senha != 159951) {
            System.out.println("Senha inválida. Tente novamente.");
            System.out.println("Digite a senha: ");
            senha = sc.nextInt();
        }

        System.out.println("Acesso permitido");

        sc.close();
    }
}

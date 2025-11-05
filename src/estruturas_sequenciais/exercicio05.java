package estruturas_sequenciais;
import java.util.Scanner;
import java.util.Locale;

// Exercício 05 - Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

public class exercicio05 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo1, quantidade1, codigo2, quantidade2;
        double valorUnitario1, valorUnitario2 , valorTotal;

        System.out.println("Digite o código, a quantidade e o valor unitário do primeiro produto:");
        codigo1 = sc.nextInt();
        quantidade1 = sc.nextInt();
        valorUnitario1 = sc.nextDouble();

        System.out.println("Digite o código, a quantidade e o valor unitário do segundo produto:");
        codigo2 = sc.nextInt();
        quantidade2 = sc.nextInt();
        valorUnitario2 = sc.nextDouble();

        valorTotal = (quantidade1 * valorUnitario1) + (quantidade2 * valorUnitario2);
        System.out.printf("Valor total da compra: R$ %.2f%n", valorTotal);

        sc.close();
    }
}

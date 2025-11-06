package estruturas_condicionais;
import java.util.Scanner;

// Exercício 06 - Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

public class exercicio06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int codigo, quantidade;
        double preco, total;

        System.out.println("Código do produto (1-5): ");
        codigo = sc.nextInt();
        System.out.println("Quantidade: ");
        quantidade = sc.nextInt();

        if (codigo == 1) {
            preco = 4.00;
        } else if (codigo == 2) {
            preco = 4.50;
        } else if (codigo == 3) {
            preco = 5.00;
        } else if (codigo == 4) {
            preco = 2.00;
        } else if (codigo == 5) {
            preco = 1.50;
        } else {
            preco = 0.0;
        }

        total = preco * quantidade;
        System.out.printf("Total: R$%.2f%n", total);

        sc.close();

    }
}

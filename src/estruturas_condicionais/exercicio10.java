package estruturas_condicionais;
import java.util.Locale;
import java.util.Scanner;

// Exercício 10 - Uma operadora de telefonia cobra R$50,00 por um plano básico que dá direito a 100 minutos de
// telefone. Cada minuto que exceder a franquia de 100 minutos custa R$2,00. Fazer um programa que leia a quantidade de minutos
// consumidos por um cliente, calcule e escreva o valor a ser pago pelo cliente.

public class exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de minutos consumidos: ");

        int minutos = sc.nextInt();
        double conta = 50.0;

        if (minutos > 100) {
            conta += (minutos - 100) * 2.0;
            System.out.println("Valor a ser pago: R$ " + conta);
        } else {
            conta = 50.0;
            System.out.printf("Valor a ser pago: R$ %.2f%n", conta);
        }

        sc.close();

    }
}

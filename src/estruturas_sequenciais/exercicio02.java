package estruturas_sequenciais;
import java.util.Scanner;
import java.util.Locale;

// Exercício 2 - Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.

public class exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double raio, area;

        System.out.println("Digite o valor do raio do círculo: ");
        raio = sc.nextDouble();

        area = Math.PI * Math.pow(raio, 2);
        System.out.printf("A área do círculo de raio %.2f é: %.4f%n", raio, area);

        sc.close();
    }
}

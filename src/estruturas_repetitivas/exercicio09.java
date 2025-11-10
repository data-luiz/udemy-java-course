package estruturas_repetitivas;
import java.util.Scanner;

// Exercício 09 - Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

public class exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de pares que serão divididos:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Digite o par de números (dividendo e divisor):");
            int a = sc.nextInt();
            int b= sc.nextInt();

            if (b == 0) {
                System.out.println("Divisao impossivel");
            } else {
                double resultado = (double) a / b;
                System.out.printf("Resultado: %.1f%n", resultado);
            }
        }
    }
}

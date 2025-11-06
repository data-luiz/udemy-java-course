package estruturas_condicionais;
import java.util.Scanner;

// Exercício 1: Escreva um programa que leia a hora do dia (um número inteiro de 0 a 23) e imprima uma mensagem apropriada.

public class exercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Digite a hora do dia (0-23): ");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia!");
        } else if (hora < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }

        sc.close();
    }
}

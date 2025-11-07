package estruturas_repetitivas;
import java.util.Scanner;

// Exercício 3 - Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema
//cartesiano. Para cada ponto escrever o quadrante a que ele pertence.

public class exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite as coordenadas X e Y:");
        int X = sc.nextInt();
        int Y = sc.nextInt();

        while (X != 0 && Y != 0) {
            if (X > 0 && Y > 0) {
                System.out.println("Primeiro Quadrante");
                break;
            } else if (X > 0 && Y < 0) {
                System.out.println("Quarto Quadrante");
                break;
            } else if (X < 0 && Y > 0) {
                System.out.println("Segundo Quadrante");
                break;
            } else if (X < 0 && Y < 0) {
                System.out.println("Terceiro Quadrante");
                break;
            }
        }
        if (X == 0 || Y == 0) {
            System.out.println("Zeros não são permitidos. Programa encerrado.");
        }

        sc.close();
    }
}

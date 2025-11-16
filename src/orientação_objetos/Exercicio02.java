package orientação_objetos;

import entities.Rectangle;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();

        System.out.println("Digite o valor da altura: ");
        rectangle.high = sc.nextDouble();
        System.out.println("Digite o valor da largura: ");
        rectangle.width = sc.nextDouble();

        System.out.println();
        System.out.println("Área:" + rectangle.area());
        System.out.println("Perimeter:" + rectangle.perimeter());
        System.out.println("Diagonal:" + rectangle.diagonal());

        sc.close();
    }
}

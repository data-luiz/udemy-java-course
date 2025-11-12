package orientação_objetos;

import entities.Triangle;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x, y;
        x = new Triangle();
        y = new Triangle();

        System.out.println("Digite as medidas do triangulo x:");
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        System.out.println("Digite as medidas do triangulo y:");
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        double areaX = x.calcularArea();
        double areaY = y.calcularArea();

        resultadoCalculo(areaX, areaY);

        sc.close();
    }

    public static void resultadoCalculo (double areaX, double areaY) {

        System.out.printf("Triângulo X: %.4f%n", areaX);
        System.out.printf("Triângulo Y: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Triangulo X > Triangulo Y");
        }
        else if (areaY > areaX) {
            System.out.println("Triangulo Y > Triangulo X");
        }
        else if (areaX == areaY) {
            System.out.println("Triangulo X == Triangulo Y");
        }
        else {
            System.out.println("Triângulo inválido!");
        }
    }
}

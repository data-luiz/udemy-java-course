package orientação_objetos;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double xA, xB, xC, yA, yB, yC;

        System.out.println("Digite as medidas do triangulo x:");
        xA = sc.nextDouble();
        xB = sc.nextDouble();
        xC = sc.nextDouble();

        System.out.println("Digite as medidas do triangulo y:");
        yA = sc.nextDouble();
        yB = sc.nextDouble();
        yC = sc.nextDouble();

        double areaX = calcularArea(xA, xB, xC);
        double areaY = calcularArea(yA, yB, yC);

        resultadoCalculo(areaX, areaY);

        sc.close();
    }

    public static double calcularArea(double a, double b, double c) {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
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
        else {
            System.out.println("Triangulo X == Triangulo Y");
        }

    }
}

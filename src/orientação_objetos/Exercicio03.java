package orientação_objetos;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee emp = new Employee();

        System.out.print("Digite o seu nome: ");
        emp.name = sc.nextLine();

        System.out.print("Digite o seu salário bruto: ");
        emp.grossSalary = sc.nextDouble();

        System.out.print("Digite a porcentagem do imposto: ");
        emp.tax = sc.nextDouble();

        System.out.println();
        System.out.println("Funcionário:");
        System.out.println(emp);

        System.out.println();
        System.out.print("Digite a porcentagem do aumento: ");
        double percentageIncrease = sc.nextDouble();
        emp.increaseSalary(percentageIncrease);

        System.out.println();
        System.out.println("Valor atualizado:");
        System.out.println(emp);

        sc.close();
    }
}


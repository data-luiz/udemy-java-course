package orientação_objetos;

import entities.Student;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        Student student = new Student();

        System.out.println("Nome do estudante: ");
        student.name = sc.nextLine();
        System.out.println("Nota do primeiro trimestre: ");
        student.grade1 = sc.nextDouble();
        System.out.println("Nota do segundo trimestre: ");
        student.grade2 = sc.nextDouble();
        System.out.println("Nota do terceiro trimestre: ");
        student.grade3 = sc.nextDouble();

        System.out.println();

        System.out.println(student);

        sc.close();
    }
}

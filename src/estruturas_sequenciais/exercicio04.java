package estruturas_sequenciais;
import java.util.Locale;
import java.util.Scanner;

// Exercício 04 - Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

public class exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroFuncionario, horasTrabalhadas;
        double valorPorHora, salario;

        System.out.print("Digite o número do funcionário: ");
        numeroFuncionario = sc.nextInt();

        System.out.println("Digite o número de horas trabalhadas: ");
        horasTrabalhadas = sc.nextInt();

        System.out.println("Digite o valor que recebe por hora: ");
        valorPorHora = sc.nextDouble();

        salario = horasTrabalhadas * valorPorHora;
        System.out.println("Número do Funcionário: " + numeroFuncionario);;
        System.out.printf("Salário: R$ %.2f%n", salario);

        sc.close();
    }
}

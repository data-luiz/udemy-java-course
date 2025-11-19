package orientação_objetos;

import entities.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Valor do Dolár: ");
        double dollars = sc.nextDouble();
        System.out.println("Quantidade que deseja comprar: ");
        double quantity = sc.nextDouble();

        double amount = CurrencyConverter.calculateDollars(dollars, quantity);
        System.out.printf("Valor da compra: R$ %.2f\n", amount);



    }

}

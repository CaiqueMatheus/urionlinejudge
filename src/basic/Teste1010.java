package basic;

import java.util.Scanner;

public class Teste1010 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        int pecasUm = dados.nextInt();
        double valorUm = dados.nextDouble();
        double totalUm = valorUm * pecasUm;

        int pecasDois = dados.nextInt();
        double valorDois = dados.nextDouble();
        double totalDois = valorDois * pecasDois;

        double total = totalUm + totalDois;

        System.out.printf("VALOR A PAGAR: R$ %.2f", total);
        System.out.println();
    }
}

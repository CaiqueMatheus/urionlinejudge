package basic;

import java.util.Scanner;

public class Teste1009 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        String nome = dados.nextLine();
        double saalarioFixo = dados.nextDouble();
        double vendas = dados.nextDouble();

        double comissao = (15 * vendas) / 100;
        double salario = saalarioFixo + comissao;

        System.out.printf("TOTAL = R$ %.2f", salario);
        System.out.println();
    }
}

package basic;

import java.util.Scanner;

public class Teste1008 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        int id = dados.nextInt();
        int horasTrabalhadas = dados.nextInt();
        double salarioPorHora = dados.nextDouble();

        double salario = salarioPorHora * horasTrabalhadas;

        System.out.println("NUMBER = " + id);
        System.out.printf("SALARY = U$ %.2f", salario);
        System.out.println();
    }
}

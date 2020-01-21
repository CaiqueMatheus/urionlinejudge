package basic;

import java.util.Scanner;

public class Teste1002 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        double pi = 3.14159;
        double raio = dados.nextDouble();

        double area = pi * (raio * raio);

        System.out.printf("A=%.4f", area);
        System.out.println();
    }
}

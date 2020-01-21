package basic;

import java.util.Scanner;

public class Teste1015 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        double x1 = dados.nextDouble();
        double y1 = dados.nextDouble();
        double x2 = dados.nextDouble();
        double y2 = dados.nextDouble();

        double p1 = x2 - x1;
        double p2 = y2 - y1;

        double result = (p1*p1) + (p2*p2);

        double resultado = Math.sqrt(result);

        System.out.printf("%.4f", resultado);
    }
}

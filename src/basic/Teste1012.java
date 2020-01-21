package basic;

import java.util.Scanner;

public class Teste1012 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);

        double a = dados.nextDouble();
        double b = dados.nextDouble();
        double c = dados.nextDouble();

        double pi = 3.14159;

        double triangulo = (a * c) / 2;
        double circulo = pi * (c * c);
        double trapezio = ((a * c) + (b * c)) / 2;
        double quadrado = b * b;
        double retangulo = a * b;

        System.out.printf("TRIANGULO: %.3f \n", triangulo);
        System.out.printf("CIRCULO: %.3f \n", circulo);
        System.out.printf("TRAPEZIO: %.3f \n", trapezio);
        System.out.printf("QUADRADO: %.3f \n", quadrado);
        System.out.printf("RETANGULO: %.3f \n", retangulo);
        System.out.println();
    }
}

package basic;

import java.util.Scanner;

public class Teste1011 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        double raio = dados.nextDouble();
        double pi = 3.14159;

        double volume = 4 / 3.0 * (pi * (raio * raio * raio));

        System.out.printf("VOLUME = %.3f", volume);
        System.out.println();
    }
}

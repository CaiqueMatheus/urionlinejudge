package basic;

import java.util.Scanner;

public class Teste1006 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        double a = dados.nextDouble();
        double b = dados.nextDouble();
        double c = dados.nextDouble();

        double pesoUm = 2;
        double pesoDois = 3;
        double pesoTres = 5;

        double peso = pesoUm + pesoDois + pesoTres;

        double media = ((a * pesoUm) + (b * pesoDois) + (c * pesoTres)) / peso;

        System.out.printf("MEDIA = %.1f", media);
        System.out.println();
    }
}

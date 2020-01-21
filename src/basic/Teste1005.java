package basic;

import java.util.Scanner;

public class Teste1005 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        double a = dados.nextDouble();
        double b = dados.nextDouble();

        double pUm = 3.5;
        double pDois = 7.5;

        double media = (a * pUm + b * pDois) / (pUm + pDois);

        System.out.printf("MEDIA = %.5f", media);
        System.out.println();
    }
}

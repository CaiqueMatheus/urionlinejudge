package basic;

import java.util.Scanner;

public class Teste1007 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        int a = dados.nextInt();
        int b = dados.nextInt();
        int c = dados.nextInt();
        int d = dados.nextInt();

        int diferenca = (a * b) - (c * d);

        System.out.println("DIFERENCA = " + diferenca);
    }
}

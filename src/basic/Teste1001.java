package basic;

import java.util.Scanner;

public class Teste1001 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        int a = dados.nextInt();
        int b = dados.nextInt();

        int x = a + b;

        dados.close();

        System.out.println("X = " + x);
    }
}

package basic;

import java.util.Scanner;

public class Teste1013 {
    public static void main(String[] args) {

        Scanner dados = new Scanner(System.in);

        int a = dados.nextInt();
        int b = dados.nextInt();
        int c = dados.nextInt();

        int ab = Math.max(a, b);
        int bc = Math.max(b, c);
        int resultado = Math.max(ab, bc);

        System.out.println(resultado + " eh o maior");
    }
}

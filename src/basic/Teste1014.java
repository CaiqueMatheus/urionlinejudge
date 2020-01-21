package basic;

import java.util.Scanner;

public class Teste1014 {
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);

        int x = dados.nextInt();
        double y = dados.nextDouble();

        System.out.printf("%.3f", x / y);
        System.out.println(" km/l");
    }
}

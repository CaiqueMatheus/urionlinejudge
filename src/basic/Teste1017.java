package basic;

import java.util.Scanner;

public class Teste1017 {
    public static void main(String[] args){
        Scanner dados = new Scanner(System.in);

        double tempo = dados.nextInt();
        double velocidade = dados.nextInt();

        double combustivel = (velocidade * tempo) / 12;

        System.out.printf("%.3f", combustivel);
        System.out.println();
    }
}

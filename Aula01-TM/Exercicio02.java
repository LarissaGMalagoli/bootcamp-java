package com.meli.aula03.TMAula1;
import java.util.Scanner;

public class Exercicio02 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int m = input.nextInt();
            int n = input.nextInt();
            for (int i = 1; i <= n; i++) {
                System.out.println(i * m);
            }
        }
}

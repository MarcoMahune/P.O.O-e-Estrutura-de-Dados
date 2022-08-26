package Atividades;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {

        Scanner enterScanner = new Scanner(System.in);
        int A; int B; int X;

        A= enterScanner.nextInt();
        B= enterScanner.nextInt();
        X= A + B;

        System.out.println("X = "+ X);

    }

}

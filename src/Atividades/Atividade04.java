package Atividades;

import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int A = input.nextInt();
        int B = input.nextInt();
        int PROD = A * B;

        System.out.println("PROD = " + PROD);

        input.close();
    }
}

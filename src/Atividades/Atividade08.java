package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int numeroFuncionario = input.nextInt();
        int qtdHorasTrabalhadas = input.nextInt();

        double valorHora = input.nextDouble();
        double salario = qtdHorasTrabalhadas * valorHora;

        System.out.println("NUMBER = " + numeroFuncionario);
        System.out.printf("SALARY = U$ %.2f%n", salario);

        input.close();
    }
}


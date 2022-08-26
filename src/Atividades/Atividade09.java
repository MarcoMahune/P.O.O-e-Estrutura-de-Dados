package Atividades;

import java.util.Locale;
import java.util.Scanner;

public class Atividade09 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String nomedoFuncionario= input.next();
        double salariofixo = input.nextDouble();
        double vendasEfetuadas = input.nextDouble();
        double comissao = vendasEfetuadas * 0.15;
        double salarioFinal = salariofixo + comissao;

        System.out.printf("TOTAL = R$ %.2f%n", salarioFinal);

        input.close();

    }
}

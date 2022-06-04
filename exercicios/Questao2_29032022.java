import java.util.Scanner;

public class Questao2_29032022 {
    /*---------------------------------------------------------
     Questão2:

     Considere um programa que deve classificar um número como par ou ímpar e, além disso,
     classificar ele como menor do que 100 ou maior ou igual a 100.
     Escreva um programa que faça essa classificação corretamente.

     ----------------------------------------------------------*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 == 0)
            System.out.println(number + " é número PAR e" + compareWith100(number));
        else
            System.out.println(number + " é número ÍMPAR e" + compareWith100(number));
        scanner.close();
    }
    private static String compareWith100(int number) {
        if (number < 100) {
            return " MENOR do que 100.";
        } else if (number == 100) {
            return " IGUAL a 100.";
        } else {
            return " MAIOR do que 100.";
        }
    }
}

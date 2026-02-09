package exercicioTres;

import java.util.Scanner;

public class exercicioTres {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

           System.out.println("Escreva o Primeiro Numero: ");

            int n1 = scanner.nextInt();
            int n2;

        do {
            System.out.print("Digite o Segundo Numero: ");

            n2 = scanner.nextInt();

            if (n2 <= n1) {
                System.out.println("Erro! O segundo número deve ser MAIOR e DIFERENTE.");
            }

        } while (n2 <= n1);

        // Escolha par ou ímpar
        System.out.print("Você quer ver (P)ares ou (I)mpares? ");
        String escolha = scanner.next().toUpperCase();

        System.out.println("\nResultado:");

        // Loop decrescente
        for (int i = n2; i >= n1; i--) {

            if (escolha.equals("P") && i % 2 == 0) {
                System.out.println(i);
            }
            else if (escolha.equals("I") && i % 2 != 0) {
                System.out.println(i);
            }
        }

        scanner.close();
    }
}

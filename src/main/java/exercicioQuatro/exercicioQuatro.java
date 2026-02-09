package exercicioQuatro;

import java.util.Scanner;

public class exercicioQuatro {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o Primeiro Numero: ");

        int n1 = scanner.nextInt();


        while (true) {
            System.out.print("Informe o Segundo Numero para Verificação: ");

            var n2 = scanner.nextInt();

            if (n2 < n1) {
                System.out.printf("Erro! O segundo número deve ser MAIOR que %s \n", n1);
                continue;
            }

            var result = n2 % n1;

            System.out.printf("%s %% %s = %s \n", n2 , n1, result);
            if(result != 0) break;

        }

        scanner.close();
    }
}



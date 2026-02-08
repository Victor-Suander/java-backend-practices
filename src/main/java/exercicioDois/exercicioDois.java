package exercicioDois;

import java.util.Scanner;

public class exercicioDois {

    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {

            System.out.println(" ");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite sua Altura: ");

        String alturaInput = scanner.nextLine().replace(",", ".");
        double altura = Double.parseDouble(alturaInput);


        System.out.print("Digite seu Peso: ");

        String pesoInput = scanner.nextLine().replace(",", ".");
        double peso = Double.parseDouble(pesoInput);

       // System.out.println(altura);
       // System.out.println(peso);
        System.out.println(" ");
        double imc = peso / (altura * altura);
        System.out.printf("IMC: %.2f%n", imc);


        if (imc <= 18.5) {
            System.out.println("Abaixo do Peso.");
        } else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Peso ideal.");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println("Levemente acima do peso.");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println("Obesidade Grau I.");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println("Obesidade Grau II (Severa).");
        } else {
            System.out.println("Obesidade III (Mórbida).");
        }
        }
    }

}

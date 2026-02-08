package exercicios;

import java.util.Scanner;

public class exercicioUm {

    public static void main(String[] args) {

        Scanner numb = new Scanner(System.in);
        System.out.println("Escreve um numero: ");

        int number = numb.nextInt();

        var result0 = number*0;
        var result1 = number*1;
        var result2 = number*2;
        var result3 = number*3;
        var result4 = number*4;
        var result5 = number*5;
        var result6 = number*6;
        var result7 = number*7;
        var result8 = number*8;
        var result9 = number*9;
        var result10 = number*10;

        System.out.println("Tabuada do " + number + ":");
        System.out.println(number + " x 0 = " + result0);
        System.out.println(number + " x 1 = " + result1);
        System.out.println(number + " x 2 = " + result2);
        System.out.println(number + " x 3 = " + result3);
        System.out.println(number + " x 4 = " + result4);
        System.out.println(number + " x 5 = " + result5);
        System.out.println(number + " x 6 = " + result6);
        System.out.println(number + " x 7 = " + result7);
        System.out.println(number + " x 8 = " + result8);
        System.out.println(number + " x 9 = " + result9);
        System.out.println(number + " x 10 = " + result10);


    }
}

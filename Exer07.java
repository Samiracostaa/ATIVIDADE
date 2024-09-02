/* 7 - Escreva um programa que calcule os quadrados e cubos dos números de 0 a 10 e imprima os
valores resultantes formatados, conforme a tabela 3.*/
import java.util.Scanner;

class Exer7 {
    public static void main(String[] args) {
    Scanner entr = new Scanner(System.in);
        System.out.println("Número\tQuadrado\tCubo");
     
        int numero = 0;
        System.out.printf("%d\t%d\t\t%d%n", numero, numero * numero, numero * numero * numero);

        numero = 1;
        System.out.printf("%d\t%d\t\t%d%n", numero, numero * numero, numero * numero * numero);

        numero = 2;
        System.out.printf("%d\t%d\t\t%d%n", numero, numero * numero, numero * numero * numero);

        numero = 3;
        System.out.printf("%d\t%d\t\t%d%n", numero, numero * numero, numero * numero * numero);

        numero = 4;
        System.out.printf("%d\t%d\t\t%d%n", numero, numero * numero, numero * numero * numero);

        numero = 5;
        System.out.printf("%d\t%d\t\t%d%n", numero, numero * numero, numero * numero * numero);

        numero = 6;
        System.out.printf("%d\t%d\t\t%d%n", numero, numero * numero, numero * numero * numero);

        numero = 7;
        System.out.printf("%d\t%d\t\t%d%n", numero, numero * numero, numero * numero * numero);

        numero = 8;
        System.out.printf("%d\t%d\t\t%d%n", numero, numero * numero, numero * numero * numero);

        numero = 9;
        System.out.printf("%d\t%d\t\t%d%n", numero, numero * numero, numero * numero * numero);

        numero = 10;
        System.out.printf("%d\t%d\t\t%d%n", numero, numero * numero, numero * numero * numero);
    }
}

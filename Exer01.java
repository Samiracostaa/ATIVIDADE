/*1 Crie um algoritmo que lê dois números, X e Y , e mostra o resto da divisão entre eles*/

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);
        int x, y, d, r;
        
        System.out.print("Digite o valor de X: ");
        x = scanner.nextInt();
        
        System.out.print("Digite o valor de Y: ");
        y = scanner.nextInt();
        
        d = x / y;
        r = x % y; 
        
        System.out.println("O resultado da divisão de " + x + " por " + y + " é: " + d);
        System.out.println("O resto da divisão de " + x + " por " + y + " é: " + r);
    }
}
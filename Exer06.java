/*6 - Desenvolva um programa que, dados dois valores A e B, troque os valores de forma que A passe
a ter o valor de B e vice-versa. Exiba os valores após a troca.*/

import java.util.Scanner;

class Exer6 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int a,b;
    
    System.out.println("Leia o primeiro valor: ");
    a = entrada.nextInt();
    System.out.println("Leia o segundo valor: ");
    b = entrada.nextInt();
    
    /*int t = a = b;
    b = t;*/
    
    a= a+b;
    b= a-b;
    a= a-b;
    
    System.out.println("Os valos após a troca é A = " + a +",B = "+b);
    

  }
}


/* 3 -Desenvolva um programa que calcula a área de um círculo, onde o raio é fornecido pelo usuário.

 */

 import java.util.Scanner;

 class Exer3 {
   public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
     Double area;
     Double raio;
     Double pi=3.14;
     
     
     System.out.println("Qual o valor do raio ? ");
     raio= entrada.nextDouble();
     
     area = raio * pi;
     
     System.out.print("O valor da area do circulo é " + area);
     
     
   }
 }
 
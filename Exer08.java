/*8 -Faça um programa que converta a temperatura dada em Fahrenheit para Celsius. Você pode
testar se a sua resposta está correta, saiba que 100C = 212F. Considere C/5 = (F − 32)/9.*/


import java.util.Scanner;

class Exer8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double f,c;
        
        System.out.print("Digite a temperatura em Fahrenheit: ");
        f = entrada.nextDouble();
        
      	c = (f - 32) * 5 / 9;
      
        System.out.println("Temperatura em Celsius: " + c);
    }
}


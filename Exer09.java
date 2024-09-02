/* 9 - Faça um programa para o seguinte problema: Compraram-se N canetas iguais, que foram pagas
com uma nota de Z reais, obtendo-se Y reais como troco. Quanto custou cada caneta?*/
import java.util.Scanner;

class Exer9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int N;
        double Z, Y, T, C;

        
        System.out.print("Quantas canetas iguais você tem? ");
        N = entrada.nextInt();
        System.out.print("Qual é o valor da nota ? ");
        Z = entrada.nextDouble();
        System.out.print("Qual é o valor do troco ? ");
        Y = entrada.nextDouble();

        
        T = Z - Y;
        C = T / N;
        
        
        System.out.println("O valor total gasto é: " + T);
        System.out.println("O custo de cada caneta é: " + C);
    }
}

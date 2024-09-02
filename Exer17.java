/* 17 -Escreva um programa em Java para ler o número de votos brancos, nulos e válidos. Calcular e
escrever o percentual que cada um representa em relação ao total de eleitores.
 */

 import java.util.Scanner;

 class Exer17 {
   public static void main(String[] args) {
   Scanner entrada= new Scanner(System.in);
   double votosB,nulos,validos,p = 10,total;
        
     
     System.out.print("Numeros de votos brancos : ");
     votosB = entrada.nextDouble();
     System.out.print("Numeros de nulos : ");
     nulos = entrada.nextDouble();
     System.out.print("Numeros de votos validos: ");
     validos = entrada.nextDouble();
 
     p = (votosB+validos+nulos)*100;
     total = p;
    
     
     System.out.println("O percentual é " + "%"+total);
 
   }
 }
 
/* 4- Crie um programa que calcula a média simples de três notas fornecidas pelo usuário
 */

   
import java.util.Scanner;

class Exer4 {
  public static void main(String[] args) {
  Scanner entrada= new Scanner(System.in);
    
   Double n1,n2,n3;
   Double m;
    
    System.out.println("Qual a sua primeira nota? ");
    n1 =entrada.nextDouble();
    System.out.println("Qual a sua segunda nota? ");
    n2 =entrada.nextDouble();
    System.out.println("Qual a sua terceira nota? ");
    n3 =entrada.nextDouble();
    
    m = (n1+n2+n3/2);
    
    System.out.println("A sua a média é :" + m);
    
    
  }
}

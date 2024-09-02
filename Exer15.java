/*15 - . Escreva um algoritmo que recebe dois pontos do plano cartesiano P1 = (x1, y1) e P2 = (x2, y2)
e calcula a distância entre eles, dada por d(P1, P2) = p
(x1 − x2)
2 + (y1 − y2) 2.
*/

import java.util.Scanner;

class Exer15 {
  public static void main(String[] args) {
  Scanner entrada=new Scanner (System.in);
  double x1,x2,p1,p2;
    
    System.out.print("Leia o ponto 1: (x1) ");
    x1= entrada.nextDouble();
    System.out.print("Leia o ponto 1: (p1) ");
    p1= entrada.nextDouble();
    
    System.out.print("Leia o ponto 2:(x2) ");
    x2= entrada.nextDouble();
    System.out.print("Leia o ponto 2:(p2) ");
    p2= entrada.nextDouble();
    
    
    // Math.pow = para fazer o calculo do plano cartesiano
    double d = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(p2 - p1, 2));
    
    System.out.println("Calcule  os pontos catersiano : "+ d);
    
    
    
  }
}

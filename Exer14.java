/* 14 -A organização mundial da saúde recomenda que sejam ingeridos 35 ml de água por dia, para
cada quilograma de peso. Crie um algoritmo que recebe o peso de uma pessoa e informe a
quantidade recomendada de água em litros

*/
import java.util.Scanner;

class Exer14 {
  public static void main(String[] args) {
  Scanner entrada=new Scanner(System.in);
  double peso,l;
  
    
    System.out.print("Qual o seu peso em quilograma?");
    peso = entrada.nextDouble();
    System.out.print("Quantos litros de água você bebe?");
    l = entrada.nextDouble();
    
    double quat=peso *35;
    quat = quat/1000;
    
    System.out.println("A quantidade recomendada é: "+ quat+ "litros.");
    
    
  }
}

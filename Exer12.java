/* Faça um programa para uma loja de cerâmica que ajuda no cálculo da quantidade de revestimento necessário para uma obra. A pessoa utilizadora deve informar as medidas de largura
e comprimento da área que será revestida e da cerâmica escolhida. Sempre arredonde o valor para cima, e acrescente dez por cento para o acabamento.
*/

import java.util.Scanner;

class Exer12{
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double medidas,comp;
    String ceram;
    
    System.out.print("Qual a medida ?");
    medidas=entrada.nextDouble();
    System.out.print("Qual o comprimento da área?");
    comp=entrada.nextDouble();
    System.out.print("Qual a ceramica?");
    ceram=entrada.next();
    
    double valor = (medidas+comp)/0.10;
    
    System.out.println("O valor necessário para uma obra é :"+ valor+" a ceramica escolhida é "+ceram);
    	
    
  }
}

/*2 - Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais. Considere que
a cotação é US$ 1 = R$ 4,95.
*/

import java.util.Scanner;

class Exer2 {
  public static void main(String[] args) {
 	Double real; 
	Double dolar;
    
  Scanner entrada = new Scanner(System.in);
  
    System.out.println("Digite um valor em dolar: ");
    dolar=entrada.nextDouble();
    
    real= dolar*4.95;
 

    System.out.println("Digite um valor em real R$: " + real);
  
  }
}

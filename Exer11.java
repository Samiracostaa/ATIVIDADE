/*Uma dúvida que sempre paira na cabeça dos motoristas é: Abastecer com etanol ou gasolina?
Especialistas indicam que o consumo do carro aumenta em torno de trinta por cento, quando
abastecido com etanol, logo, só vale a pena abastecer com ele se o valor estiver abaixo de
setenta por cento do valor da gasolina. Para auxiliar motoristas a realizar este cálculo, crie
um algoritmo que receba o preço dos dois combustíveis, e informe qual deve ser a escolha, com base no custo.*/


import java.util.Scanner;

class Exer11 {
  public static void main(String[] args) {
  Scanner entrada= new Scanner(System.in);
    double r,etanol,gasolina;

    System.out.print("Qual o custo do etanol? ");
    etanol = entrada.nextDouble();
    System.out.println("Qual o custo da gasolina? ");
     gasolina= entrada.nextDouble();
    
    r = etanol/gasolina;
    
    if (r < 0.7){
      System.out.print("Abastecer com etanol.");
    }else{
      System.out.print("Abastecer com gasolina.");
    }
    
    
  }
}

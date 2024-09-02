/* 20 -Escreva um programa em Java para ler:
• a descrição do produto (nome)
• a quantidade adquirida
• o preço unitário.
Calcular e escrever o total (total = quantidade adquirida * preço unitário), o desconto
e total a pagar (total a pagar = total - desconto), sabendo-se que:
• Se quantidade <= 5, o desconto será de 2%
• Se quantidade > 5 e quantidade <=10, o desconto será de 3%
• Se quantidade > 10 e quantidade <30, o desconto será de 5%
• Se quantidade >= 30 o desconto será de 10%
 */

import java.util.Scanner;
class Exer20 {
  /**
 * @param args
 */
public static void main(String[] args) {
  Scanner entrada = new Scanner(System.in);
  String descricaoProduto;
  int quantidade;
  double precoUnitario,total,percentualDesconto;
    
    	System.out.print("Digite a descrição do produto: ");
        descricaoProduto = entrada.nextLine();

        System.out.print("Digite a quantidade adquirida: ");
       	quantidade = entrada.nextInt();

        System.out.print("Digite o preço unitário do produto: ");
        precoUnitario = entrada.nextDouble();

        total = quantidade * precoUnitario;

        if (quantidade <= 5) {
            percentualDesconto = 2.0;
        } else if (quantidade > 5 && quantidade <= 10) {
            percentualDesconto = 3.0;
        } else if (quantidade > 10 && quantidade < 30) {
            percentualDesconto = 5.0;
        } else {
            percentualDesconto = 10.0;
        }


        double desconto = (percentualDesconto / 100) * total;
        double totalAPagar = total - desconto;

        System.out.println("\nResumo da Compra:");
        System.out.println("Descrição do Produto: " + descricaoProduto);
        System.out.println("Quantidade Adquirida: " + quantidade);
        System.out.println("Preço Unitário: R$ " + precoUnitario);
        System.out.println("Total: R$ " + total);
        System.out.println("Desconto: R$ " + desconto + " (" + percentualDesconto + "%)");
        System.out.println("Total a Pagar: R$ " + totalAPagar);
    }
}
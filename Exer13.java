/* 13- Incremente o programa da questão 6, para informar o valor do metro quadrado da cerâmica escolhido e o valor total a ser pago.
 */

 import java.util.Scanner;

class Exer13 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double larguraArea, comprimentoArea,larguraCeramica ,comprimentoCeramica,valorMetroQuadrado;
    
    System.out.print("Informe a largura da área (em metros): ");
    larguraArea = entrada.nextDouble();

    System.out.print("Informe o comprimento da área (em metros): ");
    comprimentoArea = entrada.nextDouble();

    System.out.print("Informe a largura da cerâmica (em metros): ");
    larguraCeramica = entrada.nextDouble();

    System.out.print("Informe o comprimento da cerâmica (em metros): ");
    comprimentoCeramica = entrada.nextDouble();

    System.out.print("Informe o valor do metro quadrado da cerâmica (em R$): ");
    valorMetroQuadrado = entrada.nextDouble();

    
    double areaTotal = larguraArea * comprimentoArea;
    double areaCeramica = larguraCeramica * comprimentoCeramica;
    double quantidadeComAcabamento = Math.ceil((areaTotal / areaCeramica) * 1.10);
    double valorTotal = quantidadeComAcabamento * areaCeramica * valorMetroQuadrado;

    /*RESULTADO*/
    System.out.println("Quantidade de peças necessárias: " + quantidadeComAcabamento);
    System.out.println("Valor total a ser pago: R$ " + valorTotal);
  }
}

/* 18 - (Decom/UFOP - Adaptado) A permissão para uma pessoa votar ou não é determinado pela
idade dela, conforme a tabela 4.
Crie um programa capaz de ler a idade de uma pessoa e imprimir sua classificação eleitoral.
Entrada: QUAL A IDADE DA PESSOA?: 17
Saída: ELEITOR FACULTATIVO.
Tabela 4: Classificação de pessoas eleitoras
Idade (anos) Classificação
menor que 16 Não é eleitor
de 16 a 17 Eleitor facultativo
de 18 a 65 Eleitor obrigatório
acima de 65 Eleitor facultativo
*/
import java.util.Scanner;
class Exer18 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int idade;
    System.out.print("QUAL A IDADE DA PESSOA?: ");
    idade = entrada.nextInt();

    
    if (idade < 16) {
      System.out.println("Não é eleitor");
    } else if (idade >= 16 && idade <= 17) {
      System.out.println("Eleitor facultativo");
    } else if (idade >= 18 && idade <= 65) {
      System.out.println("Eleitor obrigatório");
    } else {
      System.out.println("Eleitor facultativo");
    }
  }
}

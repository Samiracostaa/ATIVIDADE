/* 19 - Crie um programa para exibir o menu de um caixa eletrônico. Ele deve possuir as opções: Exibir
saldo, Exibir extrato, Realizar depósito, Realizar saque, e Sair. Se alguma opção inválida for fornecida, exiba uma mensagem de erro e saia do programa. Observação: Utilize a estrutura
de seleção Switch/Case para implementar seu produto. Utilize números inteiros para indicar
cada opção.
 */

 import java.util.Scanner;

class Exer19 {
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    int saldo = 1000; 
    int deposito, saque;
    
    System.out.println("Caixa Eletrônico");
    System.out.println("1. Exibir saldo");
    System.out.println("2. Realizar depósito");
    System.out.println("3. Realizar saque");
    System.out.println("4. Sair");
    System.out.print("Escolha uma opção: ");
    
    int op = entrada.nextInt();
    
    switch(op) {
        case 1 -> System.out.println("Seu saldo é: R$ " + saldo);
        case 2 -> {
            System.out.print("Informe o valor a ser depositado: ");
            deposito = entrada.nextInt(); 
            saldo += deposito;
            System.out.println("Depósito realizado. Novo saldo: R$ " + saldo);
          }
        case 3 -> {
            System.out.print("Informe o valor a ser sacado: ");
            saque = entrada.nextInt(); 
            if (saque <= saldo) {
                saldo -= saque;
                System.out.println("Saque realizado. Novo saldo: R$ " + saldo);
            } else {
                System.out.println("Saldo insuficiente.");
            }
          }
        case 4 -> System.out.println("Saindo do sistema. Obrigado por usar nosso serviço!");
        default -> System.out.println("Opção inválida.");
    }
  }
}
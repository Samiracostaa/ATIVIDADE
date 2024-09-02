/* 5- Escreva um programa que calcula o salário líquido de um funcionário. O programa deve solicitar
o valor da hora de trabalho, o número de horas trabalhadas no mês e o percentual de desconto
do INSS.
 */
import java.util.Scanner;

class Exer5{
  public static void main(String[] args) {
	Scanner entrada= new Scanner(System.in);
    Double salario,mes,liq,salBruto;
    Float inss;
   
    System.out.println("Digite o valor das horas trabalhada: ");
    salario = entrada.nextDouble();
    System.out.println("Horas trabalhadas no mÊs: ");
    mes= entrada.nextDouble();
    System.out.println("O PERCENTUAL DE DESCONTO: ");
    inss=entrada.nextFloat();
    
    salBruto = salario*mes;
    inss =(float) (salBruto * (inss/100));
    liq = salBruto - inss;
    
    
    System.out.print("O salario liquido do FUNCIONÁRIO é:R$ "+liq);
    

  }
}

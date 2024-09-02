/* 16 -Escreva um programa em Java para ler as notas da primeira, segunda e terceira avaliações
de um aluno, todas valem dez pontos. Calcular a média aritmética simples e escrever uma
mensagem que diga se o aluno foi ou não aprovado (considerar que média igual ou maior que
7 o aluno é aprovado). Escrever também a média calculada
 */
 
import java.util.Scanner;

class Exer16{
  public static void main(String[] args) {
  Scanner entrada= new Scanner(System.in);
  double n1,n2,n3,soma;
    
    System.out.print("Digite a nota da primeira prova: ");
    n1= entrada.nextDouble();
    System.out.print("Digite a nota da segunda prova: ");
    n2 = entrada.nextDouble();
    System.out.print("Digite a nota da terceira prova: ");
    n3= entrada.nextDouble();
    
    soma = n1+n2+n3;
	double m= soma/3;
    
    System.out.println("A média calculada é: " + m);
    
    if(m >= 7){
    	System.out.print("Aprovado");
    }else{
    	System.out.println("Reprovado");
      
    }
  }
}

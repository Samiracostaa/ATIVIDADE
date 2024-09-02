/* 10 - Crie um algoritmo que leia um valor de hora (HH:MM) e informe (calcule) quantos minutos se passaram desde o início do dia (00:00).*/
import java.util.Scanner;

class Exer10{
  public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);

    System.out.print("Digite a hora em HH:MM: ");
    String[] horaMinutos = entrada.next().split(":");
    
    int horas = Integer.parseInt(horaMinutos[0]);
    int minutos = Integer.parseInt(horaMinutos[1]);

    int minutosPassados = horas * 60 + minutos;

    System.out.println("Se passaram " + minutosPassados + " minutos desde o início do dia.");
  }
}

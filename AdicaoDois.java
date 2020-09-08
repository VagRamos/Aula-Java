// AdicaoDois.java
// Programa de adição que exibe a soma de dois números.
import java.util.Scanner;

public class AdicaoDois
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      double num1;
      double num2;
      double soma;
      
      System.out.print("Digite o 1o numero: ");
      num1 = input.nextDouble(); //Lê o primeiro número
      
      System.out.print("Digite o 2o numero: ");
      num2 = input.nextDouble();  // Lê o segundo número
      
      soma = num1 + num2;
      
      System.out.printf("A soma eh %.2f\n", soma);
   }
}
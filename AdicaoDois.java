// AdicaoDois.java
// Programa de adi��o que exibe a soma de dois n�meros.
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
      num1 = input.nextDouble(); //L� o primeiro n�mero
      
      System.out.print("Digite o 2o numero: ");
      num2 = input.nextDouble();  // L� o segundo n�mero
      
      soma = num1 + num2;
      
      System.out.printf("A soma eh %.2f\n", soma);
   }
}
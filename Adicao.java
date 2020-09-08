// Adicao.java
// Programa de adição que exibe a soma de dois números inteiros.
import java.util.Scanner;

public class Adicao
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      int num1;
      int num2;
      int soma;
      
      System.out.println("Digite o 1o numero: ");
      num1 = input.nextInt();
      
      System.out.println("Digite o 2o numero: ");
      num2 = input.nextInt();
      
      soma = num1+num2;
      
      System.out.printf("A soma eh %d\n", soma);
   }
}
// Temperatura.java
// Converter temperaturas de Fahrenheit para Celsius.
import java.util.Scanner;

public class Temperatura
{
   public static void main(String args[])
   {
      Scanner input = new Scanner(System.in);
      float temp_F;
      float temp_C;
      
      System.out.println("Temperatura em F: ");
      temp_F = input.nextFloat();
      
      temp_C = (temp_F - 32)*5/9;
      
      System.out.printf("Temperatura em C: %.2fC\n", temp_C);
   }
}
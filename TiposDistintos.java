// TiposDistintos.java
// Entrada de dados de tipos distintos
import java.util.Scanner;
public class TiposDistintos
{
   public static void main( String args[] )
   {
      Scanner ent_Str = new Scanner( System.in );
      Scanner ent_Int = new Scanner( System.in );
      Scanner ent_Doub = new Scanner( System.in );
      
      String nome;
      int    idade;
      double salario;
      
      System.out.print( "Digite o nome: " );
      nome = ent_Str.nextLine();
      
      System.out.print( "Digite a idade: " );
      idade = ent_Int.nextInt();
      
      System.out.print( "Digite o salário: " );
      salario = ent_Doub.nextDouble();
      
      System.out.printf( "Dados lidos:\n" );
      System.out.printf( "Nome   : %s\n", nome );
      System.out.printf( "Idade  : %d\n", idade );
      System.out.printf( "Salario: R$ %7.2f\n", salario );
   }
}
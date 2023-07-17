package Week_1 ;
import java.util.* ;

public class Main 
{
   public static final int n = 5 ;
   public static int matrix[][] ;
   public static void main(String[] args)
   {
      matrix = new int[n][n] ;
      Random rand = new Random() ;
      for (int i = 0 ; i < n ; i++)
      {
         for (int j = 0 ; j  < n ; j++)
         {
            matrix[i][j] = Math.abs(rand.nextInt()) % 8  ;
         }
      }
      for (int i = 0 ; i < n ; i++)
      {
         for (int j = 0 ; j  < n ; j++)
         {
            System.out.print(matrix[i][j]+ " ");
         }
         System.out.println();
      }
   }
}

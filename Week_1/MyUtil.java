package Week_1;

public class MyUtil 
{
   public static int sum(int[][] matrix)
   {
      int sum = 0 ;
      for (int i = 0 ; i < matrix[0].length ; i++)
      {
            for (int j = 0 ;  j < matrix[0].length ;j++)
            {
                  if (i == j)
                  {
                     sum = sum + matrix[i][j] ;
                  }
            }
      }
      return sum ;
   }
}

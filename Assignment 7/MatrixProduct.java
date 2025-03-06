public class MatrixProduct 
{
    public static void main(String[] args) 
    {
        int x[][] = {{2, 3}, {4, 5}};
        int y[][] = {{6, 7}, {8, 9}};
        int z[][] = new int[2][2];
        for (int i = 0; i < 2; i++) 
        {
        for (int j = 0; j < 2; j++) 
          {   
        z[i][j] = 0;
        for (int k = 0; k < 2; k++) 
             {
        z[i][j] += x[i][k] * y[k][j];
             }
          }
        }
    System.out.println("Resultant Matrix: ");
        for (int i = 0; i < 2; i++) 
        {
        for (int j = 0; j < 2; j++) 
          {
         System.out.print(z[i][j] + " ");
          }
         System.out.println();
        }
    }
}

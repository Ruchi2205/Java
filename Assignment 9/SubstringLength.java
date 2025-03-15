import java.util.Scanner;
public class SubstringLength 
{
    public static void main(String[] args) 
    {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = inputScanner.nextLine();
        int[] lastIndex = new int[256]; 
        for (int i = 0; i < 256; i++)
         {
            lastIndex[i] = -1; 
        }
        int left = 0, maxLength = 0;
        for (int i = 0; i < str.length(); i++) 
        {
            if (lastIndex[str.charAt(i)] >= left) 
            {
                left = lastIndex[str.charAt(i)] + 1; 
            }
        lastIndex[str.charAt(i)] = i; 
        maxLength = Math.max(maxLength, i - left + 1);
        }
        System.out.println("Length of longest substring: " + maxLength);
    }
}

public class SevenDivisible 
{
    public static int countSeven(int[] arr) 
    {
        int count = 0;
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] % 7 == 0) 
            { 
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
        int[] num = {36, 21, 40,28, 49, 50, 70}; 
        int result = countSeven(num);
        System.out.println("Number of elements divisible by 7: " + result);
    }
}

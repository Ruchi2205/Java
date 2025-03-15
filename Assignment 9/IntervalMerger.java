import java.util.Scanner;
public class IntervalMerger 
{
    public static void main(String[] args)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of intervals: ");
        int num = scanner.nextInt();
        int[][] intervals = new int[num][2];
        System.out.println("Enter intervals:");
        for (int i = 0; i < num; i++) 
        {
            intervals[i][0] = scanner.nextInt();
            intervals[i][1] = scanner.nextInt();
        }
       for (int i = 0; i < num - 1; i++)
        {
            for (int j = 0; j < num - i - 1; j++) 
            {
                if (intervals[j][0] > intervals[j + 1][0]) 
                {
                    int[] temp = intervals[j];
                    intervals[j] = intervals[j + 1];
                    intervals[j + 1] = temp;
                }
            }
        }
        System.out.println("Merged Intervals:");
        int start = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < num; i++) 
        {
            if (intervals[i][0] <= end)
             {
                end = Math.max(end, intervals[i][1]);
            } 
            else 
            {
                System.out.println(start + " " + end);
                start = intervals[i][0];
                end = intervals[i][1];
            }
        }
        System.out.println(start + " " + end);
    }
}

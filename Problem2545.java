import java.util.Arrays;

public class Problem2545 
{
    public static int[][] sortTheStudents(int[][] score, int k) 
    {
        Arrays.sort(score , (a,b) -> Integer.compare(b[k], a[k]));

        return score;
    }
    public static void main(String[] args) 
    {
        for (int[] row : sortTheStudents(new int[][]{{10,6,9,1},{7,5,11,2},{4,8,3,15}}, 2)) {
            System.out.println(Arrays.toString(row));
        }

        for (int[] row : sortTheStudents(new int[][]{{3,4},{5,6}}, 1)) {
            System.out.println(Arrays.toString(row));
        }
    }    
}

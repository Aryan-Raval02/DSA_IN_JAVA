import java.util.ArrayList;
import java.util.List;

public class Problem119 
{
    public static List<Integer> getRow(int rowIndex) 
    {
        // List<List<Integer>> l = new ArrayList<>();
        // for(int i=0 ; i<rowIndex+1 ; i++)
        // {
        //     List<Integer> temp = new ArrayList<>();
        //     for(int j=0; j<=i ; j++)
        //     {
        //         if(j==0 || j==i) temp.add(1);
        //         else
        //         {
        //             temp.add(l.get(i-1).get(j) + l.get(i-1).get(j-1));
        //         }
        //     }
        //     l.add(temp);
        // }

        // return l.get(rowIndex);

        List<Integer> row = new ArrayList<>();
        row.add(1);

        for (int i = 1; i <= rowIndex; i++) 
        {
            row.add(0);  

            for (int j = i; j > 0; j--) 
            {
                row.set(j, row.get(j) + row.get(j - 1));
            }
        }

        return row;
    }
    public static void main(String[] args) 
    {
        System.out.println(getRow(0));
        System.out.println(getRow(3));
        System.out.println(getRow(5));
    }
}

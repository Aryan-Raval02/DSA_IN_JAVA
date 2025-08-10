import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Problem118 
{
    public static List<List<Integer>> generate(int numRows) 
    {

        List<List<Integer>> l = new ArrayList<>();
        for(int i=0 ; i<numRows ; i++)
        {
            List<Integer> temp = new ArrayList<>();
            for(int j=0; j<=i ; j++)
            {
                if(j==0 || j==i) temp.add(1);
                else
                {
                    temp.add(l.get(i-1).get(j) + l.get(i-1).get(j-1));
                }
            }
            l.add(temp);
        }

        return l;

        // List<List<Integer>> l = new ArrayList<>();
        // for(int i=0 ; i<numRows ; i++)
        // {
        //     if(i==0) l.add(Arrays.asList(1));
        //     else if(i==1) l.add(Arrays.asList(1,1));
        //     else
        //     {
        //         List<Integer> temp = new ArrayList<>();
        //         temp.add(1);
        //         for(int j=0; j<l.get(i-1).size()-1 ; j++)
        //         {
        //             temp.add(l.get(i-1).get(j) + l.get(i-1).get(j+1));
        //         }
        //         temp.add(1);
        //         l.add(temp);
        //     }
        // }

        // return l;
    }
    public static void main(String[] args) 
    {
        System.out.println(generate(1));
        System.out.println(generate(2));
        System.out.println(generate(5));
    }    
}

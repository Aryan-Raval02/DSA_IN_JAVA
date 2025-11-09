import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Problem3668 
{   
    public static int[] recoverOrder(int[] order, int[] friends) 
    {
        Set<Integer> set= new HashSet<>();

        for(int n : friends)
        {
            set.add(n);
        }

        int i = 0;
        for(int n : order)
        {
            if(set.contains(n))
            {
                friends[i++] = n;
            }
        }

        return friends;
    }

    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(recoverOrder(new int[]{3,1,2,5,4}, new int[]{1,3,4})));
    }
}

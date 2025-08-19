import java.util.ArrayList;
import java.util.List;

public class Problem728 
{
    public static List<Integer> selfDividingNumbers(int left, int right) 
    {
        List<Integer> list = new ArrayList<>();
        while(left <= right)
        {
            int temp = left;

            boolean flag = false;
            while(temp != 0)
            {
                int m = temp % 10;

                if(m==0 || left % m != 0)
                {
                    flag = false;
                    break;
                }
                temp = temp/10;
                flag = true;
            }

            if(flag) list.add(left);
            left++;
        }

        return list;
    }

    // public static List<Integer> selfDividingNumbers(int left, int right) 
    // {
    //     List<Integer> list = new ArrayList<>();
    //     while(left <= right)
    //     {
    //         int temp = left;

    //         boolean flag = false;
    //         while(temp != 0)
    //         {
    //             int m = temp % 10;

    //             if(m==0) break;

    //             if(left % m == 0)
    //             {
    //                 flag = true;
    //             }
    //             else
    //             {
    //                 flag = false;
    //             }

    //             if(!flag) break;

    //             temp = temp/10;
    //         }

    //         if(flag) list.add(left);

    //         left++;
    //     }

    //     return list;
    // }
    public static void main(String[] args) 
    {
        System.out.println(selfDividingNumbers(1, 22));
        System.out.println(selfDividingNumbers(47, 85));
    }    
}

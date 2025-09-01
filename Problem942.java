import java.util.Arrays;

public class Problem942 
{
    public static int[] diStringMatch(String s) 
    {
        int n = s.length();
        int[] perm = new int[n+1];
        int mn = 0;
        int mx = n;

        for(int i=0; i<n; ++i)
        {
            perm[i] = s.charAt(i) == 'I' ? mn++ : mx--;
        }

        perm[n] = mn;

        return perm;

        // int[] perm = new int[s.length()+1];
        // int n = s.length();
        // int c = 0;

        // for(int i=0; i<s.length(); i++)
        // {
        //     if(s.charAt(i) == 'D')
        //     {   
        //         for(int j=n; j>i; j--)
        //         {
        //             perm[j] = perm[j-1];
        //         }

        //         perm[i] = n--;
        //     }
        //     else
        //     {
        //         perm[i] = c++;
        //     }
        // }

        // perm[s.length()] = n;

        // return perm;

        // int[] perm = new int[s.length()+1];
        // int n = perm.length;

        // for(int i=0; i<n; i++)
        // {
        //     perm[i] = i;
        // }

        // for(int i=0; i<s.length(); i++)
        // {
        //     switch(s.charAt(i))
        //     {
        //         case 'D' :
        //                     int temp = perm[n-1];
                
        //                     for(int j=n-1; j>i; j--)
        //                     {
        //                         perm[j] = perm[j-1];
        //                     }

        //                     perm[i] = temp;
        //                     break;
        //     }
        // }

        // return perm;
    }
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(diStringMatch("IDID")));
        System.out.println(Arrays.toString(diStringMatch("III")));
        System.out.println(Arrays.toString(diStringMatch("DDI")));
        System.out.println(Arrays.toString(diStringMatch("D")));
        System.out.println(Arrays.toString(diStringMatch("I")));
    }
}

import java.util.Arrays;

public class Problem605 
{
    public static boolean canPlaceFlowers(int[] flowerbed, int n) 
    {
        for(int i=0; i<flowerbed.length; i++)
        {
            if(flowerbed[i] == 0)
            {
                int left = (i>0) ? flowerbed[i-1] : 0;
                int right = (i==flowerbed.length-1) ? 0 : flowerbed[i+1];
            
                if(left == 0 && right == 0)
                {
                    flowerbed[i] = 1;
                    n--;
                }

                if(n==0) return true;
            }
        }

        return false;

        // int max =Integer.MIN_VALUE;
        // int c = 1;
        // int start = 0;
        // int end = flowerbed.length;

        // if(flowerbed.length == 1 && flowerbed[0] == 0)
        // {
        //     n--;
        // }

        // if(n==0) return true;

        // if(flowerbed[start] == 0 && flowerbed[start+1] == 0)
        // {
        //     n--;
        //     start = 2;
        // }
        // if(flowerbed[end-1] == 0 && flowerbed[end-2] == 0)
        // {
        //     n--;
        //     end = end - 2;
        // }

        // if(n==0) return true;

        // for( ; start<end-1; start++)
        // {
        //     if(flowerbed[start] == flowerbed[start+1] && flowerbed[start]==0)
        //     {
        //         c++;
        //     }
        //     else
        //     {
        //         max = Math.max(max, c);
        //         c=1;
        //     }
        // }

        // // int[] freq = new int[2];

        // // for(int i:flowerbed)
        // // {
        // //     freq[i]++;
        // // }

        // return (max == (n*2+1));
    }
    public static void main(String[] args) 
    {
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 1));
        System.out.println(canPlaceFlowers(new int[]{1,0,0,0,1}, 2));
        System.out.println(canPlaceFlowers(new int[]{1,0,1,0,1,0,1}, 1));
        System.out.println(canPlaceFlowers(new int[]{0,0,1,0,1}, 1));
        System.out.println(canPlaceFlowers(new int[]{0}, 1));
    }
}

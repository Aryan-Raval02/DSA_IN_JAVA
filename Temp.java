import java.util.Scanner;

public class Temp 
{
    // static
    // {
    //     Scanner sc = new Scanner(System.in);
    //     for(int i=0; i<100; i++)
    //     {
    //         int a = sc.nextInt();
    //         int b = sc.nextInt();
    //         moveZeroes(new int[]{a,b});
    //     }
    // }
    public static void moveZeroes(int[] nums) 
    {
        if(nums.length == 0 || nums.length == 1) return;

        int zero=0;

        for(int i=0; i<nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[zero++] = nums[i];
            }
        }
        while(zero < nums.length)
        {
            nums[zero++] = 0;
        }
    }  

    public static void main(String[] args) {
        moveZeroes(new int[]{0,1,0,3,12});
    }
}

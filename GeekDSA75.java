public class GeekDSA75 
{
    public static void printFreq(int[] arr)
    {
        int n = arr.length;

        int freq = 1;
        for(int i=1; i<n; i++)
        {
            if(arr[i] == arr[i-1])
            {
                freq++;
            }
            else
            {
                System.out.println(arr[i-1]+"==>"+freq);
                freq=1;
            }
        }

        if(n==1 || arr[n-1]!=arr[n-2])
        {
            System.out.println(arr[n-1]+"==>"+freq);
        }
    }
    public static void main(String[] args) 
    {
        printFreq(new int[]{10,10,10,20,20,30});   
    }    
}

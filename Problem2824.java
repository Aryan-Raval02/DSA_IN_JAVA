import java.util.List;

public class Problem2824 
{
    public static int countPairs(List<Integer> nums, int target) 
    {
        int ans = 0;
        int l = nums.size();

        for(int i=0; i<l; i++)
        {
            int x = nums.get(i);
            for(int j=i+1; j<l; j++)
            {
                if(x + nums.get(j) < target)
                    ans++;
            }
        }    

        return ans;
    }
    public static void main(String[] args) 
    {
        
    }    
}

public class Problem796 
{
    public static boolean rotateString(String s, String goal) 
    {
        if(s.length() != goal.length()) return false;

        return (s+s).contains(goal);

        // if(s.length() != goal.length()) return false;
        // if(s.equals(goal)) return true;

        // char[] check = s.toCharArray();
        // int index = 0;
        // int n = check.length;

        // while(index < 5)
        // {
        //     char temp = check[0];

        //     for(int i=0; i<n-1; i++)
        //     {
        //         check[i] = check[i+1];
        //     }

        //     check[n-1] = temp;

        //     String str = new String(check);

        //     if(str.equals(goal)) return true;
        // }

        // return false;
    }
    public static void main(String[] args) 
    {
        
    }    
}

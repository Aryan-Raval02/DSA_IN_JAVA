public class Problem3237 
{
    public static boolean doesAliceWin(String s) 
    {
        
        for(char ch : s.toCharArray())
        {
            switch (ch) {
                case 'a','e','i','o','u':
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) 
    {
        System.out.println(doesAliceWin("leetcoder"));
        System.out.println(doesAliceWin("Leetco"));
    }    
}

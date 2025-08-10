public class Problem58 
{
    public static int lengthOfLastWord(String s) 
    {
        if(s.isEmpty()) return 0;

        boolean spaceFlag = false;
        int len = 0;
        for( int i=s.length()-1 ; i>=0 ; i-- )
        {
            if( s.charAt(i) == ' ' && !spaceFlag )
            {
                continue;
            }
            else if(spaceFlag && s.charAt(i)==' ')
            {
                break;
            }
            else
            {
                spaceFlag = true;
                len++;
            }
        }

        return len;
    }
    public static void main(String[] args) 
    {
        System.out.println(lengthOfLastWord("Hello World"));
        System.out.println(lengthOfLastWord("   fly me   to   the moon  "));
        System.out.println(lengthOfLastWord("luffy is still joyboy"));
        System.out.println(lengthOfLastWord(""));
    }    
}

public class Problem1957
{
    public static String makeFancyString(String s) 
    {
        if(s.length() == 0 || s.length() == 1) return s;

        // This Works faster than ChatGPT

        StringBuilder sb = new StringBuilder();

        char ch = '\u0000';
        for( int i=0; i<s.length()-1 ; i++ )
        {
            if(ch == s.charAt(i))
            {
                continue;
            }
            else if( s.charAt(i) == s.charAt(i+1) )
            {
                sb.append(s.charAt(i));
                sb.append(s.charAt(i));
                ch = s.charAt(i);
                i++;
            }
            
            else
            {
                sb.append(s.charAt(i));
                ch = '\u0000';
            }
        }
    
        if( sb.charAt(sb.length()-1) != s.charAt(s.length()-1) )
        {
            sb.append(s.charAt(s.length()-1));
        }

        return sb.toString();


        // From ChatGPT its slow
        // StringBuilder sb = new StringBuilder();
        // int c=1;

        // for(int i=1; i<s.length(); i++)
        // {
        //     if(i==1) sb.append(s.charAt(0));

        //     if(s.charAt(i) == s.charAt(i-1))
        //     {
        //         c++;
        //     }
        //     else
        //     {
        //         c = 1;
        //     }

        //     if(c < 3) sb.append(s.charAt(i));
        // }

        // return sb.toString();

    }
    public static void main(String[] args) 
    {
        System.out.println(makeFancyString("leeetcode"));
        System.out.println(makeFancyString("aaabaaaa"));
        System.out.println(makeFancyString("a"));
        System.out.println(makeFancyString("aa"));
        System.out.println(makeFancyString("aakkkshay"));
        System.out.println(makeFancyString("abbcccdddeee"));
    }
}
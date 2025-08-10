public class Problem14
{
    public static String longestCommonPrefix(String[] strs) 
    {
        if( strs == null || strs.length == 0 ) return "";

        if( strs.length == 1 ) return strs[0];

        // String ans="";

        String start = strs[0];

        for(int i=1 ; i<strs.length ; i++)
        {
            while(!strs[i].startsWith(start))
            {
                start = start.substring(0,start.length() - 1);
                
                if(start.equals("")) return "";
            }
        }

        // for( int i=0 ; i<strs[0].length() ; i++)
        // {
        //     int j=0;
        //     char c = strs[0].charAt(i);
        //     for(; j<strs.length ; j++)
        //     {
        //         if( i>=strs[j].length() || !(c == strs[j].charAt(i)))
        //         {
        //             return ans;
        //         }
        //     }
        //     ans=ans+c;
        // }

        // return ans;

        return start;
    }
    public static void main(String[] args) 
    {
        System.out.println(longestCommonPrefix(new String[]{"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[]{}));
        System.out.println(longestCommonPrefix(new String[]{"aryan"}));
    }
}
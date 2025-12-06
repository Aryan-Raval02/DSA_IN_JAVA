public class Problem2315 {

    public static void main(String[] args) {
        System.out.println(countAsterisks("yo|uar|e**|b|e***au|tifu|l"));
    }

    public static int countAsterisks(String s) {
        
        int ans = 0;
        int pipe = 0;
        boolean flag = true;
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);

            if(ch == '|')
                pipe++;

            if(pipe % 2 == 0 && ch == '*')
                ans++;

            // if(flag && ch == '|')
            // {
            //     flag = false;
            // }
            // else if(flag && ch == '*')
            // {   
            //     ans++;
            // }
            // else if(!flag && ch == '|')
            // {
            //     flag = true;
            // }
        }

        return ans;
    }
}

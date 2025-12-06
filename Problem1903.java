public class Problem1903 {
    public String largestOddNumber(String num) {
        
        int n = num.length();

        for(int i=n-1; i>=0; i--)
        {
            char ch = num.charAt(i);
            switch(ch)
            {
                case '1','3','5','7','9' :
                    return num.substring(0, i+1);
            }
        }

        return "";
    }
}

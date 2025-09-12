import java.util.Arrays;

public class Problem2785 
{
    public static String sortVowels(String s) 
    {
        int cnt = 0;
        for(char c : s.toCharArray())
        {
            switch(c)
            {
                case 'a','i','o','e','u','A','E','I','O','U' :
                    cnt++;
                    break;
            }
        }

        char[] charArray = new char[cnt];
        cnt = 0;

        for(char c : s.toCharArray())
        {
            switch(c)
            {
                case 'a','i','o','e','u','A','E','I','O','U' :
                    charArray[cnt++] = c;
                    break;
            }
        }

        Arrays.sort(charArray);

        cnt = 0;
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray())
        {
            switch(c)
            {
                case 'a','i','o','e','u','A','E','I','O','U' :
                    sb.append(charArray[cnt++]);
                    break;
                default :
                    sb.append(c);
            }
        }

        return sb.toString();
    }
    public static void main(String[] args) 
    {
        System.out.println(sortVowels("lEetcOde"));
        System.out.println(sortVowels("lYmpH"));
    }    
}

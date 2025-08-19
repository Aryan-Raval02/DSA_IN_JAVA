import java.util.ArrayList;

public class Problem917 
{

    public static String reverseOnlyLetters(String s) 
    {
        int start = 0;
        int end = s.length()-1;

        char[] chr = s.toCharArray();

        while(start<=end)
        {
            if(Character.isLetter(s.charAt(start)) && Character.isLetter(s.charAt(end)))
            {
                char temp = chr[start];
                chr[start] = chr[end];
                chr[end] = temp;
                start++;
                end--;
            }
            else if(!Character.isLetter(s.charAt(start)))
            {
                start++;
            }
            else
            {
                end--;
            }
        }
        return new String(chr);
    }

    // public static String reverseOnlyLetters(String s) 
    // {
    //     ArrayList<Character> list = new ArrayList<>();

    //     for(int i=0; i<s.length(); i++)
    //     {
    //         char ch = s.charAt(i);

    //         if(ch >= 65 && ch <=90 || ch >=97 && ch<=123)
    //             list.add(ch);
    //     }

    //     int end = list.size()-1;

    //     StringBuilder sb = new StringBuilder();

    //     for(int i=0; i<s.length(); i++)
    //     {
    //         char ch = s.charAt(i);

    //         if(ch >= 65 && ch <=90 || ch >=97 && ch<=123)
    //         {
    //             sb.append(list.get(end));
    //             end--;
    //         }
    //         else
    //         {
    //             sb.append(s.charAt(i));
    //         }
    //     }
    //     return sb.toString();
    // }
    public static void main(String[] args) 
    {
        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }

}

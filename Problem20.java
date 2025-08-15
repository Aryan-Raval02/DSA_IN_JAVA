import java.util.Stack;

public class Problem20 
{
    public static boolean isValid(String s)
    {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++)
        {
            if(stack.empty()) stack.push(s.charAt(i));

            char ch = stack.peek();

            switch (ch) 
            {
                case ')': 
                    break;
                case ']':
                    break;
                case '}':
                    break;
                default:
                    break;
            }
        }
    }
    public static void main(String[] args) 
    {
        System.out.println(isValid("()"));
    }
}

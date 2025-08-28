import java.util.Stack;

public class Problem20 
{
    public static boolean isValid(String s)
    {
        if(s.length() % 2 != 0) return false;

        Stack<Character> stack = new Stack<>();

        for(int i=0; i<s.length(); i++)
        {
            char c = s.charAt(i);

            switch(c)
            {
                case '(','{','[' : stack.push(c); break;
                case ')' : if(stack.empty()) return false; if(stack.pop()!='(') return false; break;
                case '}' : if(stack.empty()) return false; if(stack.pop()!='{') return false; break;
                case ']' : if(stack.empty()) return false; if(stack.pop()!='[') return false; break;
            }
        }

        return stack.empty();

        // for(int i=0; i<s.length(); i++)
        // {
        //     char c =s.charAt(i);
            
        //     if( c=='(' || c=='{' || c=='[')
        //     {
        //         stack.push(c);
        //     }
        //     else
        //     {
        //         if(stack.empty()) return false;

        //         char top = stack.pop();
        //         if( (c==')' && top!='(')  || (c=='}' && top!='{') || (c==']' && top!='[') )
        //         {
        //             return false;
        //         }
        //     }
        // }

        // return stack.empty();
    }
    public static void main(String[] args) 
    {
        System.out.println(isValid("()"));
        System.out.println(isValid("()[]{}"));
        System.out.println(isValid("(]"));
        System.out.println(isValid("([])"));
    }
}

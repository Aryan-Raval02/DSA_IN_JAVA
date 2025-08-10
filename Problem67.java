public class Problem67 
{
    public static String addBinary(String a, String b) 
    {
        StringBuilder s = new StringBuilder();

        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;
        
        while(i >= 0 || j >= 0 || carry != 0)
        {
            int bitA = (i>=0) ? a.charAt(i) - '0' : 0;
            int bitB = (j>=0) ? b.charAt(j) - '0' : 0;

            int sum = bitA + bitB + carry;
            carry = sum / 2;
            s.append(sum % 2);

            i--;
            j--;

        }

        return s.reverse().toString();
    }
    public static void main(String[] args) 
    {
        System.out.println(addBinary("11","1"));
        System.out.println(addBinary("1010", "1011"));
    }    
}

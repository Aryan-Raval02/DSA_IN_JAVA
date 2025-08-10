public class Problem168
{
    public static String convertToTitle(int columnNumber) 
    {  
        StringBuilder str = new StringBuilder();
        
        while(columnNumber>0)
        {
            columnNumber--;
            int n = columnNumber % 26;
            char ch = (char) ('A'+ n);
            str.append(ch);
            columnNumber = columnNumber / 26;
        }

        char ch = (char) columnNumber;
        str.append(ch);
        return str.reverse().toString() ;
    }
    public static void main(String[] args) 
    {
        System.out.println(convertToTitle(1));
        System.out.println(convertToTitle(28));
        System.out.println(convertToTitle(701));
    }
}
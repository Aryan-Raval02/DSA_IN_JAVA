import java.util.ArrayList;

public class ZigzagConversion 
{
    public String convert(String s, int numRows) 
    {
        if (numRows == 1 || s.length() <= numRows) return s;

        ArrayList<StringBuilder> rows = new ArrayList<>();

        for (int i = 0; i < Math.min(numRows, s.length()); i++)
        {
            rows.add(new StringBuilder());
        }

        int currRow = 0;
        boolean flag = false;

        for (char c : s.toCharArray()) 
        {
            rows.get(currRow).append(c);

            if (currRow == 0 || currRow == numRows - 1)
            {
                flag = !flag;
            }

            currRow += flag ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows)
            result.append(row);

        return result.toString();
    }

    public static void main(String[] args) {
        ZigzagConversion z = new ZigzagConversion();
        System.out.println(z.convert("PAYPALISHIRING", 3)); // Output: PAHNAPLSIIGYIR
        System.out.println(z.convert("PAYPALISHIRING", 4)); // Output: PINALSIGYAHRPI
        System.out.println(z.convert("A", 1));              // Output: A
    }
}

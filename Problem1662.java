public class Problem1662 
{
    public static boolean arrayStringsAreEqual(String[] word1, String[] word2) 
    {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for(String s : word1)
        {
            sb1.append(s);
        }
        for(String s : word2)
        {
            sb2.append(s);
        }

        return sb1.toString().equals(sb2.toString());
    }
    public static void main(String[] args) 
    {
        System.out.println(arrayStringsAreEqual(new String[]{"ab","c"},new String[]{"a","bc"}));
        System.out.println(arrayStringsAreEqual(new String[]{"ac","b"},new String[]{"ab","c"}));
        System.out.println(arrayStringsAreEqual(new String[]{"abc", "d", "defg"}, new String[]{"abcddefg"}));
    }
}

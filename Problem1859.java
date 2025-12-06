import java.util.Arrays;

public class Problem1859 {
    public static void main(String[] args) {
        System.out.println(sortSentence("is2 sentence4 This1 a3"));
    }
    public static String sortSentence(String s) {
        String[] arr = s.split(" ");

        Arrays.sort(arr, (a,b) -> a.charAt(a.length()-1) - b.charAt(b.length()-1));

        for(int i=0; i<arr.length; i++)
        {
            arr[i] = arr[i].substring(0, arr[i].length()-1);
        }

        return String.join(" ", arr);
    }
}

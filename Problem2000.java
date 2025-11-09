public class Problem2000 
{
    public String reversePrefix(String word, char ch) {
        
        int end = word.indexOf(ch);
        if(end == -1) return word;
        
        int start = 0;
        char[] arr = word.toCharArray();

        while(start < end)
        {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        return new String(arr);
    }
    public static void main(String[] args) {
        
    }    
}

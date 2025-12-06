import java.util.Stack;

public class Problem682 {
    public int calPoints(String[] operations) {
        
        int[] arr = new int[operations.length];

        int index = 0;
        for(int i=0; i<operations.length; i++)
        {
            switch(operations[i])
            {
                case "C": arr[--index] = 0; 
                          break;
                case "D": int d = arr[index-1] * 2;
                          arr[index++] = d;
                          break;
                case "+": int p = arr[index-1] + arr[index-2];
                          arr[index++] = p;
                          break;
                default : arr[index++] = Integer.parseInt(operations[i]);
            }
        }

        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            sum += arr[i];
        }
        return sum;
    }
}

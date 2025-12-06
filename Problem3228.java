public class Problem3228 {
    public static void main(String[] args) {
        System.out.println(maxOperations("1001101"));
        System.out.println(maxOperations("00111"));
    }
    public static int maxOperations(String s) {
        int ans = 0;
        int temp = 0;

        for(int i=0; i<s.length();i++){
            char c = s.charAt(i);
            if(c=='1') temp++;
            else{
                if(i==s.length()-1 || s.charAt(i+1)=='1') ans += temp;
            }   
        }

        return ans;
        // int ans = 0;
        // char[] arr = s.toCharArray();
        // int n = arr.length;
        
        // for(int i=0; i<arr.length-1; i++){
        //     // if(arr[i]=='1' && arr[n-1]=='0'){
        //     //     arr[i]='0';
        //     //     arr[n-1]='1';
        //     //     ans++;
        //     // }
        //     // else 
        //     if(arr[i]=='1' && arr[i+1]=='0')
        //     {
        //         int j=i;
        //         while(j<arr.length-1 && arr[j]=='1' && arr[j+1]!='1'){
        //             char temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //             j++;
        //         }
        //         ans++;
        //         i=-1;
        //     }
        // }

        // return ans;
    }
}

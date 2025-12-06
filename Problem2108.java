public class Problem2108 {
    public static String firstPalindrome(String[] words) {
        // for(String s : words){
        //     String temp = new StringBuilder(s).reverse().toString();
        //     if(temp.equals(s)) return s;
        // }
        // return "";

        for(String s : words){
            int start = 0, end = s.length()-1;
            boolean flag = true;
            while(start < end){
                if(s.charAt(start) != s.charAt(end)) {
                    flag = false;
                    break;
                }
                start++;
                end--;
            }

            if(flag) return s;
        }
        return "";
    }    
}

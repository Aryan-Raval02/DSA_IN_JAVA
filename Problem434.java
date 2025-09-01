public class Problem434 
{
    public static int countSegments(String s) 
    {
        // int n = s.length();
        // int segments = 0;
        // for(int i=0;i<n;i++){
        //     if((i==0 || s.charAt(i-1)== ' ') && s.charAt(i) != ' '){
        //         segments++;
        //     }
            
        // }
        // return segments; 

        if (s.trim().length() == 0) return 0;
        return s.trim().split("\\s+").length;    
    }
    public static void main(String[] args) 
    {
        System.out.println(countSegments("Hello, my name is John"));
        System.out.println(countSegments("Hello"));
    }    
}

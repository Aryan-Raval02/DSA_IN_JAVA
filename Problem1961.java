public class Problem1961 {
    public boolean isPrefixString(String s, String[] words) {
        
        // StringBuilder sb = new StringBuilder(s);
        // for(int i=0; i<words.length; i++)
        // {
        //     if(!s.contains(words[i]))
        //         return false;
        //     else{
        //         if(sb.toString().startsWith(words[i]))
        //         {
        //             sb = sb.replace(0, words[i].length(), "");
        //         }
        //     }  
        //     if(sb.isEmpty())
        //         return true;
        // }

        // return false;

        int count=0;
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<words.length; i++)
        {
            sb.append(words[i]);

            if(!s.startsWith(sb.toString()) && count>0){
                return true;
            }
            count++;
        }

        if(s.startsWith(sb.toString()))
            return true;
        
        return false;
    }
}

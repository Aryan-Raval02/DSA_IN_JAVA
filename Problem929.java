import java.util.HashSet;
import java.util.Set;

public class Problem929 
{
    public static int numUniqueEmails(String[] emails) 
    {
        Set<String> uniques = new HashSet<>();

        for(String email : emails)
        {
            String[] part = email.split("@");
            String local = part[0];
            String domain = part[1];

            int firstPlus = local.indexOf("+");
            if(firstPlus != -1)
                local = local.substring(0, firstPlus);

            local = local.replace(".", "");

            uniques.add(local+"@"+domain);
        }

        return uniques.size();
    }
    public static void main(String[] args) 
    {
        System.out.println(numUniqueEmails(new String[]{"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com","testemail+david@lee.tcode.com"}));
    }    
}

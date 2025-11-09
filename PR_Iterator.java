import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PR_Iterator 
{
    public static void main(String[] args) 
    {
        List<String> list = new ArrayList<>();
        
        list.add("A");
        list.add("B");
        list.add("C");

        Iterator<String> itr = list.iterator();

        while(itr.hasNext())
        {
            String value = itr.next();
            System.out.println(value);
        }
    }    
}

import java.lang.Runtime.Version;

public class Problem165 
{
    public static int compareVersion(String version1, String version2) 
    {
        String[] ver1 = version1.split(".");
        String[] ver2 = version2.split(".");

        for(int i=0; i<Math.max(ver1.length, ver2.length); i++)
        {
                if(Integer.parseInt(ver1[i]) > Integer.parseInt(ver2[i]))
                {
                    return 1;
                }
                else
                {
                    return -1;
                }
        }

        return 0;
    }
    public static void main(String[] args) 
    {
        System.out.println(compareVersion("1.2", "1.10"));
    }    
}

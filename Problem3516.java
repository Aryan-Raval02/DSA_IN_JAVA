public class Problem3516 
{
    public static int findClosest(int x, int y, int z) 
    {
        // if(Math.abs(z-x) == Math.abs(z-y)) return 0;
        // return Math.abs(z-x) < Math.abs(z-y) ? 1 : 2;

        int one = 0;
        while(x!=z)
        {
            if(x>z)
            {
                x--;
                one++;
            }
            if(x<z)
            {
                x++;
                one++;
            }
        }

        int two = 0;
        while(y!=z)
        {
            if(y>z)
            {
                y--;
                two++;
            }
            if(y<z)
            {
                y++;
                two++;
            }
        }

        if(one == two) return 0;
        return one < two ? 1 : 2;
    }
    public static void main(String[] args) 
    {
        System.out.println(findClosest(2, 7, 4));
        System.out.println(findClosest(2, 5, 6));
        System.out.println(findClosest(1, 5, 3));
    }    
}

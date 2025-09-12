public class Problem2011 
{
    public static int finalValueAfterOperations(String[] operations) 
    {
        int x = 0;

        for(String s : operations)
        {
            switch(s) 
            {
                case "X++" : x++; break;

                case "++X" : ++x; break;

                case "--X" : --x; break;

                case "X--" : x--; break;
            }
        }
        return x;

        // int X = 0;
        // for(String op : operations)
        // {
        //     if(op.charAt(1) == '+')
        //     {
        //         X++;
        //     }
        //     else
        //     {
        //        X--;
        //     }
        // }
        // return X;

    }
    public static void main(String[] args) 
    {
        System.out.println(finalValueAfterOperations(new String[]{"--X","X++","X++"}));
        System.out.println(finalValueAfterOperations(new String[]{"++X","++X","X++"}));
        System.out.println(finalValueAfterOperations(new String[]{"X++","++X","--X","X--"}));
    }    
}

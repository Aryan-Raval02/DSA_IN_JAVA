import java.util.Arrays;

public class Problem492 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(constructRectangle(4)));
    }

    public static int[] constructRectangle(int area) {
        
        int w = (int) Math.sqrt(area);
        
        while(area % w != 0)
        {
            w--;
        }

        int l = area/w;
        return new int[]{l, w};
    }
}

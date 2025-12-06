public class Problem717 {
    public static void main(String[] args) {
        System.out.println(new int[]{1,0,0});
    }

    public static boolean isOneBitCharacter(int[] bits) {
        
        for(int i=0; i<bits.length; i++){

            if(i == bits.length-1 && bits[i] == 0)
                return true;

            if(bits[i] == 1) 
                i++;
        }

        return false;
    }
}

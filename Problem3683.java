public class Problem3683 {
    public static void main(String[] args) {
        
    }
    public int earliestTime(int[][] tasks) {
        int min = Integer.MAX_VALUE;
        for(int[] task : tasks){
            min = Math.min(task[0] + task[1], min);
        }
        return min;
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class Problem506 
{
    public static String[] findRelativeRanks(int[] score) 
    {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        Map<Integer,String> map = new HashMap<>();

        for(int s : score)
        {
            pq.add(s);
        }

        int rank=1;
        while(!pq.isEmpty())
        {
            int point = pq.poll();
            
            switch(rank)
            {
                case 1: map.put(point, "Gold Medal"); break;
                case 2: map.put(point, "Silver Medal"); break;
                case 3: map.put(point, "Bronze Medal"); break;
                default:map.put(point, String.valueOf(rank)); 
            }

            rank++;
        }   

        String[] ans = new String[score.length];

        for(int i=0; i<map.size(); i++)
        {
            ans[i] = map.get(score[i]);
        }

        return ans;
    }
    
    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{5,4,3,2,1})));
        System.out.println(Arrays.toString(findRelativeRanks(new int[]{10,3,8,9,4})));
    }
}

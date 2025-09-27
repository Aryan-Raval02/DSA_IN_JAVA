import java.util.Arrays;

public class Problem34 
{
    public static int[] searchRange(int[] nums, int target) 
    {

        return new int[]{
            firstOccurance(nums, target),
            lastOccurance(nums, target)
        };

        // int[] ans = new int[]{-1,-1};
        
        // if(nums.length == 0 || nums.length == 1 && target!=nums[0]) return ans;

        // int start = 0;
        // int end = nums.length-1;

        // if(start == end) return new int[]{0,0};
        // if(nums.length == 2)
        // {
        //     if(nums[0] == nums[1] && nums[0] == target) return new int[]{0,1};
        //     else return ans;
        // }

        // boolean startFlag = false;
        // boolean endFlag = false;

        // int mid = nums.length/2;

        // if(nums[mid] < target)
        // {
        //     if(!startFlag && nums[mid] == target)
        //     {
        //         ans[0]=mid;
        //         startFlag = true;
        //     }
        //     else if(!endFlag && nums[end] == target)
        //     {
        //         ans[1]=end;
        //         endFlag = true;
        //     }
        //     if(!startFlag) mid++;
        //     if(!endFlag) end--;
        // }
        // else if(nums[mid] == target)
        // {
        //     if(mid+1 != nums.length-1 && nums[mid+1] == target)
        //     {
        //         ans[0] = mid;
        //         ans[1] = mid+1;
        //     }
        //     else if( mid-1 != -1 && nums[mid-1] == target)
        //     {
        //         ans[0] = mid-1;
        //         ans[1] = mid;
        //     }
        //     else
        //     {
        //         ans[0] = -1;
        //         ans[1] = -1;
        //     }
        // }
        // else
        // {
        //     if(!startFlag && nums[start] == target)
        //     {
        //         ans[0]=start;
        //         startFlag = true;
        //     }
        //     else if(!endFlag && nums[mid] == target)
        //     {
        //         ans[1]=mid;
        //         endFlag = true;
        //     }
        //     if(!startFlag) start++;
        //     if(!endFlag) mid--;
        // }

        // return ans;

    //     int[] ans = new int[]{-1,-1};
        
    //     if(nums.length == 0) return ans;
    //     if(nums.length == 1 && target==nums[0]) return new int[]{0,0};
    //     if(nums.length == 1 && target!=nums[0]) return ans;

    //     int start = 0;
    //     int end = nums.length-1;

    //     boolean startFlag = false;
    //     boolean endFlag = false;

    //     while(start<=end)
    //     {
    //         if(!startFlag && nums[start] == target)
    //         {
    //             ans[0] = start;
    //             startFlag = true;
    //         }
    //         if(!endFlag && nums[end] == target)
    //         {
    //             ans[1] = end;
    //             endFlag = true;
    //         }
    //         if(startFlag && endFlag) return ans;
    //         if(!startFlag) start++;
    //         if(!endFlag) end--;
    //     }

    //     if(nums[start] != nums[end]) return ans;

    //     return ans;
    }    

    public static int firstOccurance(int[] arr, int x)
    {
        int low = 0, high = arr.length-1;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(arr[mid] > x)
            {
                high = mid - 1;
            }
            else if(arr[mid] < x)
            {
                low = mid + 1;
            }
            else
            {
                if(mid == 0 || arr[mid-1] != arr[mid])
                {
                    return mid;
                }
                else
                {
                    high = mid - 1;
                }
            }
        }
        return -1;
    }

    public static int lastOccurance(int[] arr, int x)
    {
        int low = 0, high = arr.length-1;
        while(low <= high)
        {
            int mid = (low + high) / 2;
            if(arr[mid] > x)
            {
                high = mid - 1;
            }
            else if(arr[mid] < x)
            {
                low = mid + 1;
            }
            else
            {
                if(mid == arr.length-1 || arr[mid+1] != arr[mid])
                {
                    return mid;
                }
                else
                {
                    low = mid + 1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) 
    {
        System.out.println(Arrays.toString(searchRange(new int[]{}, 0))); 
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 8)));   
        System.out.println(Arrays.toString(searchRange(new int[]{5,7,7,8,8,10}, 6)));
        System.out.println(Arrays.toString(searchRange(new int[]{5},5)));
        System.out.println(Arrays.toString(searchRange(new int[]{5}, 0)));
        System.out.println(Arrays.toString(searchRange(new int[]{2,2}, 2)));
    }
}

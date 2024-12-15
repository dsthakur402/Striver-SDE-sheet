public class KdaneAlgo {
    public int maxSubArray(int[] nums) {
        int curSum = 0, maxSum = nums[0];
        for(int i = 0; i<nums.length; i++){
            curSum += nums[i];
            maxSum = maxSum<curSum? curSum:maxSum;
            if(curSum < 0){
                curSum = 0;
            }
        }
        return maxSum;
    }
}

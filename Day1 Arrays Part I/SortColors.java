public class SortColors{
    public void sortColors(int[] nums) {
        int[] freq = new int[3];
        for(int n : nums){
            freq[n]++;
        }
        int i = 0; int k = 0;
        while(i < nums.length){
            if(freq[k]-- > 0){
                nums[i++] = k;
            } else {
                k++;
            }
        }
    }
}
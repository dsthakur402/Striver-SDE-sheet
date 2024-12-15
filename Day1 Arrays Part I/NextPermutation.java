import java.util.Arrays;

public class NextPermutation {
    public void nextPermutation(int[] nums) {
        int idx = -1;
        if(nums.length == 1) return;
        
        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                idx = i;   
                       
                break;     
            }
        }
        if(idx == -1){
            Arrays.sort(nums);
            return;
        }
        for(int i = nums.length - 1; i > 0; i--){
            if(nums[idx] < nums[i]){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }
        int l = idx + 1;
        int r = nums.length - 1;
        while(l <= r){
            int temp = nums[r];
            nums[r--] = nums[l];
            nums[l++] = temp;
        }
    }
}

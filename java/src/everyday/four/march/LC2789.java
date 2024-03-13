package everyday.four.march;

/**
 * 贪心
 * 注意数据溢出
 * fly  2024/3/14
 */
public class LC2789 {
    public long maxArrayValue(int[] nums) {
        int end = nums.length -1;
        for(int i = nums.length-2;i>=0;i--){
            if(end >= nums[i]){
                end += nums[i];
            }else {
                end = nums[i];

            }
        }
        return end;
    }
}

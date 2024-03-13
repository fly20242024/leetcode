package everyday.four.march;

import java.util.HashSet;
import java.util.Map;

/**
 * hash
 * fly  2024/3/13
 */
public class LC128 {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int length = 0;
        for(int i = 0;i<nums.length;i++){
            if(set.contains(nums[i])){
                set.remove(nums[i]);
                int len = 1;
                int a = nums[i]-1;
                int b = nums[i]+1;
                while (set.contains(a)){
                    set.remove(a);
                    len++;
                    a--;
                }
                while (set.contains(b)){
                    set.remove(b);
                    len++;
                    b++;
                }
                length = Math.max(len,length);
            }
            if(set.isEmpty()){
                break;
            }
        }
        return length;
    }
}

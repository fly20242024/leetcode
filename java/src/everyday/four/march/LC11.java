package everyday.four.march;

/**
 * fly  2024/3/14
 */
public class LC11 {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int max = 0;
        while (left < right){
            if(height[left] <= height[right]){
                max = Math.max(max,height[left] * (right - left));
                left++;
            }else {
                max = Math.max(max,height[right] * (right -left));
                right--;
            }
        }
        return max;
    }
}

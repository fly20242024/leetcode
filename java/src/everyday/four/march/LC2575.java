package everyday.four.march;

/**
 * lc2575 字符串模拟应用题
 * 首先截取每个字符串前缀，判断其能否被整除，最后输出结果
 * 初试错误 ：未考虑数值界限
 *
 * 推导数值余数可得 8 % 4 = 0; 82 % 4 = (0 * 10 + 2) % 4 = 2; 823 % 4 = (20 + 3) % 4 = 3......
 *
 * 时间复杂度O(N)
 * 空间复杂度O(N)
 * fly  2024/3/7
 */
public class LC2575 {
    public int[] divisibilityArray(String word, int m) {
        char[] chars = word.toCharArray();
        int[] res = new int[chars.length];
        long end = 0;
        for(int i= 0;i<chars.length;i++){
            end = (end * 10 + (chars[i] - '0')) % m;
            if(end == 0){
                res[i] = 1;
            }
        }
        return res;
    }
}

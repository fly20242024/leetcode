package everyday.four.march;

/**
 * 本题为找规律题
 * 分析规律 贪心加入最小值
 *
 * 第一次忘记处理数值界限
 *
 * fly  2024/3/8
 */
public class LC2834 {
    public int minimumPossibleSum(int n, int target) {
        int mod = 1000000007;
        int mid = target / 2;

        if(mid >= n){
            return (int) (((long)(1 + n) * n / 2) % mod);
        }
        return (int)((((long)(1 + n) * n / 2)  + ((long)target + target + (n -mid)-1) *(n-mid) / 2) % mod);
    }
}

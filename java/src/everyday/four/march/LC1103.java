package everyday.four.march;

/**
 * 模拟
 * fly  2024/3/9
 */
public class LC1103 {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int add = 1;
        int count = 0;
        while (candies >= add){
            ans[count % num_people] += add;
            candies -= add;
            add++;
            count++;
        }
        ans[count % num_people] += candies;
        return ans;
    }
}

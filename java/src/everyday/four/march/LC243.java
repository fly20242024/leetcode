package everyday.four.march;

/**
 *
 * 本题为双指针应用题
 *
 * 简单题重拳出击！比题解少了一些运算
 * fly  2024/3/8
 */
public class LC243 {
    public int shortestDistance(String[] wordsDict, String word1, String word2) {
        int a = -1;
        int b = -1;
        int min = wordsDict.length;
        for(int i = 0;i< wordsDict.length;i++){
            if(wordsDict[i].equals(word1)){
                //如果b != -1 则表明之前出现过b
                //如果b > a，则表明出现了新的a的位置没有计算，如果b < a，则i - a 必然大于 b - a,没必要计算
                if(b != -1 && b > a){
                    min = Math.min(min,i - b);
                }
                a = i;
            }else if(wordsDict[i].equals(word2)){
                if(a != -1 && a > b){
                    min = Math.min(min,i - a);
                }
                b = i;
            }
        }
        return min;
    }
}

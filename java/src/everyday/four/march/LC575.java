package everyday.four.march;

import java.util.HashSet;

/**
 * hash 题
 * fly  2024/3/9
 */
public class LC575 {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> set = new HashSet<>();
        int len = candyType.length / 2;
        for(int i = 0;i<candyType.length;i++){
            set.add(candyType[i]);
        }
        if(set.size() > len){
            return len;
        }else {
            return set.size();
        }
    }
}

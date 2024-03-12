package everyday.four.march;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * hash + 滑动窗口
 * fly  2024/3/12
 */
public class LC244 {
}

class WordDistance {

    HashMap<String, List<Integer>> map;
    public WordDistance(String[] wordsDict) {
        map = new HashMap<>();
        for(int i = 0;i< wordsDict.length;i++){
            if(map.containsKey(wordsDict[i])){
                List<Integer> list = map.get(wordsDict[i]);
                list.add(i);
                map.put(wordsDict[i],list);
            }else {
                List<Integer> list = new ArrayList<>();
                list.add(i);
                map.put(wordsDict[i],list);
            }
        }
    }

    public int shortest(String word1, String word2) {
        List<Integer> a = map.get(word1);
        List<Integer> b = map.get(word2);
        int x = 0;
        int y = 0;
        int tA = a.get(0);
        int tB = b.get(0);
        int min = Integer.MAX_VALUE;
        while (x < a.size() && y < b.size()){
            if(tA < tB){
                min = Math.min(min,tB - tA);
                x++;
                if(x < a.size()){
                    tA = a.get(x);
                }
            }else {
                min = Math.min(min,tA - tB);
                y++;
                if(y < b.size()){
                    tB = b.get(y);
                }
            }
        }
        return min;
    }
}
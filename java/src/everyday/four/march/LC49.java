package everyday.four.march;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * fly  2024/3/12
 * hash
 * 时间：O(N*M)
 * 空间：O(N)
 */
public class LC49 {

    //计数法
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String,List<String>> map = new HashMap<>();
        for(int i = 0;i<strs.length;i++){
            int[] arr = new int[26];
            for(int j = 0;j<strs[i].length();j++){
                arr[strs[i].charAt(j) - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for(int j = 0;j<26;j++){
                sb.append(arr[j]);
                sb.append(",");
            }
            String end = sb.toString();
            if(map.containsKey(end)){
                List<String> list= map.get(end);
                list.add(strs[i]);
                map.put(end,list);
            }else {
                List<String> list = new ArrayList<>();
                list.add(strs[i]);
                map.put(end,list);
            }
        }
        for(String str : map.keySet()){
            ans.add(map.get(str));
        }
        return ans;
    }
    
}

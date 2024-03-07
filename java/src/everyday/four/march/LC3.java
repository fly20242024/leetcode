package everyday.four.march;

import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

/**
 * 本题为不定滑窗和hash题目
 *
 * fly  2024/3/7
 */
public class LC3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String read = s.nextLine();
        System.out.println(lengthOfLongestSubstring(read));
    }
    public static int lengthOfLongestSubstring(String s) {
        int res = 0;
        if(s.length() == 0){
            return res;
        }
        char[] chars = s.toCharArray();
        HashSet<Character> set = new HashSet<>();
        int a = 0;
        int b = 0;
        while (b < chars.length){
            if(set.contains(chars[b])){
                res = Math.max(set.size(),res);
                while (chars[a] != chars[b]){
                    set.remove(chars[a]);
                    a++;
                }
                a++;
            }else {
                set.add(chars[b]);
            }
            b++;
        }
        res = Math.max(set.size(),res);
        return res;
    }
}

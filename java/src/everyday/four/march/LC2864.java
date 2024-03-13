package everyday.four.march;

/**
 * 贪心 + 快慢指针
 * fly  2024/3/13
 */
public class LC2864 {
    public String maximumOddBinaryNumber(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int index = 0;
        for(int i = 0;i<chars.length;i++){
            if(chars[i] == '1'){
                while (chars[index] == '1' && index < i){
                    index++;
                }
                if(chars[index] == '0'){
                    chars[index] = '1';
                    chars[i] = '0';
                    index++;
                }
            }
        }
        if(index != len){
            chars[len-1] = '1';
            chars[index-1] = '0';
        }
        return new String(chars);
    }
}

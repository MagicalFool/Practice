package com.alth.leetcode;

/**
 * 将一个给定字符串根据给定的行数，以从上往下、从左到右进行 Z 字形排列。
 *
 * 比如输入字符串为 "LEETCODEISHIRING" 行数为 3 时，排列如下：
 *
 * L   C   I   R
 * E T O E S I I G
 * E   D   H   N
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zigzag-conversion
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * @author chenchao
 */
public class AL0004 {
    public static void main(String[] args) {
        String leetcodeishiring = new AL0004().convert("LEETCODEISHIRING", 3);
        System.out.println(leetcodeishiring);
    }

    public String convert(String s, int numRows) {
        if(numRows <= 1){
            return s;
        }
        StringBuilder[] sb = new StringBuilder[numRows];
        for(int i = 0; i < sb.length; i++){
            sb[i] = new StringBuilder();
        }
        for(int i=0; i < s.length(); i++){
            int index = i % (2*numRows -2);
            index = index < numRows?index : 2*numRows -2-index;
            sb[index].append(s.charAt(i));
            for (int j = 0; j < sb.length; j++) {
                if (j != index){
                    sb[j].append(" ");
                }
            }
        }
        String res = "";
        for(int i = 0;i < sb.length; i++){
            res += sb[i].toString().trim() + "\n";
        }
        return res;
    }
}

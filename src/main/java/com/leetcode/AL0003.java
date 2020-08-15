package com.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class AL0003 {

    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {
//        char[] chs = s.toCharArray();
//        // 标记好位置，在相近的地方标记哦
//        List<CharObject> list = new ArrayList<>(chs.length);
//        Map<Character,CharObject> map = new HashMap<>();
//
//        for (int i = 0; i < chs.length; i++) {
//            list.add(new CharObject(i,chs[i]));
//            CharObject object = new CharObject();
//            object.setEnd(i); // 标记最后一次出现位置
//            if (object.getStart() == object.getEnd()){
//                object.setStart(i); // 标记第一次出现位置
//            }
//            object.setPosition(); // 当前位置
//            object.setValue(chs[i]);
//
//            map.put(chs[i],object);
//        }
//        // 根据距离排序
//        Map<Character, List<CharObject>> collect = list.stream().collect(Collectors.groupingBy(CharObject::getValue));
//        // 标记好各自字符的距离
//        for (int c = 0; c < chs.length; c++) {
//            collect.get(chs[c]);
//        }
        return 1;
    }

    class CharObject{
        int position;
        char value;
        int start;
        int end;

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }

        public CharObject(int position, char value, int start, int end) {
            this.position = position;
            this.value = value;
            this.start = start;
            this.end = end;
        }

        public CharObject() {
        }

        public int getPosition() {
            return position;
        }

        public void setPosition(int position) {
            this.position = position;
        }

        public char getValue() {
            return value;
        }

        public void setValue(char value) {
            this.value = value;
        }

        public CharObject(int position, char value) {
            this.position = position;
            this.value = value;
        }
    }
}

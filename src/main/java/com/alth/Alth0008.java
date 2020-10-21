package com.alth;

import java.util.HashMap;
import java.util.Map;

public class Alth0008 {

    public static void main(String[] args) {
        int iii = new Alth0008().romanToInt("IIV");
        System.out.println(iii);
    }

    public int romanToInt(String s) {
        Map<Character, Integer> maps = new HashMap<>();
        maps.put('I', 1);
        maps.put('V', 5);
        maps.put('X', 10);
        maps.put('L', 50);
        maps.put('C', 100);
        maps.put('D', 500);
        maps.put('M', 1000);

        char[] chars = s.toCharArray();
        for (int i = 1; i <= (chars.length) / 2; i++) {
            int o = maps.get(chars[chars.length -1 - ((i -1) * 2)]);
            int j = maps.get(chars[chars.length -1 - ((i -1) * 2 + 1)]);

            System.out.println( o +"-"+ j);
        }
        return 0;
    }
}

package com.datastruct.tree;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int id = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            String s = sc.next();
            String s1 = sc.next();

            sum += (Integer.valueOf(s1) / 100) * 15;
            id = Integer.valueOf(s);
        }
        System.out.println(id + " " + sum);
    }

}

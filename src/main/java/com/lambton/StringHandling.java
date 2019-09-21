package com.lambton;

import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringHandling {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = null;
        String s4 = new String("Hello");


        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }
        if (s3 == s2) {
            System.out.println("s3 == s2");
        } else {
            System.out.println("s3 != s2");
        }
        if (s1 == s4) {
            System.out.println("s1 == s4");
        } else {
            System.out.println("s1 != s4");
        }
        if (s1.equals(s4)) {
            System.out.println("s1 == s4");
        } else {
            System.out.println("s1 != s4");
        }
        String collegeName = "Lambton College in Toronto";
        // find the length
        int nameLength = collegeName.length();
        System.out.println("length " + nameLength);
        // Find the index of Toronto
        int index = collegeName.indexOf("Toronto");
        System.out.println("index " + index);


        // to do


        char c[] = collegeName.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }

        //reverse
        char ch[] = collegeName.toCharArray();
        char rev[] = new char[ch.length];
        int cnt = 0;
        for (int i = ch.length - 1; i >= 0; i--) {
            rev[cnt++] = ch[i];
        }
        {
            String reverseString = new String(rev);
            System.out.println("Reverse String = " + reverseString);
        }
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));

    }
}
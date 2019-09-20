package com.lambton;

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
         System.out.println("index "  + index);
         //

    }
}
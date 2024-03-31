package com.java.Random;

public class Count {

    public static void main(String[] args) {
        String s ="Banana";
        String sub = "an";

        String temp = s.replace(sub, "");
        int occ = (s.length() - temp.length()) / sub.length();
        System.out.println(occ);
    }
}

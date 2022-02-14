package com.live.coding.palindrom.string;
/**
 * String Palindrome abba
 * for loop
 * recursive test ele
 * */
public class StringPalindrom {
    public static void main(String[] args) {
        String source = "abba";
        String target="";

        for(int i=source.toCharArray().length-1;i>0;i--){
            target  =target + source.charAt(i);
        }
        System.out.println(target.equals(target));
    }

}

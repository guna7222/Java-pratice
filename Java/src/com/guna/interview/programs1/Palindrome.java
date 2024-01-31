package com.guna.interview.programs1;

public class Palindrome {
    /**
     * @param str
     * @return String
     */

    public static String palindrome(String str) {
        String normalString = str;
        String reversedString = "";
        StringBuffer stringBuffer = new StringBuffer();

        for (int i = str.length() -1 ; i >= 0; i--) {
            char c = str.charAt(i);
            stringBuffer.append(c);
        }
        reversedString = stringBuffer.toString();

        if (normalString.equals(reversedString)) {
            return "it's palindrome";
        }
        return "not a palindrome";
    }

    public static void main(String[] args) {
        String string = Palindrome.palindrome("madam");
        System.out.println(string);
    }

}


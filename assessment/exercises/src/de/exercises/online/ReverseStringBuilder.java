package de.exercises.online;

public class ReverseStringBuilder {
    public static String solution(String str) {
        StringBuilder reverseStr = new StringBuilder(str);
        reverseStr.reverse();
        String resultStr = reverseStr.toString();
        return resultStr;

        // return new StringBuilder(str).reverse().toString();
    }
}

package org.example;

public class PalindromNumber {

    public static void main(String[] args) {

        int x = 121;
        boolean test;
        StringBuilder sb = new StringBuilder();

        sb.append(x);

        String n = sb.toString();

        if(sb.reverse().toString().equals(n)){
            test = true;
            System.out.println(test);
        }else {
            test = false;
            System.out.println(test);
        }

    }
}

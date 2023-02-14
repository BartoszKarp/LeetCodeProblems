package org.example;

public class Main {
    public static void main(String[] args) {

        String a = "abc";
        char[] abc = new char[a.length()];
        String b = "";
        for(int i = 0; i < a.length(); i++){
            abc[i] = a.charAt(i);
            System.out.print(abc[i] + " ");
        }

        for(int j = a.length()-1; j >= 0; j--){
                b = b + a.charAt(j);
        }
        System.out.println(b);
    }
}
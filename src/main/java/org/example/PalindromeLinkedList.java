package org.example;

import java.util.LinkedList;

public class PalindromeLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> head = new LinkedList<>();

        boolean test;

        head.add(1);
        head.add(4);
        head.add(2);
        head.add(1);

        StringBuilder sb = new StringBuilder();

        int val = 0;

        for(int i = 0; i < head.size(); i++){
            val = val*10 + head.get(i);
        }
        System.out.println(val);

        String test1 = sb.append(val).reverse().toString();
        System.out.println(test1);

        if(sb.append(val).reverse().toString().equals(test1)){
            test = true;
            System.out.println(sb.append(val).reverse());
        } else {
            test = false;
            System.out.println(sb.append(val).reverse());
        }


    }
}

package com.Gustav.demo;

import java.util.*;



public class Main {

    public static void main(String[] args) {

        System.out.println(myNumberListReversed());


    }

    public static ArrayList myNumberListReversed(){

        List<Integer> numberList = new ArrayList<>();

        numberList.add(1);
        numberList.add(2);
        numberList.add(3);
        numberList.add(4);
        numberList.add(5);
        numberList.add(6);
        numberList.add(7);
        numberList.add(8);
        numberList.add(9);
        numberList.add(10);
        Collections.sort(numberList, Collections.reverseOrder());

        return (ArrayList) numberList;
    }
}





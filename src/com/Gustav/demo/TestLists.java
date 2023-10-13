package com.Gustav.demo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestLists {

    public void arrayListMethod(){

        List<Integer> scoreList = new ArrayList<>();
        scoreList.add(0, 0);
        scoreList.add(1,10);
        scoreList.add(2,20);
        scoreList.add(3,30);
        scoreList.add(4,40);


        System.out.println(scoreList);

    }

    public void linkedListMethod(){

        LinkedList<Integer> scoreList = new LinkedList<>();

        scoreList.add(0,100);
        scoreList.add(1,200);
        scoreList.add(2,300);
        scoreList.add(3,400);
        scoreList.add(4,500);

        scoreList.addFirst(500);


        System.out.println(scoreList);


    }
}

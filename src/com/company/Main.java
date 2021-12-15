package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.ListIterator;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> listA =new ArrayList<>();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            try {
                listA.add(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(listA);
        ArrayList<String> listB =new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            try {
                listB.add(bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println(listB);
        ArrayList<String> listC=new ArrayList<>();
        Collections.reverse(listB);
        ListIterator<String> iteratorB=listB.listIterator();
        while (iteratorB.hasNext()){
            ListIterator<String> iteratorA=listA.listIterator();
            while (iteratorB.hasNext()){
                listC.add(iteratorA.next());
                iteratorA.remove();
                break;
            }
            listC.add(iteratorB.next());
        }
        System.out.println(listC);
        Collections.sort(listC,new LengthFirstComparator());
        System.out.println(listC);
    }
}

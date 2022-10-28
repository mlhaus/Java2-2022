package en.codegym.task.pro.task13.task1305;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/*
Find and neutralize
*/

public class Solution {

    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> wordsFirstCopy = new ArrayList<>(words);
        ArrayList<String> wordsSecondCopy = new ArrayList<>(words);
        ArrayList<String> wordsThirdCopy = new ArrayList<>(words);

        removeBugWithFor(wordsFirstCopy);
        removeBugWithWhile(wordsSecondCopy);
        removeBugWithCopy(wordsThirdCopy);

        wordsFirstCopy.forEach(System.out::println);
        String line = "_________________________";
        System.out.println(line);
        wordsSecondCopy.forEach(System.out::println);
        System.out.println(line);
        wordsThirdCopy.forEach(System.out::println);
        System.out.println(line);


        ArrayList<Integer> srcList = new ArrayList<Integer>();
        Collections.addAll(srcList, 99, 98, 97);

        ArrayList<Integer> destList = new ArrayList<Integer>();
        Collections.addAll(destList, 1, 2);

        try {
            Collections.copy(destList, srcList);
        } catch(IndexOutOfBoundsException e) {
            System.out.println("Destination list too small to copy the source list");
        }


        for (int i: destList)
            System.out.println(i);
    }

    public static void removeBugWithFor(ArrayList<String> list) {
        for(int i = list.size() - 1; i >= 0; i--) {
            if(list.get(i).equalsIgnoreCase("bug")) {
                list.remove(i);
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            if(it.next().equalsIgnoreCase("bug")) {
                it.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list) {
        ArrayList<String> listCopy = new ArrayList<>(list);
        for(String value: listCopy) {
            if(value.equalsIgnoreCase("bug")) {
                list.remove(value);
            }
        }
    }
}

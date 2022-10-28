package en.codegym.task.pro.task13.task1302;

import java.util.*;

import static java.util.Arrays.asList;

/*
Verifying existence
*/

public class Solution {
    public static Set<String> languagesIKnow =
            new HashSet<>(asList("HTML CSS JavaScript SQL Java Python Java".split(" ")));

    public static void iteratorDemo() {
        Iterator<String> it = languagesIKnow.iterator();
        while(it.hasNext()) {
            String str = it.next();
            System.out.println("I know the " + str + " programming language!");
        }
    }

    public static void checkWords(String word) {
        System.out.println(String.format("The word %s is%s in the set",
                word, languagesIKnow.contains(word) ? "" : " not"));
    }

    public static void main(String[] args) {
        iteratorDemo();
        checkWords("C#");
        checkWords("Java");
    }
}

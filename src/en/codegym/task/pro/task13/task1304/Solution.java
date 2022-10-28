package en.codegym.task.pro.task13.task1304;

import java.util.*;

/*
Converting an iterator to a for-each loop
*/

public class Solution {

    public static void printList(ArrayList<String> words) {
        for(int i = words.size() - 1; i >= 0; i--) {
//        for(String word: words) {
//        for (Iterator<String> iterator = words.iterator(); iterator.hasNext(); ) {
//            String word = iterator.next();
            String word = words.get(i);
            if(word.equalsIgnoreCase("just")) {
                words.remove(word);
            }
            System.out.println(word);
        }
    }

    public static void printHashSet(HashSet<String> words) {
        Iterator<String> iterator = words.iterator();
        while (iterator.hasNext()) {
            String word = iterator.next();
//        for(String word: words) {
            if(word.equalsIgnoreCase("just")) {
                iterator.remove();
            }
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        String[] wordsArray = "I think this will be a new feature. Just just don't tell anyone that it was an accident.".split(" ");
        ArrayList<String> wordsList = new ArrayList<>(Arrays.asList(wordsArray));
        HashSet<String> wordsHashSet = new HashSet<>(wordsList);
        printList(wordsList);
        System.out.println("__________________________________");
        printHashSet(wordsHashSet);
        System.out.println("__________________________________");
        System.out.println(Arrays.toString(wordsList.toArray()));
        System.out.println("__________________________________");
        System.out.println(Arrays.toString(wordsHashSet.toArray()));
    }
}

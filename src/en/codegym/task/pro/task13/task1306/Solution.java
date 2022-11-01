package en.codegym.task.pro.task13.task1306;

import java.util.ArrayList;
import java.util.Collections;

/*
Studying the methods of the Collections class. Part 1
*/

public class Solution {
    

    public static void main(String[] args) {
        ArrayList<String> favoriteCandy = new ArrayList<>();
        Collections.addAll(favoriteCandy, "Nerds", "Laffy Taffy", "Rolos", "Butterfinger", "Starburst");
        System.out.println("My favorite candy as a kid:");
        for(String candy: favoriteCandy) {
            System.out.println("\t" + candy);
        }
        System.out.println();

        ArrayList<String> newCandy = new ArrayList<>();
        Collections.addAll(newCandy, "Reese's Peanut Butter Cups", "Peanut Butter m&m's");
        Collections.copy(favoriteCandy, newCandy);
        System.out.println("My favorite candy of all time:");
        for(String candy: favoriteCandy) {
            System.out.println("\t" + candy);
        }
        System.out.println();

        Collections.replaceAll(favoriteCandy, "Butterfinger", "Snickers");
        System.out.println("No, my actual favorite candy is:");
        for(String candy: favoriteCandy) {
            System.out.println("\t" + candy);
        }
        System.out.println();
    }
}

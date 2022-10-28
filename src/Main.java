import assignments.intro.VersionManager;
import java1refresher.*;

import java.util.Arrays;
import java.util.*;

import assignments.intro.Version;

import java.util.*;
import java.lang.reflect.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Map<Person, List<Animal>> owners_and_their_pets = new HashMap<>();

        Person marc = new Person("Marc");
        List<Animal> marcs_pets = new ArrayList<>();
        marcs_pets.add(new Cat("Zipper"));
        marcs_pets.add(new Cat("Waffles"));
        owners_and_their_pets.put(marc, marcs_pets);

        Person krystal = new Person("Krystal");
        List<Animal> krystal_pets = new ArrayList<>();
        krystal_pets.add(new Cat("Lulu"));
        krystal_pets.add(new Dog("Penny"));
        krystal_pets.add(new Cat("Gus"));
        owners_and_their_pets.put(krystal, krystal_pets);

        Person bob = new Person("Bob");
        List<Animal> bobs_pets = new ArrayList<>();
        owners_and_their_pets.put(bob, bobs_pets);

        Person amy = new Person("Amy");
        List<Animal> amys_pets = new ArrayList<>();
        amys_pets.add(new Cat("Velcro"));
        owners_and_their_pets.put(amy, amys_pets);
        
        

        owners_and_their_pets.forEach((person, pets) -> {
            // Part 1 code
        });
        System.out.println();

        processData(owners_and_their_pets);
        printReport();

    }

    static Map<String, Integer> counter = new HashMap<>();

    public static void processData(Map<Person, List<Animal>> map) {
        // Part 2 code
    }


    public static void printReport() {
        System.out.println("--- Animals Report ---");
        // Part 3 code
    }

    public static void printCollection(Collection<?> collection) {
//        System.out.println("This " + collection.getClass().getSimpleName() + " contains " + collection.size() + " " + listClass.getSimpleName() + " element" + (collection.size() == 1? "" : "s"));
         System.out.println(collection.stream().map(Object::toString).collect(Collectors.joining(", ")));
    }
}
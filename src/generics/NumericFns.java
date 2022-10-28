package generics;

import java1refresher.Book;

import java.math.BigDecimal;
import java.util.*;
import java.util.function.Consumer;

// Use a wildcard.
class NumericFns<T extends Number> {
    T num;

    // Pass the constructor a reference to
    // a numeric object.
    NumericFns(T n) {
        num = n;
    }

    // Return the reciprocal.
    double reciprocal() {
        return 1 / num.doubleValue();
    }

    // Return the fractional component.
    double fraction() {
        return num.doubleValue() - num.intValue();
    }

    // Determine if the absolute values of two
    // objects are the same.
    boolean absEqual(NumericFns<?> ob) {
        if(Math.abs(num.doubleValue()) ==
                Math.abs(ob.num.doubleValue())) return true;

        return false;
    }

    // ...
}


// Demonstrate NumericFns.
class Main3 {
    public static void main(String args[]) {

        NumericFns<Integer> ob1 = new NumericFns<>(6);
        NumericFns<Double> ob2= new NumericFns<>(-6d);
        NumericFns<Long> ob3= new NumericFns<>(-6L);
        System.out.println(ob1.absEqual(ob2));
        System.out.println(ob1.absEqual(ob3));
        NumericFns<BigDecimal> ob4 = new NumericFns<>(new BigDecimal("-5"));
        System.out.println(ob2.absEqual(ob4));



        Set<Apple> basket = new HashSet<>();
        basket.add(new Apple());
        Set<Gala> basket2= new HashSet<>();
        basket.add(new Gala());
        basket.addAll(basket2);
        System.out.println(basket.containsAll(basket2));
        Set<Book> basket3 = new HashSet<>();
        basket3.add(new Book());
        System.out.println(basket.containsAll(basket3));
//        basket.addAll(basket3);
        basket.forEach(apple -> System.out.println(apple));

        List<Food> food = new ArrayList<>();
        food.add(new Apple());
        food.add(new Banana());
        Collections.reverse(food);

    }
}

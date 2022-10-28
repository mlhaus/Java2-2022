package generics;

class Pair<T, U extends T>{
}

class Main4 {
    public static void main(String[] args) {
//        Pair<String, Integer> p1;
        Pair<Number, Integer> p2;
        Pair<Fruit, Banana> p3;
//        Pair<Banana, Fruit> p4;
    }
}

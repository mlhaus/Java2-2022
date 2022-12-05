package lambda;

public class MyNumPredicates   {
    public static <T extends Number> boolean isPrime(T n) {
        if(n.intValue() < 2) return false;
        for(int i = 2; i <= n.intValue() / i; i++) {
            if((n.intValue() % i) == 0) {
                return false;
            }
        }
        return true;
    }
    
    public <T extends Number> boolean isFactorOf(T n1, T n2) {
        return n1.intValue() % n2.intValue() == 0;
    }
}

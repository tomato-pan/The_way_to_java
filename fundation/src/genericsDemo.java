public class genericsDemo {
    public static void main(String[] args) {
        Generic<Integer> genericInteger = new Generic<Integer>(123456);
        System.out.println(genericInteger.getKey());
        double s1 = 0.15346478;
        int s2 = 2133;
        add(s1,s2);
    }
    private static <T extends Number> double add(T a , T b){

        System.out.println(a.doubleValue()+b.doubleValue());
        return a.doubleValue()+b.doubleValue();
    }
}
class Generic<T> {

    private T key;

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }
}

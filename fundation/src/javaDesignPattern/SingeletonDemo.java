package javaDesignPattern;

public class SingeletonDemo {


}
class Singeleton{
    private static Singeleton instance = null;
    private Singeleton(){}
    public static Singeleton getInstance(){
        if(instance==null){
            instance = inner.singeleton;
        }
        return instance;
    }

    public void methodA() {
        System.out.println("It's methodA");
    }

    public void methodB() {
        System.out.println("It's methodB");
    }
    private static class inner{
        private static final Singeleton singeleton = new Singeleton();
    }
    public static void main(String[] args) {
        Singeleton singeleton = Singeleton.getInstance();
        singeleton.methodA();
        singeleton.methodB();
    }
}
class Singeleton1{
    private static Singeleton1 instance;
    private Singeleton1(){}
    public static Singeleton1 getInstance(){
        // 先判断实例是否存在，若不存在再对类对象进行加锁处理
        if(instance==null){
            synchronized(Singeleton1.class){
                if(instance==null){
                    instance = new Singeleton1();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) {
        Singeleton1 singeleton = Singeleton1.getInstance();
        System.out.println(singeleton);
    }
}

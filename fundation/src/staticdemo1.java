public class staticdemo1 {
    public static void main(String[] args) {
        staticdemo sd = new staticdemo();
        staticdemo sd1 = new staticdemo();
        sd.number = 123;
        System.out.println(sd.number);
        System.out.println(sd1.number);
        sd1.number = 233;
        System.out.println(sd1.number);
        System.out.println(sd.number);
        System.out.println(staticdemo.number);
    }
}
class staticdemo{
    public String name;
    public int age;
    public static int number; //静态字段属于类，并不属于实例
}
public class classdemo2 {
    // function overload
    public void hello() {
        System.out.println("hello!!");
    }
    public void hello(String name){
        System.out.println("hello!! "+name);
    }
    public static void main(String[] args) {
        String s = "Test string";
        int n1 = s.indexOf('t');
        int n2 = s.indexOf("st");
        int n3 = s.indexOf("st", 4);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
    }

}

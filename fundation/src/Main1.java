public class Main1 {
    // 继承
    public static void main(String[] args) {
        Student s = new Student("Xiao Ming", 12, 89);
        System.out.println(s.name + " " + s.age + " " + s.score);
        //向上转型
        Person p = new Student();
        p.age = 123;
        p.name = "123";
        System.out.println(p.name + " " + p.age);
        //向下转型
        Person p1 = new Student(); // upcasting, ok
        p1.hello(); // 竟然是hello - student动态调用并非查看声明类型
        if (p1 instanceof Student) {
            Student s1 = (Student) p1;
            p1.hello();
        }// 避免向下转型失败---instanceof来判断实例类型
        Person p2 = new Person();
        p2.hello();
        System.out.println(p2 instanceof Student);
//        Student s2 = (Student) p2; // runtime error! ClassCastException!
        // 多态
        p1.hello2(p1);

    }
}

class Person {
    protected String name;
    protected int age;
    public void hello() {
        System.out.println("hello!!");
    }
    public void hello2(Person p) {
        p.hello();
        p.hello();
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {

    }
}

class Student extends Person {
    protected Book book;
    protected int score;

    public Student(String name, int age, int score) {
        super(name, age);//调用的父类的构造方法
        this.score = score;
    }

    @Override //覆写
    public void hello() {
        System.out.println("hello! xxx student!");
    }

    public Student() {
        super();
    }
    // 控制继承public sealed class Shape permits Rect, Circle, Triangle
}
class  Book{
        //组合关系
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class importPack {
    public static void main(String[] args) {
        Map<String,String> mp = new HashMap<>();
        mp.put("11","23");
        System.out.println(mp.get("11"));
        // 内部类
        Outer outer = new Outer("aaa");
        Outer.Inner1 inner = outer.new Inner1();
        inner.hello();
        outer.asyncHello();
    }
}
class Outer {
    private String name;

    Outer(String name) {
        this.name = name;
    }

    class Inner1 {
        void hello() {
            System.out.println("Hello, " + Outer.this.name);
        }
    }
    // Anonymous Class
    void asyncHello() {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello, " + Outer.this.name);
            }
        };
        new Thread(r).start();
    }
}
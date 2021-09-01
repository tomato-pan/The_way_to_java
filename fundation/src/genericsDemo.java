import java.util.ArrayList;
import java.util.Date;

public class genericsDemo {
    public static void main(String[] args) {
        Generic<Integer> genericInteger = new Generic<Integer>(123456);
        System.out.println(genericInteger.getKey());
        double s1 = 0.15346478;
        int s2 = 2133;
        add(s1,s2);
        ArrayList list123 = new ArrayList();
        list123.add(1);
        list123.add("123");
        list123.add(new Date());
        for (int i=0;i<list123.size();i++){
            System.out.println(list123.get(i));
        }

    }

    private static <T extends Number> double add(T a , T b){
        /*
        <?> 无限制通配符
        <? extends E> extends 关键字声明了类型的上界，表示参数化的类型可能是所指定的类型，或者是此类型的子类
        <? super E> super 关键字声明了类型的下界，表示参数化的类型可能是指定的类型，或者是此类型的父类
        */
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
interface Generator<T> {
    public T method();
}
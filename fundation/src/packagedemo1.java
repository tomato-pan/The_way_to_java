import java.util.ArrayList;
import java.util.List;

public class packagedemo1 {
    public static void main(String[] args) {
        int a1=221223;
        short a2 = 12312;
        byte a3 = 127;
        long a4 = 12312312312L;
        // 自动拆装箱的场景  1、基础类型放入集合里|2、包装类与基础类型比较大小|3、包装类进行运算or三目运算---此时会自动装箱
        List<Integer> li = new ArrayList<>();
        for (int i=1;i<50;i++){
            li.add(i);
        }
        // 缓存相关代码
        Integer integer1 = 3;
        Integer integer2 = 3;
        if (integer1 == integer2) // ==判断引用对象，这里是因为在-128-127区间内引用相同对象
            System.out.println("integer1 == integer2");
        else
            System.out.println("integer1 != integer2");
        Integer integer3 = 300;
        Integer integer4 = 300;
        if (integer3 == integer4)
            System.out.println("integer3 == integer4");
        else
            System.out.println("integer3 != integer4");
    }
}

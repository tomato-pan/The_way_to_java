import java.util.ArrayList;
import java.util.List;

public class packagedemo1 {
    public static void main(String[] args) {
        int a1=221223;
        short a2 = 12312;
        byte a3 = 127;
        long a4 = 12312312312L;
        // 自动拆装箱的场景  将基础类型放入集合里---此时会自动装箱
        List<Integer> li = new ArrayList<>();
        for (int i=1;i<50;i++){
            li.add(i);
        }

    }
}

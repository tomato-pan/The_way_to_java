import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class mapDemo1 {
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("1",1);
        map.put("2",2);
        map.put("3",3);
        Collection<Integer> col = map.values();
        map.put("4",4);
        System.out.println(map.size());
        System.out.println(col.size());
    }
}

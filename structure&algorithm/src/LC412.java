import java.util.ArrayList;
import java.util.List;

public class LC412 {
    public List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList();
        Integer i = 1;
        while(i<=n){
            if (i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }
            else if (i%3==0 ){list.add("Fizz");}
            else if (i%5==0 ){list.add("Buzz");}
            else {list.add(i.toString());}
            i++;
        }

        return list;
    }

    public static void main(String[] args) {
        int n = 15;
        LC412 aa = new LC412();
        List<String> list = aa.fizzBuzz(n);
        for (String i : list){
            System.out.println(i);
        }
    }
}

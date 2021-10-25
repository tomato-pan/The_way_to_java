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
    public int[] prisonAfterNDays(int[] cells, int n) {
        n = (n - 1) % 14 + 1;
        for (int i = 0; i < n; i++) {
            cells = cal(cells);
        }
        return cells;
    }

    public int[] cal(int[] cells) {
        int[] array = new int[cells.length];
        for (int i = 1; i < cells.length - 1; i++) {
            if (cells[i - 1] == cells[i + 1]) {
                array[i] = 1;
            } else {
                array[i] = 0;
            }
        }
        return array;

    }
    public int lc453(int[] nums){
        int n = nums.length;
        long min = nums[0], sum = 0;
        for (int i : nums) {
            min = Math.min(min, i);
            sum += i;
        }
        return (int)(sum - min * n);

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

package AimToOffer;

import java.util.ArrayList;
import java.util.List;

public class Offer041 {
    int size;
    List<Integer> list;
    /**
     * Initialize your data structure here.
     */
    public Offer041(int size) {
        this.size = size;
        list = new ArrayList<Integer>();
    }

    public double next(int val) {
        list.add(val);
        if (list.size()>size){list.remove(0);}
        double res = list.stream().reduce(Integer::sum).orElse(0);
        return list.size()>size ? res/size:res/list.size();
    }

    public double getSum(int[] nums, int begin, int end) {
        double sum = 0;
        for (int i = begin; i < end; i++) {
            sum += nums[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Offer041 movingAverage = new Offer041(3);
        System.out.println(movingAverage.next(1));
        System.out.println(movingAverage.next(10));
        System.out.println(movingAverage.next(3));
        System.out.println(movingAverage.next(5));
    }
}

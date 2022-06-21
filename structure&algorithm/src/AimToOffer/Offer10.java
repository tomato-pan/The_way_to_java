package AimToOffer;

public class Offer10 {
    public static int fib(int n) {
        int a=0,b=1,sum = 0;
        if (n==0)return 0;
        if (n==1)return 1;
        for (int i = 2; i <= n ; i++) {
            sum = (a+b)%1000000007;
            a=b;
            b=sum;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(fib(48));
    }
}

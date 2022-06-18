public class printBit {
    public static void main(String[] args){
        int num = 4;
        print(num);
        int num2=-6;
        print(num2);
        System.out.println("=====");
        print(num|num2);
        print(num+num2);
        print(~num2+1);
        System.out.println(printNj(num));
    }
    public static void print(int num){
        for (int i = 31; i >=0 ; i--) {
            System.out.print((num&(1<<i))==0?"0":"1");
        }
        System.out.println();
    }
    public static long printNj(int num){
        long ans = 0;
        long cur =1;
        for (int i = 1; i <=num ; i++) {
            cur=cur*i;
            ans+=cur;
        }
        return ans;
    }
}

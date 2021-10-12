public class LC29 {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;
        }
        int flag = 0, res = 0;;
        if(dividend > 0){
            flag ++;
            dividend = -dividend;
        }
        if(divisor > 0){
            flag ++;
            divisor = -divisor;
        }
        if(divisor < -1){
            while(dividend <= divisor){
                int tmp = 1;
                int div = divisor;
                while(div >= dividend - div){
                    div += div;
                    tmp += tmp;
                }
                res += tmp;
                dividend -= div;
            }
        }else{
            res = -dividend;
        }
        return flag == 1 ? -res : res;
    }

}

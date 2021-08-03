import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class Intdemo {
    // Big data

    public static void main(String[] args) {
        //BigInteger
        BigInteger bi = new BigInteger("1232131123333");
        System.out.println(bi.pow(3));
        System.out.println(bi.pow(3) instanceof BigInteger);
        // 运算只能用实例化的方法进行  相比与基础类型的计算，会慢不少
        System.out.println(bi.longValue());
//        System.out.println(bi.multiply(bi).longValueExact());// out of long range 超出范围
        //转换为byte：byteValue()
        //转换为short：shortValue()
        //转换为int：intValue()
        //转换为long：longValue()
        //转换为float：floatValue()
        //转换为double：doubleValue()
        BigInteger n = new BigInteger("999999").pow(99);
        float f = n.floatValue();
        System.out.println(f);
        //BigDecimal--任意大小且精准的浮点数--不可变对象，总是申请新的内存
        BigDecimal bd1 = new BigDecimal("123.123");
        BigDecimal bd6 = new BigDecimal("123.12300");
        System.out.println(bd1.multiply(bd1)); // 平方
        BigDecimal bd2 = new BigDecimal("1233333.36700");
        BigDecimal bd3 = new BigDecimal("1233300");
        System.out.println(bd2.scale()); //取小数的位数
        System.out.println(bd3.scale());
        BigDecimal bd4 = bd2.stripTrailingZeros();
        BigDecimal bd5 = bd3.stripTrailingZeros();
        System.out.println(bd4.scale());
        System.out.println(bd5.scale()); //-2 去掉了整数位的2个0
        BigDecimal b1 = bd2.setScale(2, RoundingMode.HALF_UP);//四舍五入
        BigDecimal b2 = bd2.setScale(2, RoundingMode.DOWN);//直接截断
        System.out.println(b1);
        System.out.println(b2);
        // 加减乘，都能做到精度不丢失，但除法必须指定精度和如何截断
        BigDecimal b3 = bd2.divide(bd1,10,RoundingMode.HALF_UP);//保留10位小数并四舍五入
        System.out.println(b3);
        //BigDecimal b4 = bd2.divide(bd1); 报错ArithmeticException
        //求余数
        BigDecimal[]dr = bd2.divideAndRemainder(bd1);
        for (int i=0;i<dr.length;i++){
            System.out.println(dr[i]); // 0-商 1-余数  可以使用这种方法判断是否为整数倍
        }
        // 两个BigDecimal数，使用compareTo方法来比较大小，不能使用equals()
        System.out.println(bd1.compareTo(bd2));
        System.out.println(bd1.equals(bd6));//因为不仅比较整数部分，还会比较小数位数
    }


}

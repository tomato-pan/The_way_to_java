import java.math.BigInteger;

public class Intdemo {
    // Big data

    public static void main(String[] args) {
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
        //BigDecimal
        
    }


}

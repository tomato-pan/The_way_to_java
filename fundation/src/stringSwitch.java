public class stringSwitch {
    public static void main(String[] args) {
        // switch支持的类型: byte\int\short\char\String
        int a = 5;
        switch (a){
        case 1:
            System.out.println(1);
            break;
        case 2:
            System.out.println(2);
            break;
        case 5:
            System.out.println(555);
            break;
        default:
            break;
        }
        // switch对整型数据直接比对数值，对char型是比较ASCII码的值
        // switch对字符串String的判断是通过equals()/hashCode()-->返回的是int型
        // 总结：switch实际上只支持一种数据类型----整型
    }
}

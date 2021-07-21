public class stringdemo1 {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "abc";
        // 此时s1、s2指向同一个"abc"对象
        s1 = s1.concat("efg");// 此时s1-->新的对象"abcefg"
        // 当想用可修改的字符串-->StringBuffer or StringBuilder
        System.out.println(s1);
        // 单线程常用 StringBulider
        StringBuilder sb = new StringBuilder();
        sb.append("aa");
        sb.append("cc");
        sb.insert(1,"abc");
        System.out.println(sb);
        sb.delete(0,1);
        System.out.println(sb);
        // 多线程安全使用StringBuffer
        StringBuffer sBuffer = new StringBuffer("learning java: ");
        sBuffer.append("www");
        sBuffer.append(".javaapi");
        sBuffer.append(".com");
        System.out.println(sBuffer);

//        System.out.println("hello".contains("0"));
//        System.out.println("hello".lastIndexOf("0"));
//        System.out.println("hello".startsWith("h"));
//        System.out.println("hello".substring(2,5));

        String s11 = "HI %s , your score is %d!!";
        System.out.println(String.format(s11,"aaa",80));


    }
}

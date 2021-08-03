public class stringdemo3 {
    public static void main(String[] args) {
        //字符串循环内拼接：使用StringBuilder
        StringBuilder sb = new StringBuilder();
        String s1 = "";
        for (int i =0;i<10;i++){
            sb.append(i);
            s1 = s1+i;
        }
        // sb>s1
        System.out.println(sb);
        System.out.println(s1);
        // String.valueOf or Integer.toString 方式 基本相同
        // s2+aa 这种方式是 = (new StringBuilder()).append(aa).toString() 实现的
        int aa = 5;
        String s2 = "abc";
        System.out.println(String.valueOf(aa)+s2);
        System.out.println(s2+aa);
    }
}

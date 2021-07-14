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
    }
}

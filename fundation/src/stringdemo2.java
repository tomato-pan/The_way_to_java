import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class stringdemo2 {
    public static void main(String[] args) {
        String s1 = "abc";
        // substring
        s1 = s1.substring(1, 3); // 产生一个新的字符串对象
        System.out.println(s1);
        // jdk6\7 不一样 6：字符串数组（offset、count）--实现造成内存泄漏 7--解决了这一问题
        // replace(与正则无关)、replaceAll(正则替换全部)、replaceFirst(替换匹配第一个)
        Pattern pattern = Pattern.compile("正则");
        Matcher matcher = pattern.matcher("123123123正则*12311正则，xxxxx正则！");
        System.out.println(matcher.replaceAll("java"));
        System.out.println(matcher.replaceFirst("java"));
        //替换html标签
        Pattern pattern1 = Pattern.compile("<.+?>", Pattern.DOTALL);
        Matcher matcher1 = pattern1.matcher("<a href=\"index.html\">主页</a>");
        String string = matcher1.replaceAll("");
        System.out.println(string);
        //替换指定文字
        String str = "Java 目前的发展史是由{0}年-{1}年";
        String[][] object = {
                new String[] {
                        "\\{0\\}",
                        "1995"
                },
                new String[] {
                        "\\{1\\}",
                        "2007"
                }
        };
        System.out.println(replace(str, object));
    }

    public static String replace(final String sourceString, Object[] object) {
        String temp = sourceString;
        for (int i = 0; i < object.length; i++) {
            String[] result = (String[]) object[i];
            Pattern pattern = Pattern.compile(result[0]);
            Matcher matcher = pattern.matcher(temp);
            temp = matcher.replaceAll(result[1]);
        }
        return temp;}
}

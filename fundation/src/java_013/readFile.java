package java_013;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.stream.Collectors;

public class readFile {
    public static void main(String[] args) {
        // 读取文件

        String  file = "./test.txt";

        List<String> lineLists = null;
        try{
            lineLists = Files.lines(Paths.get(file), Charset.defaultCharset())
                    .flatMap(line -> Arrays.stream(line.split("\n")))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            //Your exception handling here
        }
        System.out.println(lineLists);
        List<String> lists= Arrays.asList("sqlPejanović","Stanka Pejanović@@111","panj Paul","//panj1@.Paul","偶爱 八号");
        // 正则表达式
        String ss = "^[\u4e00-\u9fa50-9a-zA-Z@\\._\\-]{2,32}$";
        String ss1 = "^[\\u4E00-\\u9FA50-9a-zA-Z@\\._\\-]|[\\x{0400}-\\x{04FF}]|[\\x{0500}-\\x{052F}]|[\\x{2DE0}-\\x{2DFF}]|[\\x{A640}-\\x{A69F}]|[\\x{1C80}-\\x{1C8F}]{2,32}$";
        Pattern p = Pattern.compile(ss1);
        for (int i = 0; i < lists.toArray().length; i++) {
            Matcher matcher = p.matcher(lists.get(i));
            System.out.println(lists.get(i)+" "+matcher.find());
        }


    }
}

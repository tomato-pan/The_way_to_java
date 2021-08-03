import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class errorCatchDemo {
    public static void main(String[] args) {
        String s = "12c";
        try {
            int n = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("输入异常！");
        }
        byte[] bs = toGBK("中文");
        System.out.println(Arrays.toString(bs));
        /*
        例如：存在多个catch时
        try {
        process1();
        process2();
        process3();
        } catch (IOException | NumberFormatException e) { //合并处理
            System.out.println("IO error");
        } catch (UnsupportedEncodingException e) { // 永远捕获不到 因为UnsupportedEncodingException是IOException的子类，所以应该放置在前面
            System.out.println("Bad encoding");
        }
        finally无论有无错误异常均会执行
        */
    }

    static byte[] toGBK(String s) {
        try {
            return s.getBytes(s);
        } catch (UnsupportedEncodingException e) { // 必须被捕捉的异常
            e.printStackTrace();
            return s.getBytes();
        }
        // 可以抛出异常，然后在调用方捕获异常
    }

}

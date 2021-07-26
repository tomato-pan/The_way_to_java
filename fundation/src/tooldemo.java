import java.security.SecureRandom;
import java.util.Random;

public class tooldemo {
    public static void main(String[] args) {
        // Math
        int abs = Math.abs(-100);
        double pow = Math.pow(-2,10);

        System.out.println(abs);
        System.out.println(pow);
        // Random,Math.random()也是调用Random类。
        Random r =new Random();
        System.out.println(r.nextInt());
        System.out.println(r.nextLong());
        System.out.println(r.nextDouble());
        System.out.println(r.nextFloat());
        // SecureRandom--真随机数，安全随机种子
        SecureRandom sr = new SecureRandom();
        System.out.println(sr.nextInt(100));
    }
}

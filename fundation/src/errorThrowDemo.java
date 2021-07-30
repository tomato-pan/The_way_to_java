public class errorThrowDemo {

    public static void main(String[] args) {
//        try {
//            process1();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        Exception origin = null;
        try {
            Integer.parseInt("abc");
        } catch (Exception e) {
            System.out.println("catched");
            throw new RuntimeException(e);
        } finally {
            System.out.println("finally");
//            throw new IllegalArgumentException(); finally抛出异常会使 catch的异常屏蔽 一般不允许这里抛出

        }
    }

    static void process1() {
        try {
            process2();
        } catch (NullPointerException e) {
            throw new IllegalArgumentException();
        }
    }

    static void process2() {
        throw new NullPointerException();
    }


}

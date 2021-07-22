public class recodeDemo {
    public static void main(String[] args) {
        Point p = new Point(123,1123);
        System.out.println(p.x());
        System.out.println(p);
    }
}
// 记录类
//定义class时使用final，无法派生子类；
//每个字段使用final，保证创建实例后无法修改任何字段。
final class Point{
    private final int x;
    private final int y;
    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int x() {
        return this.x;
    }

    public int y() {
        return this.y;
    }

}

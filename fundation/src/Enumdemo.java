public class Enumdemo {
    public static void main(String[] args) {
        Weekday day = Weekday.MON;
        if (day == Weekday.SAT || day == Weekday.SUN) {
            System.out.println("Work at home!");
        } else {
            System.out.println("Work at office!");
        }
        System.out.println(Weekday.SUN.ordinal());
        // 修改enum顺序不同，.ordinal()取出的值就不同
        System.out.println(day.dayValue);
    }
}
//枚举类
enum Weekday {
    // 修改成获取值
    SUN(0), MON(1), TUE(2), WED(3), THU(4), FRI(5), SAT(6);
    public final int dayValue;

    private Weekday(int dayValue){
        this.dayValue=dayValue;
    }
}
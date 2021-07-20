public class abstractdemo1 {
    public static void main(String[] args) {
        salary1 s = new salary1(7500);
        fee1 f = new fee1(5000);
        System.out.println(totalTax(s,f));
    }

    private static double totalTax(salary1 s, fee1 f) {
        double to = 0;
        to = s.getTax()+f.getTax();
        return to;
    }

}
abstract class Income12 {
    public abstract double getTax() ;
}
interface income444{
    double getTax();
}
class salary1 extends Income12{
    protected double income;

    public salary1(double income) {
        this.income=income;
    }
    @Override
    public double getTax() {
        return income*0.1;
    }
}
class fee1 extends Income12 {
    protected double income;

    public fee1(double income) {
        this.income=income;
    }
    @Override
    public double getTax() {
        return income * 0.2; // 税率10%
    }
}
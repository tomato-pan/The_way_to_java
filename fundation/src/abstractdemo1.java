public class abstractdemo1 {
    public static void main(String[] args) {

    }
    public static double totalTax(Income... incomes) {
        double total = 0;
        for (Income income: incomes) {
            total = total + income.getTax();
        }
        return total;
    }
}
abstract class Income1 {
    public abstract double getTax() ;
}
interface income{
    double getTax();
}
public class Polydemo {
  public static double totalTax(Income... incomes) {
    double total = 0;
    for (Income income: incomes) {
      total = total + income.getTax();
    }
    return total;
  }

  public static void main(String[] args) {
    Income[] incomes = new Income[] {
            new Income(3000),
            new Salary(7500),
            new StateCouncilSpecialAllowance(15000)
    };
    Income[] incomes2 = new Income[] {
            new Income(5000),
            new Fee(7500)
    };
    System.out.println(totalTax(incomes));
    System.out.println(totalTax(incomes2));
  }
}
class Income {
  protected double income;

  public Income(double v) {
    this.income = v;
  }

  public double getTax() {
    return income * 0.1; // 税率10%
  }
}
class Fee extends Income {
  protected double income;

  public Fee(double v) {
    super(v);
  }

  public double getTax() {
    return income * 0.2; // 税率10%
  }
}
class Salary extends Income {
  public Salary(double i) {
    super(i);
  }

  @Override
  public double getTax() {
    if (income <= 5000) {
      return 0;
    }
    return (income - 5000) * 0.2;
  }
}
class StateCouncilSpecialAllowance extends Income {
  public StateCouncilSpecialAllowance(double i) {
    super(i);
  }

  @Override
  public double getTax() {
    return 0;
  }
}
package staff.management;

public class Director extends Manager{

    private double budget;

    public Director(String name, int nationalInsurance, int salary, String departName, double budget) {
        super(name, nationalInsurance, salary, departName);
        this.budget = budget;
    }
    public double getBudget() {
        return budget;
    }

    public int payBonus(){
        return this.salary/ 50;
    }
}

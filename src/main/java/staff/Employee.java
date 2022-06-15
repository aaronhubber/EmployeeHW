package staff;

public abstract class Employee {

    private String name;
    private int nationalInsurance;
    protected int salary;

    public Employee(String name, int nationalInsurance, int salary) {
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        if (name != null){
            this.name = name;
        }
}
    public int getNationalInsurance() {
        return nationalInsurance;
    }
    public int getSalary() {
        return salary;
    }
    public void raiseSalary(double raise){
        this.salary += raise;
    }
    public int payBonus(){
        return this.salary/ 100;
    }

}

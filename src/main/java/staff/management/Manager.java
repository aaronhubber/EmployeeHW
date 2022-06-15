package staff.management;

import staff.Employee;

public class Manager extends Employee {

    private String departName;

    public Manager(String name, int nationalInsurance, int salary, String departName) {
        super(name, nationalInsurance, salary);
        this.departName = departName;
    }

    public String getDepartName() {
        return departName;
    }
}

package staff;

import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before() {
        manager = new Manager("Baz Fisher", 9890, 45000, "DevOps");
    }
    @Test
    public void hasNI(){
        assertEquals(9890 , manager.getNationalInsurance());
    }
    @Test
    public void hasSalary(){
        assertEquals(45000 , manager.getSalary());
    }
    @Test
    public void hasName(){
        assertEquals("Baz Fisher" , manager.getName());
    }
    @Test
    public void hasDepartment(){
        assertEquals("DevOps" , manager.getDepartName());
    }

    @Test
    public void getRaiseAmount() {
        assertEquals(450, manager.payBonus());
    }
    @Test
    public void applyRaiseToSalary() {
        manager.raiseSalary(manager.payBonus());
        assertEquals(45450, manager.getSalary());
    }
    @Test
    public void canNotSetNameAsNull(){
        manager.setName(null);
        assertEquals("Baz Fisher", manager.getName());
    }
}

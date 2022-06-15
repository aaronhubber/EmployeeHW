package staff;

import org.junit.Before;
import org.junit.Test;
import staff.management.Director;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before() {
        director = new Director("JB Stillington", 9899, 100000, "Board", 120000000);
    }
    @Test
    public void hasNI(){
        assertEquals(9899 , director.getNationalInsurance());
    }
    @Test
    public void hasSalary(){
        assertEquals(100000 , director.getSalary());
    }
    @Test
    public void hasName(){
        assertEquals("JB Stillington" , director.getName());
    }
    @Test
    public void hasDepartment(){
        assertEquals("Board" , director.getDepartName());
    }

    @Test
    public void getRaiseAmount() {
        assertEquals(2000, director.payBonus());
    }
    @Test
    public void applyRaiseToSalary() {
        director.raiseSalary(director.payBonus());
        assertEquals(101000, director.getSalary());
    }

    @Test
    public void hasBudget(){
        assertEquals(120000000, director.getBudget(), 0.0);
    }
    @Test
    public void canNotSetNameAsNull(){
        director.setName(null);
        assertEquals("JB Stillington", director.getName());
    }
}
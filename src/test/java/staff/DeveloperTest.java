package staff;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before() {
        developer = new Developer("Brenda Moon", 9891, 5000);
    }
    @Test
    public void hasNI(){
        assertEquals(9891 , developer.getNationalInsurance());
    }
    @Test
    public void hasSalary(){
        assertEquals(5000 , developer.getSalary());
    }
    @Test
    public void hasName(){
        assertEquals("Brenda Moon" , developer.getName());
    }

    @Test
    public void getRaiseAmount() {
        assertEquals(50, developer.payBonus());
    }
    @Test
    public void applyRaiseToSalary() {
        developer.raiseSalary(developer.payBonus());
        assertEquals(5050, developer.getSalary());
    }}

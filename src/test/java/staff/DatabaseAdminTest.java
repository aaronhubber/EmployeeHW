package staff;

import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Bill Sun", 9898, 10000);
    }
    @Test
    public void hasNI(){
        assertEquals(9898 , databaseAdmin.getNationalInsurance());
    }
    @Test
    public void hasSalary(){
        assertEquals(10000 , databaseAdmin.getSalary());
    }
    @Test
    public void hasName(){
        assertEquals("Bill Sun" , databaseAdmin.getName());
    }

    @Test
    public void getRaiseAmount() {
        assertEquals(100, databaseAdmin.payBonus());
    }
    @Test
    public void applyRaiseToSalary() {
        databaseAdmin.raiseSalary(databaseAdmin.payBonus());
        assertEquals(10100, databaseAdmin.getSalary());
    }}

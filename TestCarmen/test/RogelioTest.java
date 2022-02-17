/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class RogelioTest {
    
    public RogelioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of celsiustofarenheit method, of class Rogelio.
     */
    @Test
    public void testCelsiustofarenheit() {
        System.out.println("celsiustofarenheit");
        double c = 0.0;
        Rogelio instance = new Rogelio();
        double expResult = 0.0;
        double result = instance.celsiustofarenheit(c);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of farenheittocelsius method, of class Rogelio.
     */
    @Test
    public void testFarenheittocelsius() {
        System.out.println("farenheittocelsius");
        double f = 0.0;
        Rogelio instance = new Rogelio();
        double expResult = 0.0;
        double result = instance.farenheittocelsius(f);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

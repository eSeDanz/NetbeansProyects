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
public class Test1Test {
    
    public Test1Test() {
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
     * Test of multiplica method, of class Test1.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        int a = 2;
        int b = 2;
        Test1 instance = new Test1();
        int expResult = 4;
        int result = instance.multiplica(a, b);
        assertEquals(expResult, result);
    }

    /**
     * Test of factorial method, of class Test1.
     */
    @Test
    public void testFactorial() {
        System.out.println("factorial");
        int numero = 3;
        Test1 instance = new Test1();
        int expResult = 6;
        int result = instance.factorial(numero);
        assertEquals(expResult, result);
    }
    
    @Test(timeout=1)
    public void testFactorialTimeout() {
        System.out.println("factorial con timeout");
        int numero = 999999999;
        Test1 instance = new Test1();
        int result;
        instance.factorial(numero);
    }
}

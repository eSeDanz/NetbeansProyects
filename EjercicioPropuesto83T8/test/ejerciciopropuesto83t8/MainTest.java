/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ejerciciopropuesto83t8;

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
public class MainTest {
    
    public MainTest() {
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
     * Test of main method, of class Main.
     */
   // @Test
    //public void testMain() {
      //  System.out.println("main");
        //String[] args = null;
       // Main.main(args);
   // }

    /**
     * Test of eliminar method, of class Main.
     */
    @Test
    public void testEliminar() {
        System.out.println("eliminar");
        String[] array = {"Si", "No", "Luis", "Maricarmen"};
        int posicion = 2;
        String[] expResult = {"Si", "No", "Maricarmen"};
        String[] result = Main.eliminar(array, posicion);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of eliminarPorNombre method, of class Main.
     */
    @Test
    public void testEliminarPorNombre() {
        System.out.println("eliminarPorNombre");
        String[] array = {"Si", "No", "Luis", "Maricarmen"};
        String elemento = "Pedro";
        String[] expResult = {"Si", "No", "Luis", "Maricarmen"};
        String[] result = Main.eliminarPorNombre(array, elemento);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of eliminarpornombre method, of class Main.
     */
    @Test
    public void testEliminarpornombre() {
        System.out.println("eliminarpornombre");
        String[] array = {"Si", "No", "Luis", "Maricarmen"};
        String elemento = "Luis";
        String[] expResult = {"Si", "No", "Maricarmen"};
        String[] result = Main.eliminarpornombre(array, elemento);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of insertar method, of class Main.
     */
    @Test
    public void testInsertar() {
        System.out.println("insertar");
        String[] array = {"Si", "No", "Maricarmen"};
        String elemento = "Luis";
        int posicion = 2;
        String[] expResult = {"Si", "No", "Luis", "Maricarmen"};
        String[] result = Main.insertar(array, elemento, posicion);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of ordenar method, of class Main.
     */
    @Test
    public void testOrdenar() {
        System.out.println("ordenar");
        String[] array = {"Z", "X", "B", "A"};
        String[] expResult = {"A","B","X","Z"};
        String[] result = Main.ordenar(array);
        assertArrayEquals(expResult, result);
    }


    /**
     * Test of anyadir method, of class Main.
     */
    @Test
    public void testAnyadir() {
        System.out.println("anyadir");
        String[] array = {"Si", "No", "Luis", "Maricarmen"};
        String elemento = "Putita Tropical";
        String[] expResult = {"Si", "No", "Luis", "Maricarmen", "Putita Tropical"};
        String[] result = Main.anyadir(array, elemento);
        assertArrayEquals(expResult, result);
    }

    /**
     * Test of crearArray method, of class Main.
     */
//    @Test
//    public void testCrearArray() {
//        System.out.println("crearArray");
//        String[] array = {"Si", "No", "Luis", "Maricarmen"};
//        String[] expResult = {"Si", "No", "Luis", "Maricarmen"};
//        String[] result = Main.crearArray();
//        assertArrayEquals(expResult, result);
//    }
    
}

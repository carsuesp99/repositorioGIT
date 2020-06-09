/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Carlos
 */
public class Calculadora2Test {
    
    public Calculadora2Test() {
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
     * Test of suma method, of class Calculadora.
     */
    @Test
    public void testSuma() {
        System.out.println("suma");
        Calculadora calcu = new Calculadora(5,7);
        int result = calcu.suma();
        assertEquals(12, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora calcu = new Calculadora(8,4);
        int result = calcu.resta();
        assertEquals(4, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta2 method, of class Calculadora.
     */
    @Test
    public void testResta2() {
        System.out.println("resta2");
        Calculadora calcu = new Calculadora(5,8);
        boolean result = calcu.resta2();
        assertEquals(false, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        Calculadora calcu = new Calculadora(5,5);
        int result = calcu.multiplica();
        assertEquals(25, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        Calculadora calcu = new Calculadora(10,2);
        int result = calcu.divide();
        assertEquals(5, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide2 method, of class Calculadora.
     */
    @Test
    public void testDivide2() {
        System.out.println("divide2");
        Calculadora calcu = new Calculadora(20,2);
        int result = calcu.divide2();
        assertEquals(10, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

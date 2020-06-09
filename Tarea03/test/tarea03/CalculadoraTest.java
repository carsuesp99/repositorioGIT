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
public class CalculadoraTest {
    
    public CalculadoraTest() {
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
        Calculadora calcu = new Calculadora(5,10);
        int result = calcu.suma();
        assertEquals(15, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of resta method, of class Calculadora.
     */
    @Test
    public void testResta() {
        System.out.println("resta");
        Calculadora calcu = new Calculadora(8,3);
        int result = calcu.resta();
        assertEquals(5, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of multiplica method, of class Calculadora.
     */
    @Test
    public void testMultiplica() {
        System.out.println("multiplica");
        Calculadora calcu = new Calculadora(4,3);
        int result = calcu.multiplica();
        assertEquals(12, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of divide method, of class Calculadora.
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        Calculadora calcu = new Calculadora(100,5);
        int result = calcu.divide();
        assertEquals(20, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}

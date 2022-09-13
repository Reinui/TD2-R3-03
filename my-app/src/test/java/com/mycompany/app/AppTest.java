package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }


    /**
    * Test de HelloWorld 
    */
    @Test
    public void testHelloWorld()
    {
        assert("Hello World!" == App.hello());
    }

    
}

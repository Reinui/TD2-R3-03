package com.mycompany.app;

import static org.junit.Assert.assertTrue;

import java.beans.Transient;

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

    /**
     * Test de Echo avec des mots égaux
     */
    @Test 
    public void testEchoSimilaire(){
        assert("test" == App.echo("test"));
    }
    

      /**
     * Test de Echo avec des mots différents
     */
    @Test 
    public void testEchoDifferents(){
        assertTrue("vache" != App.echo("mouton"));
    }
}

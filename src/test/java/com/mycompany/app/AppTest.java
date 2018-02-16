package com.mycompany.app;
import java.util.*;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */

     public void indexOutOfBounds() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertFalse(new App().search(array,array2,3, 4));
    }

    public void dividerEqualsZero() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(0, 2, 3, 4));
      assertFalse(new App().search(array,array2,3, 0));
    }

    public void DividesWithNoRemainder() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(0, 2, 3, 4));
      assertFalse(new App().search(array,array2,3, 1));
    }

    public void testNull() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(-1, 2, -3, -4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(0, 2, 3, 4));
      assertFalse(new App().search(array,array2,3, 1));
    }
	
    public void allPassed() {
      ArrayList<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      ArrayList<Integer> array2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
      assertTrue(new App().search(array,array2,3, 1));
    }


}

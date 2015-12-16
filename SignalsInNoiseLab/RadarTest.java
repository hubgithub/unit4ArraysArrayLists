

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {

        // initialise instance variables
        // Where monster is 
        // check the monster cell is the biggest
        // if it's right then pass
        // at least two times
    }
    
    @Test
    public void test1()
    /**
     * Test the monster is in the right postion
     */
    {
        //Test the monster see if it's at right postion
        Radar radar = new Radar(100,100);
        radar.setMonsterLocation(66,66);
        for(int time = 0; time < 100; time++)
        {
            radar.scan();
        }
        int row = 0;
        int col = 0;
        int max = 0;
        
        for(int i = 0; i < 100 ;i++)
        {
            for(int z = 0; z < 100 ;z++)
            {
                if(radar.getAccumulatedDetection(i,z) > max)
                {
                    max = radar.getAccumulatedDetection(i,z);
                    row = i;
                    col = z;
                }
            }
        }
        
        assertEquals(66,row);
        assertEquals(66,col);

    }
    
    @Test
    /**
        * Test the monster is in the right postion
        */
    public void test2()
    {
        
        //Test the monster see if it's at right postion
        Radar radar = new Radar(100,100);
        radar.setMonsterLocation(88,88);
        for(int time = 0; time < 100; time++)
        {
            radar.scan();
        }
        int row = 0;
        int col = 0;
        int max = 0;
        
        for(int i = 0; i < 100 ;i++)
        {
            for(int z = 0; z < 100 ;z++)
            {
                if(radar.getAccumulatedDetection(i,z) > max)
                {
                    max = radar.getAccumulatedDetection(i,z);
                    row = i;
                    col = z;
                }
            }
        }
        
        assertEquals(88,row);
        assertEquals(88,col);

    }




    
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

}

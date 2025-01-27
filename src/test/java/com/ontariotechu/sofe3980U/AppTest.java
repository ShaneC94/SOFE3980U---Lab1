package com.ontariotechu.sofe3980U;

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

    // Test the output for OR
    @Test
    public void appOrTest()
    {
		Binary binary1=new Binary("00010001000");
		Binary binary2=new Binary("111000");
		Binary result=Binary.or(binary1,binary2);
        assertTrue( result.getValue().equals("10111000"));
    }

    // Test the output for AND
    @Test
    public void appAndTest()
    {
		Binary binary1=new Binary("00010001000");
		Binary binary2=new Binary("111000");
		Binary result=Binary.and(binary1,binary2);
        assertTrue( result.getValue().equals("1000"));
    }

    // Test the output for Multiply
    @Test
    public void appMultiplyTest()
    {
		Binary binary1=new Binary("00010001000");
		Binary binary2=new Binary("111000");
		Binary result=Binary.multiply(binary1,binary2);
        assertTrue( result.getValue().equals("1110111000000"));
    }
}

import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTestCase{
    @Test
    public void testReverseString() throws Exception{
        String expectedValue = "The factorial of 0 is:1,The factorial of 5 is:120,The factorial of 12 is:479001600 ";
        Factorial check=new Factorial();
        String actualValue=check.printFactorial("12");
        assertEquals(expectedValue, actualValue);
    }}
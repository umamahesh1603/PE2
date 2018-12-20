import jdk.jfr.Frequency;

import static org.junit.Assert.*;

public class FrequencyCountTestcase {
    public void countFrequency() throws Exception{
        //Arranga
        String expectedValue = "i-5,am-4,this-6";

        Frequency FrequencyCount = new Frequency();
        //Act
        String actualValue = FrequencyCount.FrequencyCount("FileDemo.txt");
        //Assert
        assertEquals(expectedValue, actualValue);

    }

}
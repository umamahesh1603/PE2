package com.stackroute.unittest.pe2;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class CkeckStudentMarksTestCase {


    CkeckStudentMarksTestCase obj;
    @Before
    public void setUp() throws Exception {
        CkeckStudentMarksTestCase obj = new CkeckStudentMarksTestCase();
    }

    @After
    public void tearDown() throws Exception {
        CkeckStudentMarksTestCase obj = null;
    }

    @Test
    public void studentMax() {
        int[] arr = new int[4];
        arr[0] = 50;
        arr[1] = 54;
        arr[2] = 53;
        arr[3] = 45;
        assertEquals(54,obj.studentMax(arr));
    }

    @Test
    public void studentMin() {
        int[] arr = new int[4];
        arr[0] = 50;
        arr[1] = 54;
        arr[2] = 53;
        arr[3] = 45;
        assertEquals(45,obj.StudentMinimum(arr));
    }

    @Test
    public void studentAvg() {
        int[] arr = new int[4];
        arr[0] = 50;
        arr[1] = 54;
        arr[2] = 53;
        arr[3] = 45;
        assertEquals(50.4,obj.StudentAverage(arr), 0.001);
    }
}
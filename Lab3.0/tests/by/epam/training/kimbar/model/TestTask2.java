package by.epam.training.kimbar.model;

import org.junit.After;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestTask2 {

    Task2 task2= null;

    @Before
    public void init(){
        task2 = new Task2();
    }

    @After
    public void destroy(){
        task2 = null;
    }


    @Test
    public void testMaxNumber(){
        int num = 126345;
        int res = 6;
        assertEquals(res,task2.maxNumber(num));
    }

    @Test
    public void testPalendrome1(){
        int num = 1222;
        boolean res = false;
        assertEquals(res,task2.isPalendrome(num));
    }

    @Test
    public void testPalendrome2(){
        int num = 1221;
        boolean res = true;
        assertEquals(res,task2.isPalendrome(num));
    }

    @Test
    public void testSimple1(){
        int num = 13;
        boolean res = true;
        assertEquals(res,task2.isSimple(num));
    }

    @Test
    public void testSimple2(){
        int num = 14;
        boolean res = false;
        assertEquals(res,task2.isSimple(num));
    }

    @Test
    public void testDiffNumber1(){
        int num = 14;
        int res = 2;
        assertEquals(res,task2.getCountDifNumber(num));
    }

    @Test
    public void testDiffNumber2(){
        int num = 44445664;
        int res = 3;
        assertEquals(res,task2.getCountDifNumber(num));
    }

}

package org.example;

import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;

/**
 * Unit test for simple App.
 */
public class AppTest {
    //@Test
    //Arrange- setting upp the test
    //Act -performing the test
    //Assert - Evaluating result

    @Test
    public void arrayToStringReturnResult(){
        //Arrange- setting upp the test
        String[] testData = {"1","2"};
        String expected ="[1.2]";

        //Act -performing the test
        String actual = App.arrayToString(testData);

        //Assert - Evaluating result
        assertEquals(actual,expected);

    }
@Test
    public void testAddToStringArray() {

    String[] testArrayData = {};
    String string ="Sey Hello";
    String[] expected = {"Sey Hello"};

    String [] actual = App.addToStringArray(testArrayData,string);

    assertArrayEquals(actual,expected);

    }
    @Test
    public  void findTask(){
        String[] data = {"Basel","Karmand","Erik","Fabrice"};
        String task ="Fabrice";
        String expected ="Fabrice";

        String actual =App.findTask(task,data);
        System.out.println(Arrays.toString(data));
        assertEquals(expected,actual);
    }
}

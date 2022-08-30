package chapter2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorRefactoring2Test {

    private StringCalculatorRefactoring2 cal;

    @Before
    public void setup(){
        cal = new StringCalculatorRefactoring2();
    }

    @Test
    public void toInts(){
        String[] values = {"1", "2", "3"};
        int[] numbers = {1, 2, 3};
        assertEquals(numbers, cal.toInts(values));
    }
}
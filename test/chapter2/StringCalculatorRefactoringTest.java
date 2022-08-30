package chapter2;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringCalculatorRefactoringTest {
    private StringCalculatorRefactoring cal;

    @Before
    public void setup(){
        cal = new StringCalculatorRefactoring();
    }

    @Test
    public void check_null(){
        assertEquals(0, cal.add(null));
        assertEquals(0, cal.add(""));
    }

    @Test
    public void text_len_is_one(){
        assertEquals(1, cal.add("1"));
    }

    @Test
    public void add_contain_쉼표() throws Exception{
        assertEquals(3, cal.add("1,2"));
    }
}
import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {

    public final calculator calc = new calculator();

    @Test
    //test case by lahari
    public void add_test(){
        assertEquals(4,calc.addition(2,2));
        assertEquals(-6,calc.addition(-1,-5));
        assertEquals(3,calc.addition(4,-1));
        assertEquals(-5,calc.addition(-7,2));
    }
    @Test
    //test cases by Neeraj
    public  void sub_test(){
        assertEquals(4,calc.subtraction(9,5));
        assertEquals(-6,calc.subtraction(5,11));
        assertEquals(3,calc.subtraction(7,4));
        assertEquals(-5,calc.subtraction(2,7));
    }

    @Test
    //test cases by Martin
    public  void mul_test(){
        assertEquals("9",calc.multiplication("3","3"));
        assertEquals("-9",calc.multiplication("3","-3"));
        assertEquals("1.00000E+20",calc.multiplication("9999999999","9999999999"));
        assertEquals("-1.00000E+20",calc.multiplication("9999999999","-9999999999"));
    }

    @Test
    public  void div_test(){
        assertEquals("1",calc.division("3","3"));
        assertEquals("-1",calc.division("3","-3"));
        assertEquals("1.00000E-10",calc.division("1","9999999999"));
        assertEquals("-1.00000E-10",calc.division("1","-9999999999"));
    }


}
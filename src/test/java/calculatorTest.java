import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {
    @Test
    //test case by lahari
    public void add_test(){
        calculator a = new calculator();
        assertEquals(4,a.addition(2,2));
        assertEquals(-6,a.addition(-1,-5));
        assertEquals(3,a.addition(4,-1));
        assertEquals(-5,a.addition(-7,2));
    }
    @Test
    //test cases by Neeraj
    public  void sub_test(){
        calculator b=new calculator();

        assertEquals(4,b.subtraction(-9,-2));
        assertEquals(-6,b.subtraction(2,-5));
        assertEquals(3,b.subtraction(-1,-1));
        assertEquals(-5,b.subtraction(-7,-2));
    }


}
import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {
    @Test
    //test case by lahari
    public void add_test(){
        calculator a = new calculator();
        assertEquals(4,a.addition(2,3));
        assertEquals(-6,a.addition(-1,-3));
        assertEquals(3,a.addition(4,-7));
        assertEquals(-5,a.addition(-7,9));
    }


}
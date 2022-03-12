import org.junit.Test;

import static org.junit.Assert.*;

public class calculatorTest {
    @Test
    public void add_test(){
        calculator a = new calculator();
        assertEquals(4,a.addition(2,1));
        assertEquals(-6,a.addition(-1,-4));
        assertEquals(3,a.addition(4,-6));
        assertEquals(-5,a.addition(-7,8));
    }


}
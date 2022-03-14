import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegrationTest {

    public final calculator calc = new calculator();

    @Test
    public void IT_Add_Sub(){
        assertEquals( "3", calc.addition(calc.subtraction("2" ,"1"),"2"));
        assertEquals( "5", calc.addition(calc.subtraction("2" ,"-1"),"2"));
        assertEquals( "-1", calc.addition(calc.subtraction("-2" ,"1"),"2"));
        assertEquals( "-3", calc.addition(calc.subtraction("-2" ,"-1"),"-2"));
        assertEquals( "-4", calc.addition(calc.subtraction("-2" ,"-1"),"-3"));
    }

    @Test
    public void IT_Sub_Add(){
        assertEquals( "1", calc.subtraction(calc.addition("2" ,"1"),"2"));
        assertEquals( "-1", calc.subtraction(calc.addition("2" ,"-1"),"2"));
        assertEquals( "-3", calc.subtraction(calc.addition("-2" ,"1"),"2"));
        assertEquals( "-1", calc.subtraction(calc.addition("-2" ,"-1"),"-2"));
    }
    @Test
    public void IT_Mul_Add(){
        assertEquals( "6", calc.multiplication(calc.addition("2" ,"1"),"2"));
        assertEquals( "2", calc.multiplication(calc.addition("2" ,"-1"),"2"));
        assertEquals( "-2", calc.multiplication(calc.addition("-2" ,"1"),"2"));
        assertEquals( "6", calc.multiplication(calc.addition("-2" ,"-1"),"-2"));
    }

    @Test
    public void IT_Mul_Sub(){
        assertEquals( "2", calc.multiplication(calc.subtraction("2" ,"1"),"2"));
        assertEquals( "6", calc.multiplication(calc.subtraction("2" ,"-1"),"2"));
        assertEquals( "-6", calc.multiplication(calc.subtraction("-2" ,"1"),"2"));
        assertEquals( "2", calc.multiplication(calc.subtraction("-2" ,"-1"),"-2"));
    }

    @Test
    public void IT_Mul_Div(){
        assertEquals( "4", calc.multiplication(calc.division("2" ,"1"),"2"));
        assertEquals( "-4", calc.multiplication(calc.division("2" ,"-1"),"2"));
        assertEquals( "-4", calc.multiplication(calc.division("-2" ,"1"),"2"));
        assertEquals( "-4", calc.multiplication(calc.division("-2" ,"-1"),"-2"));
    }
    @Test
    public void IT_Div_Add(){
        assertEquals( "2", calc.division(calc.addition("2" ,"2"),"2"));
        assertEquals( "3", calc.division(calc.addition("7" ,"-1"),"2"));
        assertEquals( "4", calc.division(calc.addition("-2" ,"10"),"2"));
        assertEquals( "6", calc.division(calc.addition("-2" ,"-10"),"-2"));
    }
    @Test
    public void IT_Div_Sub(){
        assertEquals( "-1", calc.division(calc.subtraction("2" ,"4"),"2"));
        assertEquals( "4", calc.division(calc.subtraction("2" ,"-6"),"2"));
        assertEquals( "-7", calc.division(calc.subtraction("-13" ,"1"),"2"));
        assertEquals( "-3", calc.division(calc.subtraction("-2" ,"-8"),"-2"));
    }
    @Test
    public void IT_Add_Sub_Mul_Div(){
        assertEquals( "3", calc.addition(calc.subtraction(calc.multiplication(calc.division("6","2"), "2"), "5"),"2"));
        assertEquals( "1", calc.addition(calc.subtraction(calc.multiplication(calc.division("6","-2"), "2"), "-5"),"2"));
    }
}

import org.junit.Test;

import static org.junit.Assert.*;
// suggestion by Sai Chand i think calculatorTest should be private



public class calculatorTest {

    public final calculator calc = new calculator();

    @Test
    //test case by lahari
    public void add_test(){
        assertEquals("4",calc.addition("2","2"));
        assertEquals("-6",calc.addition("-1","-5"));
        assertEquals("1.00000E+10",calc.addition("9999999999","1"));
        assertEquals("-1.00000E+10",calc.addition("-9999999999","-1"));
    }
    @Test
    //test cases by Neeraj
    public  void sub_test(){
        assertEquals("4",calc.subtraction("9","5"));
        assertEquals("-6",calc.subtraction("5","11"));
        assertEquals("3",calc.subtraction("7","4"));
        assertEquals("-5",calc.subtraction("2","7"));
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

    // test cases by Sai Chand
    @Test
    public void Add_test() {
        assertEquals("21", calc.addition("12", "9"));
        assertEquals("1", calc.addition("3", "-2"));
        assertEquals("-3", calc.addition("-12", "9"));
        assertEquals("-4", calc.addition("-2", "-2"));
    }

    @Test
            public void Add_FailTest(){
        assertNotEquals("40",calc.addition("21","2"));
        assertNotEquals("3",calc.addition("-1","2"));
        assertNotEquals("23",calc.addition("21","-2"));
        assertNotEquals("-1",calc.addition("-1","-2"));
    }



    @Test
    public void Subtract_test() {
        assertEquals("1",calc.subtraction("2","1"));
        assertEquals("-1",calc.subtraction("1","2"));
        assertEquals("2",calc.subtraction("1","-1"));
        assertEquals("-999",calc.subtraction("-500","499"));
    }

    @Test
    public void Subtract_FailTest() {
        assertNotEquals("1",calc.subtraction("2","-1"));
        assertNotEquals("-1",calc.subtraction("1","-2"));
        assertNotEquals("0",calc.subtraction("1","-1"));
        assertNotEquals("-999",calc.subtraction("-500","-499"));
    }

    @Test
    public void Multiply_test() {
        assertEquals("81",calc.multiplication("27","3"));
        assertEquals("3",calc.multiplication("-1","-3"));
        assertEquals("-81",calc.multiplication("27","-3"));
        assertEquals("-3",calc.multiplication("-1","3"));

    }
    @Test
    public void Multiply_FailTest() {
        assertNotEquals("81",calc.multiplication("27","-3"));
        assertNotEquals("3",calc.multiplication("-1","3"));
        assertNotEquals("81",calc.multiplication("27","-3"));
        assertNotEquals("3",calc.multiplication("-1","3"));
    }

    @Test
    public void Divide_test() {
        assertEquals("27",calc.division("81","3"));
        assertEquals("-1",calc.division("3","-3"));
        assertEquals("-27",calc.division("-81","3"));
        assertEquals("1",calc.division("-3","-3"));
    }

    @Test
    public void Divide_FailTest() {
        assertNotEquals("-27",calc.division("81","3"));
        assertNotEquals("1",calc.division("3","-3"));
        assertNotEquals("27",calc.division("-81","3"));
        assertNotEquals("-1",calc.division("-3","-3"));
    }
// Integration testing

    @Test
    public void IT_Add_Sub(){
        assertEquals( "3", calc.addition(calc.subtraction("2" ,"1"),"2"));
        assertEquals( "5", calc.addition(calc.subtraction("2" ,"-1"),"2"));
        assertEquals( "-1", calc.addition(calc.subtraction("-2" ,"1"),"2"));
        assertEquals( "-3", calc.addition(calc.subtraction("-2" ,"-1"),"-2"));
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
        assertEquals( "3", calc.division(calc.subtraction("-2" ,"-8"),"-2"));
    }
    @Test
    public void IT_Add_Sub_Mul_Div(){
        assertEquals( "3", calc.addition(calc.subtraction(calc.multiplication(calc.division("6","2"), "2"), "5"),"2"));
        assertEquals( "1", calc.addition(calc.subtraction(calc.multiplication(calc.division("6","-2"), "2"), "-5"),"2"));
    }
}
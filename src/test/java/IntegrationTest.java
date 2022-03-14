import org.junit.Test;

import java.util.StringTokenizer;

import static org.junit.Assert.assertEquals;

public class IntegrationTest {

    public final calculator calc = new calculator();
    public final fileReader read = new fileReader();

    @Test
    public void IT_Add_Sub(){
        read.loadFile("ITAddSubTests");
        String line;
        while((line = read.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            assertEquals(tokenizer.nextToken(), calc.addition(calc.subtraction(tokenizer.nextToken(), tokenizer.nextToken()), tokenizer.nextToken()));
        }
    }

    @Test
    public void IT_Sub_Add(){
        read.loadFile("ITSubAddTests");
        String line;
        while((line = read.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            assertEquals(tokenizer.nextToken(), calc.subtraction(calc.addition(tokenizer.nextToken(), tokenizer.nextToken()), tokenizer.nextToken()));
        }
    }
    @Test
    public void IT_Mul_Add(){
        read.loadFile("ITMulAddTests");
        String line;
        while((line = read.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            assertEquals(tokenizer.nextToken(), calc.multiplication(calc.addition(tokenizer.nextToken(), tokenizer.nextToken()), tokenizer.nextToken()));
        }
    }

    @Test
    public void IT_Mul_Sub(){
        read.loadFile("ITMulSubTests");
        String line;
        while((line = read.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            assertEquals(tokenizer.nextToken(), calc.multiplication(calc.subtraction(tokenizer.nextToken(), tokenizer.nextToken()), tokenizer.nextToken()));
        }
    }

    @Test
    public void IT_Mul_Div(){
        read.loadFile("ITMulDivTests");
        String line;
        while((line = read.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            assertEquals(tokenizer.nextToken(), calc.multiplication(calc.division(tokenizer.nextToken(), tokenizer.nextToken()), tokenizer.nextToken()));
        }
    }
    @Test
    public void IT_Div_Add(){
        read.loadFile("ITDivAddTests");
        String line;
        while((line = read.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            assertEquals(tokenizer.nextToken(), calc.division(calc.addition(tokenizer.nextToken(), tokenizer.nextToken()), tokenizer.nextToken()));
        }
    }
    @Test
    public void IT_Div_Sub(){
        read.loadFile("ITDivSubTests");
        String line;
        while((line = read.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            assertEquals(tokenizer.nextToken(), calc.division(calc.subtraction(tokenizer.nextToken(), tokenizer.nextToken()), tokenizer.nextToken()));
        }
    }
    @Test
    public void IT_Add_Sub_Mul_Div(){
        read.loadFile("ITAllBasicOpsTests");
        String line;
        while((line = read.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            assertEquals( tokenizer.nextToken(), calc.addition(calc.subtraction(calc.multiplication(calc.division(tokenizer.nextToken(),tokenizer.nextToken()), tokenizer.nextToken()), tokenizer.nextToken()),tokenizer.nextToken()));
        }
    }
}

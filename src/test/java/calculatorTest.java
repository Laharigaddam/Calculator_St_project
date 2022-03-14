import org.junit.Test;

import java.util.StringTokenizer;

import static org.junit.Assert.*;

public class calculatorTest {

    public final calculator calc = new calculator();
    public final fileReader read = new fileReader();

    @Test
    public void add_test(){
        read.loadFile("additionTests");
        String line;
        while((line = read.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            assertEquals(tokenizer.nextToken(), calc.addition(tokenizer.nextToken(), tokenizer.nextToken()));
        }
    }

    @Test
    public  void sub_test(){
        read.loadFile("subtractionTests");
        String line;
        while((line = read.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            assertEquals(tokenizer.nextToken(), calc.subtraction(tokenizer.nextToken(), tokenizer.nextToken()));
        }
    }

    @Test
    public  void mul_test(){
        read.loadFile("multiplicationTests");
        String line;
        while((line = read.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            assertEquals(tokenizer.nextToken(), calc.multiplication(tokenizer.nextToken(), tokenizer.nextToken()));
        }
    }

    @Test
    public  void div_test(){
        read.loadFile("divisionTests");
        String line;
        while((line = read.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            assertEquals(tokenizer.nextToken(), calc.division(tokenizer.nextToken(), tokenizer.nextToken()));
        }
    }

    @Test
    public void Add_FailTest(){
        read.loadFile("additionFailTests");
        String line;
        while((line = read.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            assertNotEquals(tokenizer.nextToken(), calc.addition(tokenizer.nextToken(), tokenizer.nextToken()));
        }
    }

    @Test
    public void Subtract_FailTest() {
        read.loadFile("subtractionFailTests");
        String line;
        while((line = read.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            assertNotEquals(tokenizer.nextToken(), calc.subtraction(tokenizer.nextToken(), tokenizer.nextToken()));
        }
    }

    @Test
    public void Multiply_FailTest() {
        read.loadFile("multiplicationFailTests");
        String line;
        while((line = read.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            assertNotEquals(tokenizer.nextToken(), calc.multiplication(tokenizer.nextToken(), tokenizer.nextToken()));
        }
    }

    @Test
    public void Divide_FailTest() {
        read.loadFile("divisionFailTests");
        String line;
        while((line = read.readLine()) != null){
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            assertNotEquals(tokenizer.nextToken(), calc.division(tokenizer.nextToken(), tokenizer.nextToken()));
        }
    }
    @Test
    public void SqrRT_Test(){
        read.loadFile("SquareRootTests");
        String line;
        while((line = read.readLine()) != null)
        {
            StringTokenizer tokenizer = new StringTokenizer(line,",");
            assertEquals(tokenizer.nextToken(),calc.sqrRT(tokenizer.nextToken()));
        }
    }


}
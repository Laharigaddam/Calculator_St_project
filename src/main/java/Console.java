import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Console {
    private calculator calc;

    public Console(){
        calc = new calculator();
    }

    public void startConsoleInterface(){
        System.out.println("To use the calculator use the following formulas:\nAddition: + a b\nSubtraction: - a b\nMultiplication: * a b\nDivision: / a b\nSquare Root: sqrt a");
        System.out.println("Note: only 10 digits per number are accepted ie. 9 999 999 999 is the biggest accepted number\n x to exit");
        boolean exit = false;
        while(!exit){
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try{
                String cmd = br.readLine();
                String token = null;

                try{
                    StringTokenizer tokenizer = new StringTokenizer(cmd, " ");
                    token = tokenizer.nextToken();



                    if(token.equals("x")) {
                        exit = true;
                        break;
                    }

                    if(token.equals("sqrt")){
                        System.out.println(calc.sqrRT(tokenizer.nextToken()));
                    }
                    else if(token.equals("+")){
                        System.out.println(calc.addition(tokenizer.nextToken(), tokenizer.nextToken()));
                    }
                    else if(token.equals("-")){
                        System.out.println(calc.subtraction(tokenizer.nextToken(), tokenizer.nextToken()));
                    }
                    else if(token.equals("/")){
                        System.out.println(calc.division(tokenizer.nextToken(), tokenizer.nextToken()));
                    }
                    else if(token.equals("*")){
                        System.out.println(calc.multiplication(tokenizer.nextToken(), tokenizer.nextToken()));
                    }
                }catch (NoSuchElementException nsee){
                    System.out.println("Not enough arguments");
                    nsee.printStackTrace();
                }


            }
            catch (Exception e){
                e.printStackTrace();
            }
        }


    }

}

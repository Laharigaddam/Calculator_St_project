public class calculator {

    public int addition(int a, int b) {
        return a+b;
    }
    public int subtraction(int a, int b) {
        return a-b;
    }
    public int multiplication(int a, int b) {
        return a*b;
    }
    public int division(int a, int b) {
        if(b==0){
            throw new IllegalArgumentException("Given number can not be divided by 0!");
        }
        return a/b;
    }

    }
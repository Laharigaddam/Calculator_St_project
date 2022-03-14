public class calculator {

    public String addition(String a, String b) {
        double da = Double.parseDouble(a);
        double db = Double.parseDouble(b);

        da += db;

        return display(da);
    }

    public String subtraction(String a, String b) {
        double da = Double.parseDouble(a);
        double db = Double.parseDouble(b);

        da -= db;

        return display(da);
    }

    public String multiplication(String a, String b) {
        double da = Double.parseDouble(a);
        double db = Double.parseDouble(b);

        da *= db;

        return display(da);
    }

    public String division(String a, String b) {
        double da = Double.parseDouble(a);
        double db = Double.parseDouble(b);

        if(db == 0)
            return "Can't divide by zero";

        da /= db;

        return display(da);
    }

    private int IntLength(double a){
        String test = Integer.toString((int)a);
        return test.length();
    }

    private String display(double da){
        if(da > 9999999999d || da < -9999999999d || ( da < 0.000000001 && da > 0 ) || ( da > -0.000000001 && da < 0))
            return String.format("%5.5E", da);
        else if(da == (int)da)
            return String.valueOf((int)da);
        else{
            int fractional = 10 - IntLength(da);
            String tmp = IntLength(da) + "." + fractional;
            return String.format("", da);
        }
    }

    public String sqrRT(String a) {
        double da = Double.parseDouble(a);
        if(da<0)
            return "Can't square root negative numbers";
        da = Math.sqrt(da);
        return display(da);
    }
}
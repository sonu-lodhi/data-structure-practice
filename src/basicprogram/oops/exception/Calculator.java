package basicprogram.oops.exception;

public class Calculator {

    public void division(float numerator, float denominator) {
        float result =0;
        try{
            result = numerator/denominator;

        }catch (ArithmeticException aexp){
            System.out.println("cannot divide by zero");
            System.out.println("Denominator value must be not zero no.");
        }
        System.out.println("Result of dividing "+ numerator+" by "+ denominator+ " is "+result);
    }
}

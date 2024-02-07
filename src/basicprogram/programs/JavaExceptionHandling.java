package basicprogram.programs;

public class JavaExceptionHandling {
    public static void main(String[] args) {
        int x=10;
        int y=0;
        int result = 0;
        try{
            System.out.println("Entered try block........");
            result = x/y;
            System.out.println("Exited try block.........");
        } catch (ArithmeticException ex1){
            System.out.println("Inside catch block........");
            System.out.println("Unable to divide by 0");
        } catch (IndexOutOfBoundsException ex2){

        }catch (Exception ex3){

        }
        finally {
            System.out.println("Entered Finally block...................");
            System.out.println("Result is "+result);
        }
        System.out.println("Main Method ended");
    }
}

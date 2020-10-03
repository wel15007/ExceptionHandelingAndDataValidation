import java.util.Scanner;

public class ExceptionHandling {

    //doDivision method that throws an Arithmetic Exception and returns the value of num1 divided by num2.
    public static int doDivision(int num1, int num2) throws ArithmeticException {
        return num1/num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Initialize variables
        int num1;
        int num2;
        boolean isDivisible = false;

        /* Have the user input two numbers and then call the doDivision method to divide the two numbers.
         * If the bottom number is not a zero then set isDivisible equal to true and then exit the loop, otherwise
         * catch the exception, print an error message, and have the user try again.
         */
        do {
            try {
                System.out.print("Enter number 1: ");
                num1 = input.nextInt();

                System.out.print("Enter number 2: ");
                num2 = input.nextInt();

                System.out.println("The new number is " + doDivision(num1, num2));
                isDivisible = true;
            } catch (ArithmeticException arithmeticException){
                System.out.println("Exception: You cannot divide by zero. Try again");
            }
        } while(!isDivisible);

    }
}
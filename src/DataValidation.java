import java.util.Scanner;

public class DataValidation {

    //doDivision class that throws an ArithmeticException and returns the value of num1 divided by num2
    public static int doDivision(int num1, int num2) throws ArithmeticException {
        return num1/num2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Initialize variables
        int num1 = 0;
        int num2 = 0;
        boolean isDivisible = false;
        boolean isValidNum1 = false;
        boolean isValidNum2 = false;

        /*Loop through the program to make sure the input is valid and to make sure that num2 is not zero.
         *If the number is zero then throw an exception message, set the isValidNum1 and isValidNum2 equal to false
         *and make the user try again.
         */
        do {
            try {
                do {
                    System.out.print("Enter number 1: ");
                    /*Data validation: If the next input has an integer value, then accept the input and set isValidNum1
                     *to true. If the input does not have an integer value, then display a message saying they need to
                     *input a number and have them try again.
                     */
                    if (input.hasNextInt()) {
                        num1 = input.nextInt();
                        isValidNum1 = true;
                    } else {
                        System.out.println("Not a number, please enter a number");
                        input.next();
                    }
                } while(!isValidNum1);
                do {
                    System.out.print("Enter number 2: ");
                    /*Data validation: If the next input has an integer value, then accept the input and set isValidNum2
                     *to true. If the input does not have an integer value, then display a message saying they need to
                     *input a number and have them try again.
                     */
                    if (input.hasNextInt()) {
                        num2 = input.nextInt();
                        isValidNum2 = true;
                    } else {
                        System.out.println("Not a number, please enter a number");
                        input.next();
                    }
                } while(!isValidNum2);

                //Display the result of the doDivision method.
                System.out.println("The new number is " + doDivision(num1, num2));
                isDivisible = true;

            /*If the user tried to divide by zero, so the exception that you cannot divide by zero, set both isValidNum1
             *and isValidNum2 equal to false, and loop again.
             */
            } catch (ArithmeticException arithmeticException){
                System.out.println("Exception: You cannot divide by zero. Try again");
                isValidNum1 = false;
                isValidNum2 = false;
            }
        } while(!isDivisible);
    }
}

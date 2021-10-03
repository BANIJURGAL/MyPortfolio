/*
 * This project will swap two numbers
 * Date: June 16, 2021
 * Programmer: Mamadou Bah
*/
package swap2numbers;

// Imort the Classes needed in this project
import java.util.Scanner;

public class Swap2Numbers {

    
    public static void main(String[] args) {
        // 1) Declare the local integer variables used in the project
        int tempNumber;
        int firstNumber, secondNumber;
        
        // 2) Create an object called 'input' form Class Scanner
        Scanner input = new Scanner(System.in);
        
        // 3) Prompt user to Enter the First Integer Number
        System.out.print("Entert the FirstNumber: ");
        
        // 4) Read the first number and store it in First Number variable
        firstNumber = input.nextInt();
        
        // 5) Prompt user to enter the second number
        System.out.print("Enter the Second Number: ");
        
        // 6) Read the second number and store it in Second number variable
        secondNumber = input.nextInt();
        
        // 6.1 Print out the values of the 2 numbers before swapping
        System.out.println("\n***** Before swapping the 2 numbers****");
        System.out.printf("Value of the First Number = %d %n" , firstNumber);
        System.out.printf("Value of the Second Number = %d %n" ,secondNumber);
        System.out.println("--------------------------------");
        
        // 7) Swap First Number and stoe it in tempNumber variable
        tempNumber = firstNumber;
        
        // 8) Swap the second Number and store it in first number variable
        firstNumber = secondNumber;
        
        // 9) Swap tempNumber and store it in secondNumber
        secondNumber = tempNumber;
        
        // 10) Print out the 
        System.out.println("\n***********After Swapping the 2 Numbers*********\n");
        System.out.println("Value of the first Number = " + firstNumber);
        System.out.println("value of the second Number = " + secondNumber);
        
        
    }
    
}

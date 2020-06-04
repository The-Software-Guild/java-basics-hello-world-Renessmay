
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Viktorija
 */
public class Leeson_04b {
    public static void main(String[] args) {
    // declare the number variables and initialize to 0
    int sum = 0;
    int operand1 = 0;
    int operand2 = 0;

    // declare and initialize a Scanner object - the Scanner reads
    // input from the console
    Scanner myScanner = new Scanner(System.in);

    // declare and initialize String (text) variables to hold the
    // values that the user types in - the Console only accepts
    // text, it knows nothing about numbers
    String stringOperand1 = "";
    String stringOperand2 = "";

    // ask the user to input the first operand
    System.out.println("Please enter the first number to be added:");

    // now wait until the user types something in - put the value
    // in stringOperand1
    stringOperand1 = myScanner.nextLine();

    // ask the user to input the second operand:
    System.out.println("Please enter the second number to be added:");

    // now wait until the user types something in - put the value
    // in stringOperand2
    stringOperand2 = myScanner.nextLine();

    // in order to add the values input by the user we must
    // convert the String values into int values.  We use the
    // parseInt method for this:
    operand1 = Integer.parseInt(stringOperand1);
    operand2 = Integer.parseInt(stringOperand2);

    // assign the sum of operand1 and operand2 to sum
    sum = operand1 + operand2;

    // print the sum to the console
    System.out.println("Sum is: " + sum);
    
    while (true) {

    System.out.println("Enter some data: ");

    String input = myScanner.readLine();

    if(input != null && !input.isEmpty()) {
        // User hit enter without any data. Display error message then back to top of loop
        System.out.println("You did not enter anything!");
    } else {
        // User entered something, leave the loop
        break;  
    }
    
}
    
    }}
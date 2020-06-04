/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Viktorija
 */
public class Lesson_04a {
    public static void main(String[] args) {
        // declare sum and initialize it to 0
       int sum = 0;
       // declare and initialize our operands
       int operand1 = 3;
       int operand2 = 2;

       //assign the sum of operand1 and operand2 to sum
       sum = operand1 + operand2;

       // NOTE: In the output below, the plus (+) operator
       // is acting as the string concatenation operator
       // instead of the addition operator.  In Java, we use
       // the plus (+) operator to concatentate (or glue together
       // string values.
       System.out.println("Sum is: " + sum);
    }
    
}

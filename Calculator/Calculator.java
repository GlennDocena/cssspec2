/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;
import java.util.*;
/**
 *
 * @author jcdocena
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         double num1, num2;
        String operation;
        Scanner scannerObject = new Scanner(System.in);

        System.out.println("First Value:");
        num1 = scannerObject. nextDouble();

        System.out.println("Second Value:");
        num2 = scannerObject. nextDouble();

        Scanner op = new Scanner(System.in);
        System.out.println("Operation:");
        operation = op.next();

        switch (operation)  {
        case "+":
            System.out.println("Answer: " + (num1 + num2));
            break;

        case "-":
            System.out.println("Answer: " + (num1 - num2));
            break;

        case "/":
            System.out.println("Answer: " + (num1 / num2));
            break;

        case "*":
            System.out.println("Asnwer: " + (num1 * num2));
            break;

        default:
            System.out.println("Great Job!");
        // TODO code application logic here
    }
    }
}

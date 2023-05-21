import java.util.Scanner;
class Main
{
    public static void main (String[]args)
    {
        char operator;
        Double number1, number2, result;
        // create an object of Scanner class
        Scanner input = new Scanner (System.in);
        // ask users to enter operator
        System.out.println ("Choose an operator: +, -, *, or /");
        operator = input.next ().charAt (0);
        // ask users to enter numbers
        System.out.println ("Enter first number");
        number1 = input.nextDouble ();
        System.out.println ("Enter second number");
        number2 = input.nextDouble ();
        switch (operator)
        {
            // performs addition between numbers
            case '+':
                result = number1 + number2;
                System.out.println (number1 + " + " + number2 + " = " + result);
                break;
            // performs subtraction between numbers
            case '-':result = number1 - number2;
                System.out.println (number1 + " - " + number2 + " = " + result);
                break;
            // performs multiplication between numbers
            case '*':result = number1 * number2;
                System.out.println (number1 + " * " + number2 + " = " + result);
                break;
            // performs division between numbers
            case '/':result = number1 / number2;
                System.out.println (number1 + " / " + number2 + " = " + result);
                break;
            default:System.out.println ("Invalid operator!");
                break;
        }
        input.close ();
    }
}



here is an advanced calculator program in java which can support basic as well as advanced arthmetic operations like exponentiation, square root, and modulus!
    
    
    
    
    import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        String operator;

        System.out.print("Enter the first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter an operator (+, -, *, /, ^, sqrt, %): ");
        operator = scanner.next();

        switch (operator) {
            case "+":
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case "-":
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case "*":
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case "/":
                System.out.print("Enter the second number: ");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                } else {
                    System.out.println("Error: Division by zero");
                }
                break;
            case "^":
                System.out.print("Enter the exponent: ");
                num2 = scanner.nextDouble();
                result = Math.pow(num1, num2);
                System.out.println("Result: " + result);
                break;
            case "sqrt":
                result = Math.sqrt(num1);
                System.out.println("Result: " + result);
                break;
            case "%":
                System.out.print("Enter the modulus: ");
                num2 = scanner.nextDouble();
                result = num1 % num2;
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Error: Invalid operator");
                break;
        }
    }
}


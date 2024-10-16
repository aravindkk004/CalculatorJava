import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean startCalc = true;
        while (startCalc){
            System.out.println("Enter 1 to start calculating expression and 2 to stop calculation:");
            int userInput = scanner.nextInt();
            scanner.nextLine();
            if (userInput==1){
                System.out.println("Enter a mathematical expression:");
                String expression = scanner.nextLine();
                //if the user enter invalid inputs then this code will handles 
                try {
                    double result = calculator.evaluate(expression);
                    System.out.println("The result is: " + result);
                } catch (Exception e) {
                    System.out.println("Invalid expression: " + e.getMessage());
                }
            }
            if(userInput!=1){
                System.out.println("Enter a valid input");
            }
            else if (userInput==2){
                startCalc = false;
            }
        }
        scanner.close();
    }
}


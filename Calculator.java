import java.util.Stack;

public class Calculator {
    
    public double evaluate(String expression) {
        Stack<Double> values = new Stack<>();
        Stack<Character> operators = new Stack<>();
        
        //looping all the characters in the expression
        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (Character.isWhitespace(c)) {
                continue;
            }
            //if the character is digit then it will check next character also digit or not if digit then add that number also 
            if (Character.isDigit(c)) {
                StringBuilder buffer = new StringBuilder();
                
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.')) {
                    buffer.append(expression.charAt(i++));
                }
                values.push(Double.parseDouble(buffer.toString()));
                i--; 
            }
            else if (c == '(') {
                operators.push(c);
            }

            //if character is ')' then it will evaluate the values in the stack until it reaches the '('
            else if (c == ')') {
                while (operators.peek() != '(') {
                    values.push(operation(operators.pop(), values.pop(), values.pop()));
                }
                operators.pop(); 
            }

            //if the character is an operator then it checks the precedece whether it has higher or lower precedence 
            // if it is higher then put it into the stack if it is lower or equal precendce then eveluate the top most values from the stack
            else if (c == '+' || c == '-' || c == '*' || c == '/') {
                while (!operators.isEmpty() && checkPrecedence(c, operators.peek())) {
                    values.push(operation(operators.pop(), values.pop(), values.pop()));
                }
                operators.push(c);
            }
        }

        //after looping all the characters if there is values or operators in the stack then it will evaluate
        while (!operators.isEmpty()) {
            values.push(operation(operators.pop(), values.pop(), values.pop()));
        }
        return values.pop();
    }

    //checking the operators precedence if the current character is ( or ) 
    // or if the current operator has lower or equal precedence then it returns false 
    private boolean checkPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        return true;
    }

    //performing the arithmetic operations on the numbers
    private double operation(char op, double b, double a) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
                return a / b;
            default:
                throw new UnsupportedOperationException("Invalid operator");
        }
    }
}

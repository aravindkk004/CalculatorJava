# Calculator Application

## Overview
The Calculator Application is a command-line tool that evaluates mathematical expressions.
It supports standard arithmetic operations including addition, subtraction, multiplication, and division, as well as the use of parentheses for defining operation precedence. 
The application is built in Java and provides a user-friendly interface for inputting expressions.

## Features
- **Expression Evaluation**: Calculates the result of mathematical expressions entered by the user.
- **Operator Support**: Supports `+`, `-`, `*`, and `/` operations.
- **Parentheses Handling**: Correctly evaluates expressions with parentheses to manage operator precedence.
- **Error Handling**: Provides informative error messages for invalid expressions and handles division by zero.

# File Descriptions

### Calculator.java
The `Calculator` class handles the evaluation of mathematical expressions. This file includes the following functionalities:
- **Expression Parsing**: Loops through characters of the expression to identify numbers, operators, and parentheses.
- **Stack Management**: Utilizes two stacks to manage values and operators for evaluation.
- **Operator Precedence**: Implements logic to evaluate expressions based on operator precedence.
- **Arithmetic Operations**: Defines methods to perform calculations for the supported operators, including error handling for division by zero.

### Main.java
The `Main` class serves as the entry point for the Calculator Application. This file includes:
- **User Interaction**: Prompts the user for input to start calculations or exit the application.
- **Expression Input**: Allows users to input mathematical expressions for evaluation.
- **Error Handling**: Catches and displays error messages for invalid inputs or operations.

Together, these files provide a complete implementation of the Calculator Application, allowing users to evaluate mathematical expressions through a console interface.


### Prerequisites
- Java Development Kit (JDK) installed on your system (Java 8 or higher recommended).

### Cloning the Repository
Clone the repository to your local machine using the following command:
```bash
git clone https://github.com/aravindkk004/CalculatorApp.git

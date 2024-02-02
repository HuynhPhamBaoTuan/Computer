package view;

import java.util.Scanner;

public class CalculatorView {
    private Scanner scanner;

    public CalculatorView(Scanner scanner) {
        this.scanner = scanner;
    }

    public void displayMenu() {
        System.out.println("========= Calculator Program =========");
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
        System.out.print("Please choice one option: ");
    }

    public int getInputChoice() {
        return scanner.nextInt();
    }

    public void displayResult(double result) {
        System.out.println("Result: " + result);
    }

    public void displayBMIStatus(String status) {
        System.out.println("BMI Status: " + status);
    }

    public double getInputDouble(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public String getInputOperator() {
        System.out.println("----- Normal Calculator -----");
        System.out.print("Enter operator (+, -, *, /, ^): ");
        return scanner.next().trim();
    }
}

package Question3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a calculator mode (Normal/Professional)");
        String input = sc.nextLine();

        CalculatorCreator creator = null;
        switch (input.toLowerCase()){
            case "normal":
                creator = new ConcreteCreatorNormal();
                break;
            case "professional":
                creator = new ConcreteCreatorProfessional();
                break;
            default:
                System.out.println("Invalid input");
                sc.close();
        }

        Calculator calc = creator.createCalculator();

        System.out.print("Enter operand1: ");
        int op1 = sc.nextInt();
        System.out.print("Enter operand2: ");
        int op2 = sc.nextInt();
        sc.nextLine();

        calc.setOperand(op1, op2);

        System.out.print("Enter operation (add, sub, mul, div): ");
        String operation = sc.nextLine().trim().toLowerCase();

        // 5) Gọi phương thức tương ứng
        switch (operation) {
            case "add":
                calc.addition();
                break;
            case "sub":
                calc.subtraction();
                break;
            case "mul":
                calc.multiplication();
                break;
            case "div":
                calc.division();
                break;
            default:
                System.out.println("Invalid operation!");
                sc.close();
                return;
        }

        System.out.println("Result: " + calc.getResult());
    }
}

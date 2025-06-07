package Question3;

public class ProfessionalCalculator implements Calculator{
    private int operand1;
    private int operand2;
    private String result;

    @Override
    public void setOperand(int op1, int op2) {
        this.operand1 = op1;
        this.operand2 = op2;
    }

    @Override
    public void addition() {
        result = String.valueOf(operand1 + operand2);
    }

    @Override
    public void subtraction() {
        result = String.valueOf(operand1 - operand2);
    }

    @Override
    public void multiplication() {
        result = String.valueOf(operand1 * operand2);
    }

    @Override
    public void division() {
        if (operand2 == 0) {
            result = "0";
            System.out.println("Cannot divide by zero");
        } else{
            result = String.valueOf(operand1 / operand2);
        }
    }
    @Override
    public String getResult() {
        return "";
    }
}

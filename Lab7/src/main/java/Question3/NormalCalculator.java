package Question3;

public class NormalCalculator implements Calculator{
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
        result = "Operation not supported";
    }

    @Override
    public void division() {
        result = "Operation not supported";
    }

    @Override
    public String getResult() {
        return result;
    }
}

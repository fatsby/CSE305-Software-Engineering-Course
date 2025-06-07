package Question3;

public interface Calculator {
    void setOperand (int op1, int op2);

    void addition();
    void subtraction();
    void multiplication();
    void division();

    String getResult();
}

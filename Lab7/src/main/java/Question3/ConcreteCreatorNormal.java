package Question3;

public class ConcreteCreatorNormal extends CalculatorCreator{

    @Override
    public Calculator createCalculator() {
        return new NormalCalculator();
    }
}

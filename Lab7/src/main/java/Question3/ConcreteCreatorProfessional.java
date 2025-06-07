package Question3;

public class ConcreteCreatorProfessional extends CalculatorCreator{

    @Override
    public Calculator createCalculator() {
        return new ProfessionalCalculator();
    }
}

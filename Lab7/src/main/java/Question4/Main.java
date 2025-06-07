package Question4;

public class Main {
    public static void main(String[] args) {
        BicycleBuilder builder = new ConcreteBicycleBuilder()
                .addFrameSize("Small")
                .addWheelType("Road Wheels")
                .addGearSystem("Chainrings")
                .addAccessory("LED Lights")
                .addAccessory("Water Bottle Holder");
        Bicycle bicycle = builder.build();
        bicycle.showSpecs();
    }
}

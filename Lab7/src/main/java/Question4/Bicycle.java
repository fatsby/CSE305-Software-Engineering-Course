package Question4;

import java.util.List;

public class Bicycle {
    private String frameSize;
    private String wheelType;
    private String gearSystem;
    private List<String> accessories;

    public Bicycle(String frameSize, String wheelType, String gearSystem, List<String> accessories) {
        this.frameSize = frameSize;
        this.wheelType = wheelType;
        this.gearSystem = gearSystem;
        this.accessories = accessories;
    }

    public void showSpecs() {
        System.out.println("Bicycle Specifications:");
        System.out.println("Frame Size: " + frameSize);
        System.out.println("Wheel Type: " + wheelType);
        System.out.println("Gear System: " + gearSystem);
        System.out.println("Accessories: " + (accessories.isEmpty() ? "None" : String.join(", ", accessories)));
    }
}

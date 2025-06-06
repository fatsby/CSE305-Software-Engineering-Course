
import java.util.List;

class Property {
    private String name;
    private double rentAmount;
    private String ownerName;
    private String location;

    public Property(String name, double rentAmount, String ownerName, String location) {
        this.name = name;
        this.rentAmount = rentAmount;
        this.ownerName = ownerName;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getLocation() {
        return location;
    }

    public void printPropertyDetails() {
        System.out.println("Property: " + name);
        System.out.println("Rent Amount: $" + rentAmount);
        System.out.println("Owner: " + ownerName);
        System.out.println("Location: " + location);
    }
}

class PropertyClassifier {
    private static final double PREMIUM_THRESHOLD = 2000.0;

    public static boolean isPremium(Property property) {
        return property.getRentAmount() > PREMIUM_THRESHOLD;
    }

    public static String getCategory(Property property) {
        return isPremium(property) ? "Premium Property" : "Standard Property";
    }
}

class ReportFormatter {
    private static final int MONTHS_IN_YEAR = 12;

    public void printPropertyReport(Property property) {
        property.printPropertyDetails();
        System.out.println(PropertyClassifier.getCategory(property));
        double yearlyRent = property.getRentAmount() * MONTHS_IN_YEAR;
        System.out.println("Yearly Rent: $" + yearlyRent);
        System.out.println("--------------------");
    }

    public void printReportHeader(String title) {
        System.out.println("Financial Report: " + title);
        System.out.println("----------------------------");
    }

    public void printTotalRent(double totalRent) {
        System.out.println("Total Rent Amount: $" + totalRent);
    }
}

class FinancialReport {
    private String reportTitle;
    private List<Property> properties;
    private double totalRent;

    public FinancialReport(String reportTitle, List<Property> properties) {
        this.reportTitle = reportTitle;
        this.properties = properties;
    }

    public void generateReport() {
        ReportFormatter formatter = new ReportFormatter();
        formatter.printReportHeader(reportTitle);

        totalRent = 0;
        for (Property property : properties) {
            formatter.printPropertyReport(property);
            totalRent += property.getRentAmount();
        }

        formatter.printTotalRent(totalRent);
    }
}

public class CodeSmell2 {
    public static void main(String[] args) {
        Property property1 = new Property("Apartment A", 1500.0, "John Doe", "City Center");
        Property property2 = new Property("House B", 2000.0, "Jane Smith", "Suburb");
        Property property3 = new Property("Condo C", 1800.0, "Bob Johnson", "Downtown");

        FinancialReport report = new FinancialReport("Monthly Rent Summary",
                List.of(property1, property2, property3));
        report.generateReport();
    }
}

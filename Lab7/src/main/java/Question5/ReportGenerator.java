package Question5;

interface Report {
    void generate();
}

class SalesReport implements Report {
    public void generate() {
        System.out.println("Sales Report Generated");
    }
}

class InventoryReport implements Report {
    public void generate() {
        System.out.println("Inventory Report Generated");
    }
}

public class ReportGenerator {
    public void generateReport(Report report) {
        report.generate();
    }

    public static void main(String[] args) {
        ReportGenerator reportGenerator = new ReportGenerator();
        reportGenerator.generateReport(new SalesReport());
        reportGenerator.generateReport(new InventoryReport());
    }
}




public class Main {
    public static void main(String[] args) {
        RequestCreator lowPriority = new LowPriorityConcreteCreator();
        lowPriority.processRequest();

        RequestCreator midPriority = new MidPriorityConcreteCreator();
        midPriority.processRequest();

        RequestCreator highPriority = new HighPriorityConcreteCreator();
        highPriority.processRequest();
    }
}
import java.util.*;

class Message {
    private final String content;
    private final String sender;
    private final String recipient;

    public Message(String content, String sender, String recipient) {
        this.content = content;
        this.sender = sender;
        this.recipient = recipient;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }

    public String getRecipient() {
        return recipient;
    }
}

class MessagePrinter {
    public void printSummary(Message message) {
        System.out.println("Content: " + message.getContent());
        System.out.println("Sender: " + message.getSender());
        System.out.println("Recipient: " + message.getRecipient());
    }

    public void printDetailed(Message message) {
        printSummary(message);
        System.out.println("Content Length: " + message.getContent().length());
        System.out.println("Sender Uppercase: " + message.getSender().toUpperCase());
        System.out.println("Recipient Lowercase: " + message.getRecipient().toLowerCase());
    }
}


class MessagingService {
    private final Map<String, List<Message>> inbox = new HashMap<>();

    public MessagingService() {}

    public void sendMessage(String content, String sender, String recipient) {
        Message message = new Message(content, sender, recipient);
        inbox.computeIfAbsent(recipient, k -> new ArrayList<>()).add(message);
    }

    public List<Message> getMessagesForRecipient(String recipient) {
        return inbox.getOrDefault(recipient, Collections.emptyList());
    }

    public void printAllMessages(MessagePrinter printer) {
        for (Map.Entry<String, List<Message>> entry : inbox.entrySet()) {
            for (Message message : entry.getValue()) {
                printer.printSummary(message);
                System.out.println("---");
            }
        }
    }
}

public class CodeSmell1 {
    public static void main(String[] args) {
        MessagingService messagingService = new MessagingService();
        MessagePrinter printer = new MessagePrinter();

        messagingService.sendMessage("Hello, tenant!", "Property Manager", "Tenant A");
        messagingService.sendMessage("Important notice: Rent due next week.", "Property Owner", "Tenant A");
        messagingService.sendMessage("Maintenance request received.", "Tenant A", "Property Manager");

        System.out.println("Messages for Tenant A:");
        List<Message> tenantMessages = messagingService.getMessagesForRecipient("Tenant A");
        for (Message message : tenantMessages) {
            printer.printSummary(message);
            System.out.println();
        }

        System.out.println("Example detailed message:");
        Message example = new Message("Test", "Sender", "Recipient");
        printer.printDetailed(example);

        System.out.println("All messages in system:");
        messagingService.printAllMessages(printer);
    }
}

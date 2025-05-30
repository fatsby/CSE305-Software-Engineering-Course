import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ContractBuilder newContract = new Permanent();
        Client client = new Client();
        Contract shortterm = client.requestCreateRentalContract(newContract, "STC001", "P002", "T002", 200.0, "permanent");


        String encryptedData = AESEncryption.encrypt( shortterm.toString());
        String decryptedData = AESEncryption.decrypt(encryptedData);
        System.out.println("Decrypted Data: " + decryptedData);
        System.out.println("Encrypted Data: " + encryptedData);

        String filePath= "src\\ContractInfo.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("- Encrypted Data: " + encryptedData);
            writer.newLine();
            writer.write("- Decrypted Data: ");
            writer.newLine();
            writer.write(decryptedData);
            writer.newLine();
            writer.flush();
            System.out.println("File exported at: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
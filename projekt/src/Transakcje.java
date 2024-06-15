import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Transakcje {

    private static final String FILE_NAME = "src/transakcje.txt";

    public void saveTransaction(String transaction) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))) {
            writer.write(transaction);
            writer.newLine();
            System.out.println("Transakcja została zapisana do pliku: " + FILE_NAME);
        } catch (IOException e) {
            System.err.println("Błąd podczas zapisywania transakcji do pliku: " + e.getMessage());
        }
    }

    public List<String> loadTransactions(){
        List<String> transakcje = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                transakcje.add(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return transakcje;
    }

}

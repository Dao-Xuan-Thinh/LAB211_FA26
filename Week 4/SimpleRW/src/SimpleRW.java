import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SimpleRW {
    public static void main(String[] args) {
        try (BufferedReader read = new BufferedReader(new FileReader("input.txt"));
             BufferedWriter write = new BufferedWriter(new FileWriter("output.txt"))) {

            String line;
            while ((line = read.readLine()) != null) {
                System.out.println(line);
                write.write(line);
                write.newLine();
            }

        } catch (IOException e) {
            System.out.println("Error");
        }
    }
}


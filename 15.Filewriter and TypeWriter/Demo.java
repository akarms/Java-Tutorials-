import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class Demo {
    public static void main(String[] args) {
        try {
            // Create a PrintWriter and link it to a file for writing
            PrintWriter novv = new PrintWriter("comali.txt");
            novv.println("hello makkale asda");
            novv.close();

            // Create a BufferedReader to read from the file
            BufferedReader reader = new BufferedReader(new FileReader("comali.txt"));

            // Read and print each line from the file
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the BufferedReader
            reader.close();

            // Create a PrintWriter and link it to a file for writing
            PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));
            writer.println("Hello, PrintWriter!");
            writer.printf("This is a formatted text: %d + %d = %d%n", 2, 3, 2 + 3);

            // Close the PrintWriter
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

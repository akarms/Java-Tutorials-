

import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class demo {
    public static void main(String[] args) {
        try {
            // Create a PrintWriter and link it to a file
            PrintWriter writer = new PrintWriter(new FileWriter("output.txt"));
            PrintWriter novv = new PrintWriter("comali.txt");

            novv.println("hello makkale");

            // Write formatted text to the file
            writer.println("Hello, PrintWriter!");
            writer.printf("This is a formatted text: %d + %d = %d%n", 2, 3, 2 + 3);

            // Close the PrintWriter
            writer.close();
            novv.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

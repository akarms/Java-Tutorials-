import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("Swing Application");

        // Create a new JButton
        JButton button = new JButton("Click me!");

        // Add the button to the JFrame
        frame.getContentPane().add(button);

        // Set the default operation when the frame closes
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Set the size of the frame
        frame.setSize(300, 200);

        // Make the frame visible
        frame.setVisible(true);
    }
}
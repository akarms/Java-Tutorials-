import java.io.IOException;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws NumberFormatException, IOException {

        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);
        // System.out.println("Enter a number");

        // int num = Integer.parseInt(bf.readLine());
        // System.out.println(num);

        // bf.close();


        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        System.out.println(num);
        sc.close();
        
        
        
    }
    
}

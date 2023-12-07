import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        try {
            int num = sc.nextInt();
            System.out.println(num);
        } finally {
            sc.close();
            System.out.println("Scanner closed");
        }

    }
    
}


public class Demo {
    public static void main(String[] args) {

        int i = 18;
        int j = 0;
        try {
            j = i / j;
        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
        System.out.println(j);
        System.out.println("bye");
    }
    
}

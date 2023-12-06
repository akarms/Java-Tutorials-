
public class Demo {
    public static void main(String[] args) {

        int i = 9;
        int j = 0;
        int num[] = new int[5];
        String s = null;


        try {
            j = 18 / i;
           
            System.out.println(s.length());
            System.out.println(num[5]);
        } 
        catch (ArithmeticException e) {
            System.out.println("Numbers can't be divided by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }
        catch (Exception e){
            System.out.println("SomeThing went wrong");
        }
        System.out.println(j);
        System.out.println("bye");
    }
    
}

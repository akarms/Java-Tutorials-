
@FunctionalInterface
interface A {
    void Show(int i);
}



public class Demo {
    public static void main(String[] args) {

        A obj =  i ->  System.out.println("In B" + " " + i);
            
        
        obj.Show(5);
        
    }

    
}

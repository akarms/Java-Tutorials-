class A {
    public void show() throws Exception {
        Class.forName("calc"); //actually this is a checked exception but we are not handling it here.
    }

}

public class Demo {

    public static void main(String[] args) {
        
        A obj = new A();
        try {
            obj.show();
        } catch (Exception e) {
            System.out.println("Exception handled" + e);
        }
    
    }


}
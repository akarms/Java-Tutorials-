

@FunctionalInterface
interface A {
    void Show();
}

// class B implements A {
//     public void Show() {
//         System.out.println("In B");
//     }
// }

public class Demo {
    public static void main(String[] args) {

        A obj = new A(){
            public void Show(){
                System.out.println("In B");
            }
        };
        obj.Show();
        
    }

    
}

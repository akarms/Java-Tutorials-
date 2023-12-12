

class B implements Runnable {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(200);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        Runnable obj1 = new Runnable() {
            public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(200);  
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
            
        };
        B obj2 = new B();
        
        //obj2.setPriority(10);
        //obj2.setPriority(Thread.MAX_PRIORITY);

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }
}



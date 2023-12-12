We know that we can extend the classes for Threads in java.

<br>

what if a class also have to extend anaother class rathaer than Thread class.

<br>

for example

```java
class A extends Thread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends A {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();
    }
}
```

In This situation we can use implication method 

<br>

```java
class A implements Runnable {  //here we implement it 
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
}

class B implements Runnable {   //here we implement it 
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
        A obj1 = new A();
        B obj2 = new B();
        
        

        Thread t1 = new Thread(obj1);  //we have to create an thread and have to assign it to object
        Thread t2 = new Thread(obj2);

        t1.start();  //Start
        t2.start();
    }
}

```


While Using implement method we can also create an anonymouse class


```java


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


        Runnable obj1 = new Runnable() {  //in here we are creating an anonymous class 
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

```

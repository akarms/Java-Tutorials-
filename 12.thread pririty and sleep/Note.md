### Thread priority and sleep

In the thread we can set priority to the thread.
<br>
 The priority of the thread is from 1 to 10. 
 <br>
 1 is the lowest priority and 10 is the highest priority. 
 <br>
 By default the priority of the thread is 5.

<br>

Just because we have set the priority of the thread to 10 doesn't mean that the thread will be executed first.
<br>
We can consider that we are suggesting the JVM to execute the thread first.
<br>

For example 

```java
class A extends Thread {
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
    public void run(){
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();
        
        //obj2.setPriority(10);
          obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
    }
}

```

In the above code we have set the priority of the thread to 10.

<br>

---

We can also set threat stop for a while using `sleep()` method.

<br>


For example 

```java
class A extends Thread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
            try {
                Thread.sleep(200);  //it means that after printing "Hi" it will sleep for 10 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class B extends Thread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            try {
                Thread.sleep(200);  //it means that after printing "Hi" it will sleep for 10 milliseconds
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
        
        //obj2.setPriority(10);
        //obj2.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        obj2.start();
    }
}

```


In the above example each threads have been instructed to sleep for 200 milliseconds after printing each line.



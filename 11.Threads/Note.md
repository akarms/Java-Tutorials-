Multi tasking is a process of executing multiple tasks simultaneously. We use multitasking to utilize the CPU. 
<br>
<br>
for example we are using a browser and we are listening to music at the same time.
<br>
<br>
and even in a process there could be mutiple tasks. for example in a browser there are multiple tabs. each tab is a task.
<br>
<br>

In java we can achieve multitasking by using **threads.**

Look at the below code:

```java
class A {
    public void show(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }
    }
}

class B {
    public void show(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
        }
    }
}

public class Demo {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.show();
        obj2.show();
    }
}

```
In the above code we are executing the show method of class A and class B one after the other.
It's working sequentially right.

<br>

but , What if we need to to that in same time 
<br>

that's where we use **threads**

<br>

For a thread 
1. always have to extend the `class to thread` which class you have to make a thread.
2. and override the `run()` method. - There is a method called `run()` in the `class Thread` which we have to override.
3. and then we have to create an object of the class which we have made a thread.
4. and then we have to call the `start()` method of the `class Thread` by using the object we have created.

For example 

```java
class A extends Thread {
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
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

In the above code we have made the class A and class B as threads and we have called the start method of the class Thread by using the objects of the class A and class B.

Note that the output of the above code could be like this 

```java

Hello
Hello
Hello
Hello
Hello
Hi
Hi
Hi
Hi
Hi

```

You may thing the thread doesn't work properly. but it's not. it's because of the CPU. Here CPU is really running fast. So it creates an illusion of thread is not working properly.

<br>

instead of 5 if we put 100 in the for loop then we can see the difference. 
<br>
In our machine if we have 4 cores then we can run 4 threads at the same time.
8 cores then 8 threads at the same time.
<br>
but you may see soo many threads in your pc 
<br>
that's because of in the os a sheduler is there. it's a part of the os. it's job is to schedule the threads. it's job is to decide which thread should run first and which thread should run next.








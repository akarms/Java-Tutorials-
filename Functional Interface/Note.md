# Functional interface

when there is a one abstract method in interface then it is called functional interface.

<br>

the Puporse of that interface is to provide the implementation of that perticuler method only.
<br>

This is called Single Abstract Method Interface (SAM Interface).

<br>


```java




interface A {
    void Show();
}

class B implements A {
    public void Show() {
        System.out.println("In B");
    }
}

public class Demo {
    public static void main(String[] args) {

        A obj = new B();
        obj.Show();
        
    }

    
}


```

To prevent the user from adding more methods to the interface we use the **@FunctionalInterface** annotation.

```java


@FunctionalInterface
interface A {
    void Show();
}

class B implements A {
    public void Show() {
        System.out.println("In B");
    }
}

public class Demo {
    public static void main(String[] args) {

        A obj = new A();
        obj.Show();
        
    }

    
}

```


Thus there is only a single fuction in the interface. So, we can use the that function without createing a class like the below code
@functionalInterface will prevent the user from adding more methods to the interface.

```java



@FunctionalInterface
interface A {
    void Show();
}


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

```

LIke the above also we can impliment the interface.



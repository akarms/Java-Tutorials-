There are three type of interfaces in java 8

1. Normal Interface
2. Single Abstract Method Interface
3. Marker Interface

## Normal Interface

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
This is normal interface. It has more than one method.

## Single Abstract Method Interface

The one we just studied is called `Single Abstract Method Interface` (SAM Interface).

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

        A obj = new B();
        obj.Show();
        
    }

    
}
```

To prevent the user from adding more methods to the interface we use the **@FunctionalInterface** annotation.

## Marker Interface


This is called `Marker Interface`. It has no methods. It is used to mark the class as something. For example, `Serializable` interface is used to mark the class as serializable.
<br>
Serializable is used to save the state of an object and recreate it when needed. The process of saving the state of an object is called serialization in java. The process of recreating the object from the saved state is called deserialization.

<br>

   This serialization is heppans in the user's machine.
   <br>

for example we save the game and run it again where we left it.

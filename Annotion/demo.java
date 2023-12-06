
class A{

    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In A");
    }
}

class B extends A{
    @Override
    public void showTheDataWhichBelongsToThisClass(){
        System.out.println("In B");
    }

}


public class demo {
    public static void main(String[] args) {
        B obj = new B();
        obj.showTheDataWhichBelongsToThisClass();
        
    }

    
}
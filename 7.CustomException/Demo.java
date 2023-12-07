class myException extends Exception{
    public myException(String string){
         super(string);  //this is how we assingn our thrown message to exception message.
    }

}



public class Demo {
    public static void main(String[] args) {

        int i =20;
        int j = 0;
        int num[] = new int[5];
   


        try {
            j = 18 / i;    
             
            if(j==0)
                   throw new myException("I Don't want to print zero"); //This time we are going to make a new exception of ourselves.

            System.out.println(num[4]);
        } 
        catch(myException e){
            System.out.println("This is my exception" + " " + e );   //this is our exception

        }

        catch (ArithmeticException e) {
            System.out.println("Numbers can't be divided by zero" + e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array index out of bound");
        }
        catch (Exception e){
            System.out.println("SomeThing went wrong");
        }
        System.out.println(j);
        System.out.println("bye");
    }
    
}

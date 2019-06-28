//abstract class - cannot be instantiated, has to be extended

abstract class bike{
    //default constructor
    bike(){
        System.out.println("Bike manufactured");
    }
    //abstract method
    abstract void run();
    //non abstract method
    void gear(){
        System.out.println("Gear changed");
    }
}

class dio extends bike{
    void run(){
        System.out.println("Dio running safely");
    }
    //compiler creates a default constructor "dio()" whose first line is "super();" which invokes the default constructor of the parent call.
}

public class abstract2 {
    public static void main (String args[]){
        bike obj = new dio();
        obj.run();   
        obj.gear();     
    }
}
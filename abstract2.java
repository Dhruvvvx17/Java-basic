abstract class bike{
    bike(){
        System.out.println("Bike manufactured");
    }

    abstract void run();
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
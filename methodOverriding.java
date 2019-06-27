class vehical{
    void run(){
    System.out.println("Vehical is running");
    }
}

class bike extends vehical{
    void run(){
        System.out.println("Bike is running");
    }
}

public class methodOverriding {
    public static void main (String args[]){
        bike obj1 = new bike();
        obj1.run();
    }
}
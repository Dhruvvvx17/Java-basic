// To understand upcasting and run time polymorphism

class vehical{
    void run(){
        System.out.println("vehical color white");
    }
}

class bike extends vehical{
    void run(){
        System.out.println("Bike color is black");
    }
}

public class upcasting {
    public static void main (String args[]){
        vehical obj = new bike();   //upcasting
        obj.run();
    }
}
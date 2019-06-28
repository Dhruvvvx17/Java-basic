//Using super keyword to access immediate parent class constructor

class car{
    car(){
        System.out.println("Car is ready");
    }
    
    car(String c){
        System.out.println("Color is " + c);
    }
}

class lamborghini extends car {
    lamborghini(){
        super();    //by default this is added by the compiler, and parent constuctor is called implicitly.
        System.out.println("Lamborghini is ready");
    }
    
    lamborghini(int n){
        //super();  //by default this is added by the compiler, and parent constuctor is called implicitly.
        super("black");
        System.out.println("Cost: 500,000,000");
    }
    void blank(){}
    

}

public class super3 {
    public static void main (String args[]){
        lamborghini l1 = new lamborghini();     // default constructor is called
        lamborghini l2 = new lamborghini(1);    // parametrized constructor is called
        l1.blank();
        l2.blank();
    }
}
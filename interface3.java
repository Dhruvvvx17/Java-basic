interface myinterface{
    void A();
    void B();
    void C();
    void D();
}

// myclass1 is declared abstract as the methods A,B,C & D in the interface by default are static abstract methods and so either myclass1 should implement all the methods of the interface or declare itself abstract as well
abstract class myclass1 implements myinterface{
    public void A(){
        System.out.println("A invoked");
    }
}


//All methods need not be implemented in a single class only.But they all have to be implemented eventually somewhere in the program.
class myclass2 extends myclass1{
    public void B(){
        System.out.println("B invoked");
    }
    public void C(){
        System.out.println("C invoked");
    }
    public void D(){
        System.out.println("D invoked");
    }
}

public class interface3 {
    public static void main (String args[]){
        myinterface obj = new myclass2();
        obj.A();
        obj.B();
        obj.C();
        obj.D();
    }
}
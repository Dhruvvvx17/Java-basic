//This refering to the current class methods.

class xyz {

    void method1(){
        System.out.println("Hello from method 1");
    }
    void method2(){
        System.out.println("Hello from method 2");
        this.method1();                             //refering to its own class method
    }
}

public class this2 {
    public static void main(String args[]) {
        xyz obj1 = new xyz();
        obj1.method1();
        obj1.method2();
    }
}
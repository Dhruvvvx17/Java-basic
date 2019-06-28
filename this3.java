//Calling default constructor from parameterized constructor 

class xyz {

    xyz(){
        System.out.println("Hello from default constructor");
    }

    xyz(int n) {
        this();    // this(); automatically translating into the default constructor of the class
        System.out.println("Hello from parameterized constructor");
        System.out.println(n);
    }
    void blank(){}
}

public class this3 {
    public static void main(String args[]) {
        xyz obj1 = new xyz(10);
        obj1.blank();
    }
}
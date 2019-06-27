//Calling parameterized constructor from default constructor

class xyz {

    xyz() {
        this(10); // this(int n); automatically translating into the param constructor of the class
        System.out.println("Hello from default constructor");
    }

    xyz(int n) {
        System.out.println("Hello from parameterized constructor");
        System.out.println(n);
    }
    void blank(){}
}

public class this4 {
    public static void main(String args[]) {
        xyz obj1 = new xyz();
        obj1.blank();
    }
}
//Using super keyword to access immediate parent class methods

class animal{
    void color(){
        System.out.println("White");
    }
}

class dog extends animal{
    void color(){
        System.out.println("Black");
    }
    void breed() {
        System.out.println("Bulldog");
    }
    void disp(){
        color();
        super.color();      //parent class method to be invoked
        breed();
    }
}

public class super2 {
    public static void main (String args[]){
        dog obj1 = new dog();
        obj1.disp();
    }
}
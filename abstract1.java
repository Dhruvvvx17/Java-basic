//abstrcation implementing abstract classes with an abstract method.
//abstract method is only a method declaration without a body
//when the class is inherited, the child class should either give a body for the abstract method or declare itself as abstract.

abstract class shape{
    abstract void draw();       //abstract method
}

class circle extends shape{
    void draw(){                // implementation - 1 
        System.out.println("Drawing circle");
    }
}

class square extends shape{
    void draw(){                // implementation - 2
        System.out.println("Drawing square");
    }
}


public class abstract1 {
    public static void main (String args[]){
        shape s1 = new circle();    //upcasting 
        s1.draw();          // implementation - 1 called based on the object type
    }
}
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
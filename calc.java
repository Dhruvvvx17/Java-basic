//To understand static methods in java

class solve{
    static int square(int x) {
        return (x*x);
    }

    static int cube(int x){
        return (x*x*x);
    } 
}


public class calc {
    public static void main (String args[]){
        System.out.println(solve.cube(5));          // invoked without reference variable    
        System.out.println(solve.square(5));        // invoked without reference variable
    }
}

//Static methods belong to the class rather than the object of a class. They can be invoked without needing to create an instance of the class. A static method can access static data members and change their values.
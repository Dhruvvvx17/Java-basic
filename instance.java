//Understanding instanceof in objects and classes

class animal{}

class dog extends animal{}

public class instance {
    public static void main (String args[]){
        dog obj = new dog();
        animal obj2 = new animal();
        animal obj3 = new dog();    //upcasting
        System.out.println(obj instanceof dog);         // true
        System.out.println(obj instanceof animal);      // true
        System.out.println(obj2 instanceof dog);        // false
        System.out.println(obj2 instanceof animal);     // true
        System.out.println(obj3 instanceof dog);        // true
        System.out.println(obj3 instanceof animal);     // true
    }
}
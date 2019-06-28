//Understanding downcasting using instanceof

class animal{}

class dog extends animal{
    static void method(animal a){  //static method so that it can  be invoked without a dog object
        if(a instanceof dog){
            dog o = (dog) a; // downcasting
            System.out.println(a + " downcasted to " + o);            
        }
    }
}

public class downcasting1 {
    public static void main (String args[]){
        animal obj = new dog(); //upcasting
        dog.method(obj);    
    }
}
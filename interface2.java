//Multiple inheritance is supported through interfaces but not through classes because in case of classes, there is chance of ambiguity between common method names among multiple classes however in interfaces, there exists only 1 common implementation of the methods with same name in multiple interfaces.

interface xyz{
    void print();//method 1
}

interface pqr{
    void print();   //method 2 same name
}

class create implements xyz,pqr{
    public void print(){            //only 1 implementation for both.
        System.out.println("Printing...");
    }
}

public class interface2 {
    public static void main (String args[]){
        create obj = new create();
        obj.print();
    }
}
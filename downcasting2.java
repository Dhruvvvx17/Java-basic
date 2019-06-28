//Understanding downcasting using instanceof

interface parent{}

class A implements parent{
    void disp(){
        System.out.println("From class A");
    }
}

class B implements parent{
    void disp(){
        System.out.println("From class B");
    }
}

class Call{
    static void invoke(parent p){       //static method doesnt require object to invoke
        if(p instanceof A){
            A a = (A)p;       //downcasting - a is now of type A , initially it was of type parent
            a.disp();
        }
        else if(p instanceof B){
            B b = (B) p; // downcasting - b is now of type B , initially it was of type parent
            b.disp();
        }
    }
}


public class downcasting2 {
    public static void main (String args[]){
        parent p1 = new A(); //upcasting
        Call.invoke(p1);
        parent p2 = new B(); //upcasting
        Call.invoke(p2);
    }
}
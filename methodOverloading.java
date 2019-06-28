//Method overloading - Same method name, different number or type of arguments

class compute{
    int sum(int a, int b){ return(a+b);}
    int sum(int a, int b, int c){ return(a+b+c);}
    //static int sum(int a, int b){ return(a+b);}               //alternate static implementation
    //static int sum(int a, int b, int c){ return(a+b+c);}
}

public class methodOverloading {
    public static void main (String args[]){
        compute obj1 = new compute();
        System.out.println(obj1.sum(5,10));  
        System.out.println(obj1.sum(5,10,6));
        // If methods are declared static, no need to create objects to call the class methods
        //System.out.println(compute.sum(5,10));  
        //System.out.println(compute.sum(5,10,6));  
    }   
}
//To understand working of instance initializer block in classes

class xyz{
    xyz(){
        System.out.println("In parent class");
    }
    //Non static IIB - compiler places this block after super(); which is the first line in the constructor. Hence the IIB is the 2nd line in the constructor followed by whatever the constructor might contain
    {
        System.out.println("Parent class instance initializer block");
    }
}

class pqr extends xyz{
   pqr(){
        System.out.println("In child class");       
    }
    {
        System.out.println("Child class instance initializer block");
    }

    void blank(){}      //blank method to remove "object not used warning"
}


public class instanceInitializer {
    public static void main (String args[]){
        pqr obj = new pqr();
        obj.blank();
    }
}
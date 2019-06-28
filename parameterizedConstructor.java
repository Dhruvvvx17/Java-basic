// To understand the concept of parameterized constructor

class student{
    int id;
    String name;

    student(int i,String n){    //constructor taking in parameters
        id = i;
        name = n;
    }

    void display(){
        System.out.println("Name: " + name + " Id: " + id);
    }
}

public class parameterizedConstructor {
    public static void main (String args[]){
        student s1 = new student(101,"Uday");
        student s2 = new student(281,"Dhruv");
        s1.display();
        s2.display();
    }
}
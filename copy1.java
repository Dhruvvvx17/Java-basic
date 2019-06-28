// Way to implement copy constructor - 1 using constructor overloading

class student{
    int id;
    String name;

    student(int i, String n){   //parametrized constructor
        id = i;
        name = n;
    }

    student(student s){         //parametrized constructor acting as copy constructor
        id = s.id;
        name = s.name;
    }

    void display() {
        System.out.println("Name: " + name + " Id: " + id);
    }
}

public class copy1 {
    public static void main (String args[]){
        student s1 = new student(281,"Dhruv");
        student s2 = new student(s1);           //object s1's properties copied to object s2
        s1.display();
        s2.display();
    }
}

//copy constructor is an inefficient way to clone an object however just for copying an objects current values its fine.
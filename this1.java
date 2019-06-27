//This refering to the current class instance variable.

class student{
    int id;
    String name;
    double gpa;

    student(int id,String name,double gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

    void display() {
        System.out.println("Name: " + name + " Id: " + id + " Gpa: " + gpa);
    }
}

public class this1 {
    public static void main (String args[]){
        student s1 = new student(281,"Dhruv",8.86);
        s1.display();
    }
}
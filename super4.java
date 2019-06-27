class person{
    int id;
    String name;
    person(int id,String name){
        this.id = id;
        this.name = name;
    }
}

class emp extends person{
    float salary;
    emp(int id, String name, float salary){
        super(id, name);
        this.salary = salary;
    }

    void display(){
        System.out.println("id: "+id + " name: " + name + " salary: "+ salary);
    }
}

public class super4 {
    public static void main (String args[]){
        emp e1 = new emp(281,"Dhruv",1000000);
        e1.display();
    }
}
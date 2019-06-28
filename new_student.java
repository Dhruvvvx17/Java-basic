//Example of a fully encapsulated java class
//Includes only private data members + setter and getter methods.

public class new_student{
    private String name;

    public String getName(){
        return name;
    }        
    public void setName(String name){
        this.name = name;
    }    
}

class test {
    public static void main(String args[]) {
        new_student s = new new_student();
        s.setName("Dhruv");
        System.out.println(s.getName());
    }
}
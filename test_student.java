//To understand the concepts of objects and classes

class student {
    int id;
    String name;
}

class test_student {
    public static void main (String args[]){
        student s1 = new student();
        student s2 = new student();
        s1.id = 281;
        s1.name = "Dhruv";
        s2.id = 104;
        s2.name = "Uday";
        System.out.println("Id: "+s1.id+" Name: "+s1.name);
        System.out.println("Id: "+s2.id+" Name: "+s2.name);
    }
}
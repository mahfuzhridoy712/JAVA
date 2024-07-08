//Constructor Overloading

public class students {
    String name;
    int id;
    float cgpa;
    String section;

    students(String n, int i, float cg) {
        name = n;
        id = i;
        cgpa = cg;
    }
    
    students(String n, int i, float cg, String s) {
        name = n;
        id = i;
        cgpa = cg;
        section = s;
    }

    void display() {
        System.out.println("Student name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("Student CGPA: " + cgpa);
        System.out.println("Student Section: " + section);

    }

    public static void main(String[] arg) {
        students obj1 = new students("Ron", 1001, 3.50f);
        students obj2 = new students("John", 2002 ,3.12f,"A");
        
        obj1.display();
        obj2.display();

    }

}

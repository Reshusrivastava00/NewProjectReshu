public class Student {
    int rollno;
    String name;
    String college = "ITS";

    Student(int r,String n)
    {
rollno = r;
name = n;
    }

    void display()
    {
        System.out.println(rollno+" "+name+" "+college);
    }

    public static void main(String[] args) {
        Student s1 = new Student(10, "Annu");
        Student s2 = new Student(20, "Reshu");

        s1.display();
        s2.display();
    }

}

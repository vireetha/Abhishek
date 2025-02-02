class Student
{
    int id;
    String name;
    float stipend;

    Student(){}
    Student(int id, String name){
        this.id = id;
        this.name = name;

    }
    Student(int id, String name, float stipend){
        this.id = id;
        this.name = name;
        this.stipend = stipend;
    }
    void display(){
        System.out.println(this.id + "| " + this.stipend);
    }
}
class main
{
    public static void main(String[] args)
    {
        Student s1 = new Student();
        Student s2 = new Student(45, "Hanusha");
        Student s3 = new Student(234, "Snigdha", 10000);
        s1.display();
        s2.display();
        s3.display();
    }
}
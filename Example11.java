class Student
{
    int id;
    String name;
    float marks;
}
class Example11
{
    public static void main(String args[])
    {
        Student s1=new Student();
        s1.id=24;
        s1.name="kiran";
        s1.marks=90.5f;
        System.out.println(s1);
        System.out.println(s1.id);
        System.out.println(s1.name);
        System.out.println(s1.marks);

    }
}
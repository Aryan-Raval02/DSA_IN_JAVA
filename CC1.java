import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CC1
{

    public static void main(String[] args) 
    {
        List<Student> list = new ArrayList<>();

        list.add(new Student(101, "Aryan", 90,20));
        list.add(new Student(120, "Neel", 80,21));
        list.add(new Student(34, "Akshay", 60,22));
        list.add(new Student(67, "Nayara", 45,23));
        list.add(new Student(203, "Shraddha", 80, 19));

        Collections.sort(list);

        for(Student s : list)
        {
            System.out.println(s.rollNo+" "+s.name+" "+s.marks+" "+s.age);
        }
    }
}
class Student implements Comparable<Student>
{
    int rollNo;
    String name;
    int marks;
    int age;

    public Student(int rollNo, String name, int marks, int age)
    {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.age = age;
    }

    @Override
    public int compareTo(Student s)
    {
        if(s.marks == this.marks)
        {
            return this.age - s.age;
        }
        return s.marks - this.marks;
    }
}
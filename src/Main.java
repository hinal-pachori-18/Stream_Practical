import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Student
{
    String name;
    int marks;
    Student(String name,int marks){
        this.name = name;
        this.marks = marks;
    }
}
public class Main {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(new Student("Kiva",78));
        studentList.add(new Student("Manishi",23));
        studentList.add(new Student("Dev",35));
        studentList.add(new Student("Kush",54));
        studentList.add(new Student("Mitansh",55));
        studentList.add(new Student("Ritvika",21));
        studentList.add(new Student("Kiean",77));
        studentList.add(new Student("Harsh",87));
        studentList.add(new Student("Archit",31));
        studentList.add(new Student("Shiv",33));

        List<String> passStudentname = studentList.stream().filter(s->s.marks>35).map(s->s.name).collect(Collectors.toList());
        System.out.println(passStudentname);
    }
}
import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    public static ArrayList<Student> arrStudents;
    //------------------------------------
    Student(String name, int age){
        setName(name);
        setAge(age);
    }
    //------------------------------------
    private void setName(String name) {
        this.name = name;
    }

    private void setAge(int age) {
        this.age = age;
    }
//------------------------------------
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

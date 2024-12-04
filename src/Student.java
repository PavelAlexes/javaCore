import java.util.ArrayList;

public class Student {

    private String name;
    private String sex;
    private int age;
    private int course;
    private double avgGrade;
    public static ArrayList<Student> arrStudents = new ArrayList<>();

    public Student(String name, int age, int course, String sex, double avgGrade) {
        setName(name);
        setAge(age);
        setCourse(course);
        setSex(sex);
        setAvgGrade(avgGrade);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", course=" + course +
                ", avgGrade=" + avgGrade +
                '}';
    }
    //set------------------------------------

    private void setName(String name) {
        this.name = name;
    }

    private void setSex(String sex) {
        this.sex = sex;
    }

    private void setAge(int age) {
        this.age = age;
    }

    private void setCourse(int course) {
        this.course = course;
    }

    private void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }


    //------------------------------------

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public int getCourse() {
        return course;
    }

    public double getAvgGrade() {
        return avgGrade;
    }


    //------------------------------------

}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("pasha", 20);
        Student student2 = new Student("masha", 19);
        Student student3 = new Student("sasha", 18);

        Student.arrStudents.add(student1);
        Student.arrStudents.add(student2);
        Student.arrStudents.add(student3);

        StudentsCheck studentsCheck = new StudentsCheck();

        studentsCheck.info(Student.arrStudents, (Student e) -> {return e.getAge()>18;});

    }

}
//13.02
import java.util.ArrayList;
public class Main implements Check{

    public static void main(String[] args) {

        Main main = new Main();

        Student student1 = new Student("pasha1", 20, 2, "M", 9.3);
        Student student2 = new Student("pasha2", 21, 3, "G", 4.3);
        Student student3 = new Student("pasha3", 22, 4, "G", 2.3);
        Student student4 = new Student("pasha4", 23, 5, "M", 6.3);
        Student student5 = new Student("pasha5", 24, 6, "G", 7.3);
        Student student6 = new Student("pasha6", 25, 7, "M", 8.3);
        Student student7 = new Student("pasha7", 26, 8, "G", 2.3);


        Student.arrStudents.add(student1);
        Student.arrStudents.add(student2);
        Student.arrStudents.add(student3);
        Student.arrStudents.add(student4);
        Student.arrStudents.add(student5);
        Student.arrStudents.add(student6);
        Student.arrStudents.add(student7);


        main.defGetStudent(Student.arrStudents, s -> s.getAge() > 23);


    }




    //methods ----------------------------------------------------------------------------------------

    public void defGetStudent(ArrayList<Student> students, Check check){
        for(Student student : students){
            if(check.getStudent(student)){
                System.out.println(student);
            }
        }
    }


//    public void defRepeat(String string, Repeat repeat) {
//        repeat.rep(string);
//    }
//
//
//    public void pokazatStudentov(ArrayList<Student> al, StudentCheck sc) {
//        for (Student s : al) {
//            if (sc.check(s)) {
//                System.out.println(s);
//            }
//        }
//    }


    //interfaces -----------------------------------------------------------------------------------------

    @Override
    public boolean getStudent(Student s) {
        return false;
    }


//    @FunctionalInterface
//    interface Repeat {
//        void rep(String s);
//    }
//
//    @FunctionalInterface
//    interface StudentCheck {
//        boolean check(Student s);
//
//        default void hi() {
//            System.out.println("hi");
//        }
//    }
}

// АНОНИМНЫЕ КЛАССЫ
//    public void printStudentOverGrade(ArrayList<Student> t){
//        for (Student s : t){
//            if(s.getAvgGrade() > 5) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    public void printStudentUnderAge(ArrayList<Student> t){
//        for (Student s : t){
//            System.out.println(s);
//        }
//    }
//
//    public void printStudentMixCondition(ArrayList<Student> t){
//        for (Student s : t){
//            System.out.println(s);
//        }
//    }




//class CheckOverGrade implements StudentCheck{
//    @Override
//    public boolean check(Student s) {
//        return s.getAvgGrade() > 5;
//    }
//}
//
//class ChecOverAge implements StudentCheck{
//    @Override
//    public boolean check(Student s) {
//        return s.getAge() > 22;
//    }
//}
//class ChecOverMix implements StudentCheck {
//    @Override
//    public boolean check(Student s) {
//        return s.getAge() > 22 && s.getAvgGrade() > 8 && s.getSex().equals("M");
//    }
//}


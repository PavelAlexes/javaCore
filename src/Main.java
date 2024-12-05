import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main{
//13.02
    public static void main(String[] args) {

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

        Main main = new Main();

//        main.pokazatStudentov(Student.arrStudents, new CheckOverGrade());
//        System.out.println("----------------------------------------------------------");
//        main.pokazatStudentov(Student.arrStudents, new ChecOverAge());
//        System.out.println("----------------------------------------------------------");
////        main.pokazatStudentov(Student.arrStudents, new ChecOverMix());
//        System.out.println("----------------------------------------------------------");
//        main.pokazatStudentov(Student.arrStudents, new StudentCheck() {
//            @Override
//            public boolean check(Student s) {
//                return s.getAge() > 22 && s.getAvgGrade() > 8 && s.getSex().equals("M");
//            }
//        });
        System.out.println("----------------------------------------------------------");
        main.pokazatStudentov(Student.arrStudents, s -> s.getAge() > 22 && s.getAvgGrade() > 8 && s.getSex().equals("M"));
        System.out.println("----------------------------------------------------------");
        main.pokazatStudentov(Student.arrStudents, t -> t.getAge() > 22);
        System.out.println("----------------------------------------------------------");



//        main.printStudentOverGrade(Student.arrStudents);
//        System.out.println("----------------------------------------");
//        main.printStudentUnderAge(Student.arrStudents);
//        System.out.println("----------------------------------------");
//        main.printStudentMixCondition(Student.arrStudents);
//        System.out.println("----------------------------------------");

        main.hello((String a) -> a.length());
    }


    public void hello(Hi def){
        def.hi("1234");
    };

    public void pokazatStudentov(ArrayList<Student> al, StudentCheck sc){
        for (Student s : al){
            if(sc.check(s)){
                System.out.println(s);
            }
        }
    }

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

}

//-----------------------------------------------------------------------------------------
class Test{

}

class CheckOverGrade implements StudentCheck{
    @Override
    public boolean check(Student s) {
        return s.getAvgGrade() > 5;
    }
}

class ChecOverAge implements StudentCheck{
    @Override
    public boolean check(Student s) {
        return s.getAge() > 22;
    }
}

//class ChecOverMix implements StudentCheck {
//    @Override
//    public boolean check(Student s) {
//        return s.getAge() > 22 && s.getAvgGrade() > 8 && s.getSex().equals("M");
//    }
//}

interface Hi{
    int hi(String s);
}

interface StudentCheck{
    boolean check(Student s);
    default void hi(){
        System.out.println("hi");
    }
}
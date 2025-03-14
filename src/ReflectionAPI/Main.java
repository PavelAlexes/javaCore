package ReflectionAPI;

import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.Annotation;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();

        Class aClass = Person.class;

        Method[] methods = aClass.getMethods();
        for (Method method : methods){
            System.out.print("| " + method.getName() + " | ");
        }

        System.out.println("\n");

        Field[] onlyPublicFields = aClass.getFields();
        for (Field field : onlyPublicFields){
            System.out.print("| " + field.getName() + " | ");
        }

        System.out.println("\n");

        Field[] privFields = aClass.getDeclaredFields();
        for (Field privField : privFields){
            System.out.print("| " + privField.getName() + " | ");
        }

        System.out.println("\n");
        // ???
        Annotation[] annotations = (Annotation[]) aClass.getAnnotations();
        for (Annotation annotation : annotations){
            if (annotation instanceof MethodInfo){
                System.out.println("Yas");
            }
        }
    }



}

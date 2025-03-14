package ReflectionAPI;

public class Person {

    public String name;
    private int age;

    @MethodInfo(author = "Pavel", dataOfCreating = 3142025)
    public String getName() {
        return name;
    }

    @MethodInfo(author = "Pavel", dataOfCreating = 3142025)
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

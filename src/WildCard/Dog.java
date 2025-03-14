package WildCard;

public class Dog extends Animal{

    public Dog(Integer id) {
        super(id);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "id='" + id + '\'' +
                '}';
    }
}

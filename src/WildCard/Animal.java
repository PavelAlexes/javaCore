package WildCard;

public class Animal {
    protected Integer id;

    public Animal(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                '}';
    }
}

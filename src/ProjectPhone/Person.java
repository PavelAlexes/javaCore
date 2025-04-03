package ProjectPhone;

public class Person {
    private String name;
    private Phone phone;

    // constructors //

    public Person(String name) {
        setName(name);
    }

    public Person(String name, Phone phone) {
        this(name);
        setPhone(phone);
    }

    // set and get //

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    // methods //

    public void buyPhone(Phone phone) {
        this.phone = phone;
    }
}

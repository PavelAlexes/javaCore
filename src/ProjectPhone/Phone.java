package ProjectPhone;

public class Phone {
    private String model;
    private String number;


    public Phone() {
    }

    // constructors //

    public Phone(String number) {
        setNumber(number);
    }

    public Phone(String number, String model) {
        this(number);
        setModel(model);
    }

    // set and get //

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


    // methods //

    public String receiveCall(Person person) {
        return "A call from " + person.getName();
    }

    public String getNumber(Person person) {
        try {
            return "Number: " + person.getPhone().getNumber();
        }catch (Exception e) {
            System.out.println("This person does not have a phone!");
        }
        return null;
    }

    @Override
    public String toString() {
        return STR."model = \{model}', number ='\{number}'";
    }
}

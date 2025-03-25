package ProjectPhone;

public class Phone {
    private String model;
    private String number;
    private String weight;

    public Phone() {
    }

    public Phone(String number) {
        setNumber(number);
    }

    public Phone(String number, String model) {
        this(number);
        setModel(model);
    }

    public Phone(String number, String model, String weight) {
        this(number, model);
        setWeight(weight);
    }

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

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }
}

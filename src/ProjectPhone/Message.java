package ProjectPhone;

public class Message {
    private Person person;
    private String message;

    // constructors //

    public Message(Person person, String message) {
        setPerson(person);
        setMessage(message);
    }

    // set and get //

    public Person getPerson() {
        return person;
    }

    private void setPerson(Person person) {
        this.person = person;
    }

    public String getMessage() {
        return message;
    }

    private void setMessage(String message) {
        this.message = message;
    }
}

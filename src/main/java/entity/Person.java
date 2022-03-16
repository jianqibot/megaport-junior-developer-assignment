package entity;

public class Person {
    private final String firstName;
    private final String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static Person formPerson(String nameInfo) {
        String[] nameInfoSplit = nameInfo.split(",");
        return new Person(nameInfoSplit[0], nameInfoSplit[1].trim());
    }

    public static String formName(Person person) {
        return person.getFirstName() + "," + person.getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        Person person = new Person("Jan", "Kowalski", Sex.MALE);
        Person person1 = new Person("Maria", "Kowalska", Sex.FEMALE);

        System.out.println(person.getSurname() + " is a " + person.getSex().getReadableSex() + " from " + person.getSex().getAddress());
        System.out.println(person1.getSurname() + " is a " + person1.getSex().getReadableSex() + " from " + person1.getSex().getAddress());

        Stream.of(Sex.values()).forEach(System.out::println);
        System.out.println(Sex.valueOf("MALE") == Sex.MALE);
        System.out.println(Sex.MALE.name());
    }

}

package InterfacesAndAbstraction.sayHello;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        persons.add(new Bulgarian("Ivan"));
        persons.add(new European("Peter"));
        persons.add(new Chinese("Jan Hoi"));

        for (Person person: persons) {
            print(person);
        }
    }

    public static void print (Person person){
        System.out.println(person.sayHello());
    }
}

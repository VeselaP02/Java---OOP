package InterfacesAndAbstraction_Exercies;

import InterfacesAndAbstraction_Exercies.person.Birthable;
import InterfacesAndAbstraction_Exercies.person.Citizen;
import InterfacesAndAbstraction_Exercies.person.Identifiable;
import InterfacesAndAbstraction_Exercies.person.Person;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Class[] citizen = Citizen.class.getInterfaces();

        if (Arrays.asList(citizen).contains(Identifiable.class)&& Arrays.asList(citizen).contains(Birthable.class)) {
            Method[] methods = Birthable.class.getDeclaredMethods();
            methods = Identifiable.class.getDeclaredMethods();

            Scanner scanner = new Scanner(System.in);

            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String id = scanner.nextLine();
            String birthDate = scanner.nextLine();

            Identifiable identifiable = new Citizen(name, age,id,birthDate);
            Birthable birthable = new Citizen(name,age,id,birthDate);

            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());
        }
    }
}

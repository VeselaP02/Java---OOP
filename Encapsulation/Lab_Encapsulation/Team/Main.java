package Lab_Encapsulation.Team;

import Lab_Encapsulation.Person;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Team team = new Team("Black Eagles");
        while (n-- > 0){
            
            String [] input = scanner.nextLine().split("\\s+");

            String firstName = input[0];
            String lastName = input[1];
            int age = Integer.parseInt(input[2]);
            double salary = Double.parseDouble(input[3]);

            Person person = new Person(firstName, lastName, age, salary);
            team.addPlayer(person);
        }
        System.out.printf("First team have %d players%n",team.getFirstTeam().size());
        System.out.printf("Reserve team have %d players%n",team.getReserveTeam().size());
    }
}

package InterfacesAndAbstraction_Exercies.birthdayCelebration;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        List<Birthable> birthableList = new ArrayList<>();

        while (!input.equals("End")){
            String [] tokens = input.split(" ");
            String objectType = tokens[0];

            switch (objectType){
                case "Citizen":
                    String citizenName = tokens[1];
                    int age= Integer.parseInt(tokens[2]);
                    String idCitizen = tokens[3];
                    String birthDateCitizen = tokens[4];

                    Birthable citizen = new Citizen(citizenName,age,idCitizen,birthDateCitizen);
                    birthableList.add(citizen);
                    break;
                case "Pet":
                    String namePet = tokens[1];
                    String birthDatePet = tokens[2];

                    Birthable pet = new Pet(namePet,birthDatePet);
                    birthableList.add(pet);
                    break;
                case "Robot":
                    String model = tokens[1];
                    String idRobot = tokens[2];

                    Identifiable robot = new Robot(model,idRobot);
                    break;
            }


            input = scanner.nextLine();
        }

        String year = scanner.nextLine();

        boolean isFound = false;
        for (Birthable birthable: birthableList) {
            if (birthable.getBirthDate().endsWith(year)){
                isFound = true;
                System.out.println(birthable.getBirthDate());
            }
        }

        if (!isFound){
            System.out.println("< no output>");
        }
    }
}

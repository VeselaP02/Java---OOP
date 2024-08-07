package InterfacesAndAbstraction_Exercies.person;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Buyer> buyers = new ArrayList<>();

            String names = scanner.nextLine();

            while (!names.equals("End")){
                int getFood = 0;
                for (int i = 0; i < n ; i++) {
                    String [] input = scanner.nextLine().split(" ");

                    if (input.length == 4){
                        String nameCitizen = input[0];
                        int age = Integer.parseInt(input[1]);
                        String id = input[2];
                        String birthDate = input[3];

                        Citizen citizen = new Citizen(nameCitizen,age,id,birthDate);
                        getFood = citizen.getFood();

                        buyers.add(citizen);

                    } else if (input.length ==3) {
                        String nameRebel = input[0];
                        int age = Integer.parseInt(input[1]);
                        String group = input[2];

                        Rebel rebel = new Rebel(nameRebel,age,group);
                        buyers.add(rebel);

                    }

                names = scanner.nextLine();
            }

        }
    }
}

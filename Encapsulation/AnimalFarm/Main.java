package AnimalFarm;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());


        try {
            Chicken chicken = new Chicken(age,name);
            System.out.println(chicken);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

    }
}
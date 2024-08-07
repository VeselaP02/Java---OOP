package Exercises_Encapsulation.ClassBox;

import Exercises_Encapsulation.ClassBox.Box;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        try {
            Box box = new Box(length,width,height);
            System.out.printf("Surface Area - %.2f%n",box.Surface_Area());
            System.out.printf("Lateral Surface Area - %.2f%n",box.lateralSurface_Area());
            System.out.printf("Volume - %.2f%n",box.volume());
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }


    }
}

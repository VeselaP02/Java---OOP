package Abstractions.Point_In_Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] coordinates = readArray(scanner);

        Point pointA = new Point(coordinates[0], coordinates[1]);
        Point pointC = new Point(coordinates[2],coordinates[3]);

        Rectangle rectangle = new Rectangle(pointA,pointC);

        int command = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= command ; i++) {
            int [] tokens = readArray(scanner);

            Point p = new Point(tokens[0],tokens[1]);

            boolean isInside = rectangle.isInside(p);
            System.out.println(isInside);
        }
    }
    private static int [] readArray (Scanner scanner){
        return Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
    }
}

package Aabstarction.Exercises.JediGalaxy.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = readArray(scanner.nextLine());
        int rows = dimensions[0];
            int cols = dimensions[1];

            Field field = new Field(rows,cols);
        Galaxy galaxy = new Galaxy(field);

        String command = scanner.nextLine();

            long starCollected = 0;
            while (!command.equals("Let the Force be with you")) {
                int[] jediPositions = readArray(command);
                int[] evilPositions = readArray(scanner.nextLine());

                int evilRow = evilPositions[0];
                int evilCol = evilPositions[1];

                galaxy.moveEvil(evilRow,evilCol);


                int rowIvo = jediPositions[0];
                int colIvo = jediPositions[1];

                starCollected = galaxy.moveJedi(rowIvo,colIvo);

                command = scanner.nextLine();
            }

        System.out.println(starCollected);


    }
    private static int[] readArray(String command) {
        int[] dimensions = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
        return dimensions;
    }


}

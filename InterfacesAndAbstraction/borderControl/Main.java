package InterfacesAndAbstraction.borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String line = scanner.nextLine();

        List<Identifiable> identifiables = new ArrayList<>();

        while (!line.equals("End")){
            String [] linePart = line.split("\\s+");
            Identifiable identifiable = linePart.length == 2 ? new Robot(linePart[0],linePart[1]) :
            new Citizen(linePart[0],Integer.parseInt(linePart[1]),linePart[2]);

            identifiables.add(identifiable);


            line = scanner.nextLine();
        }

        String lastFakeDigits = scanner.nextLine();

       for (Identifiable identifiable: identifiables) {
            if (identifiable.getId().endsWith(lastFakeDigits)){
                System.out.println(identifiable.getId());
            }
        }
        //System.out.println(identifiables.stream().filter(i -> i.getId().endsWith(lastFakeDigits)).map(Identifiable::getId).collect(Collectors.joining(System.lineSeparator())));
    }
}

package Shopping_Spree;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String,Person> peopleInfo = new LinkedHashMap<>();
        Map<String,Product> productInfo = new HashMap<>();

        String [] people = scanner.nextLine().split(";");

        for (String element: people) {

            String [] personData = element.split("=");
            String name = personData[0];
            double money = Double.parseDouble(personData[1]);

            try {
                Person person = new Person(name,money);
                peopleInfo.put(name,person);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());

                return;
            }

        }

        String [] products = scanner.nextLine().split(";");

        for (String element: products) {
            String [] productsData  = element.split("=");

            String name = productsData[0];
            double cost = Double.parseDouble(productsData[1]);

            try {
                Product product = new Product(name,cost);
                productInfo.put(name,product);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());

                return;
            }

        }

        String command = scanner.nextLine();

        while (!command.equals("END")){
            String [] commandPart = command.split("\\s+");

            String personName = commandPart[0];
            String productName = commandPart[1];

            try {
                Person person = peopleInfo.get(personName);
                Product product = productInfo.get(productName);

                person.buyProduct(product);
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }

            command = scanner.nextLine();
        }

        for (Person person: peopleInfo.values()) {
            System.out.print(person.getName() + " - ");

            if (person.getProducts().isEmpty()) {
                System.out.println("Nothing bought");
            } else {
                System.out.println(person.getProducts().stream().map(Product::getName).collect(Collectors.joining(", ")));
            }
        }
    }
}

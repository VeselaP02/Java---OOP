package Exercise_Inheritance.animal;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String animalType = scanner.nextLine();

        while (!animalType.equals("Beast!")){
            String [] animalInfo = scanner.nextLine().split(" ");
            String animalName = animalInfo[0];
            int animalAge = Integer.parseInt(animalInfo[1]);
            String animalGender = animalInfo[2];
            try {
                switch (animalType){
                    case "Dog":
                        Dog dog = new Dog(animalName,animalAge,animalGender);
                        System.out.println(dog);
                        break;
                    case "Frog":
                        Frog frog = new Frog(animalName,animalAge,animalGender);
                        System.out.println(frog);
                        break;
                    case "Cat":
                        Cat cat = new Cat(animalName,animalAge,animalGender);
                        System.out.println(cat);
                        break;
                    case "Kitten":
                        Kitten kitten = new Kitten(animalName,animalAge,animalGender);
                        System.out.println(kitten);
                        break;
                    case "Tomcat":
                        Tomcat tomcat = new Tomcat(animalName,animalAge,animalGender);
                        System.out.println(tomcat);
                        break;
                }
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
            animalType = scanner.nextLine();
        }
    }
}

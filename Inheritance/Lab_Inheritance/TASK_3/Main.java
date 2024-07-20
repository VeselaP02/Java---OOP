package Lab_Inheritance.TASK_3;

public class Main {
    public static void main(String[] args) {

    RandomArrayList<Integer> randomArrayList = new RandomArrayList<>();

        for (int i = 1; i <= 19 ; i++) {
            randomArrayList.add(i);
        }
        System.out.println(randomArrayList.getRandomElement());
}
}

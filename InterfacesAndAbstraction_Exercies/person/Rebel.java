package InterfacesAndAbstraction_Exercies.person;

public class Rebel implements Buyer{
    private String name;
    private int age;
    private String group;
    private int food;

    public Rebel(String name, int age, String group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public void buyFood() {
       food += 5;

    }

    @Override
    public int getFood() {
        return 0;
    }
}

package Exercise_Inheritance.animal;

public class Tomcat extends Cat{

    private static final String GENDER = "Male";

    public Tomcat(String name, int age, String gender) {
        super(name, age, GENDER);
    }

    @Override
    public String produceSound(){
        return "MEOW";
    }
}
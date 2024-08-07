package AnimalFarm;

public class Chicken {
    private int age;
    private String name;

    public int getAge() {
        return age;
    }


    public Chicken(int age, String name) {
        this.setAge(age);
        this.setName(name);
    }

    private void setAge(int age) {
        if (age < 0 || age >15){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private double calculateProductPerDay(){
        if (this.age <=5){
         return 2;
        } else if (this.age <= 11) {
           return 1;
        } else {
            return 0.75;
        }
    }

    public double productPerDay (){
        return calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken Mara (age %d) can produce %.0f eggs per day.%n",this.age,this.productPerDay());
    }
}

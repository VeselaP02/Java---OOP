package Lab_Encapsulation;

import java.text.DecimalFormat;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;


    public Person(String firstName, String lastName, int age,double salary) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setAge(age);
        this.setSalary(salary);
    }


    public String getFirstName() {
        return firstName;
    }


    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        printName(firstName,"First");
        this.firstName = firstName;
    }

    public String getLastName() {
       return lastName;
    }

    public void setLastName(String lastName) {
        printName(lastName,"Last");
        this.lastName = lastName;
    }

    public void setAge(int age) {
        if (age <=0 ){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 460){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public void increaseSalary(double bonus){
        if (age < 30){
            bonus = bonus/2;
        }
      setSalary(getSalary() + (getSalary() * (bonus/100)));
    }

    @Override
    public String toString() {
        DecimalFormat decimalFormat = new DecimalFormat("##.0###");
        return String.format("%s %s gets %s leva", this.firstName, this.lastName, decimalFormat.format(this.salary));
    }
    private void printName (String name, String string){
        if (name.length() < 3){
            throw new IllegalArgumentException( string + " name cannot be less than 3 symbols");
        }
    }
}

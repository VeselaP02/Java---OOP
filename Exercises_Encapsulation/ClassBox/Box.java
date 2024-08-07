package Exercises_Encapsulation.ClassBox;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        validationSize(length,"Length");
        this.length = length;
    }

    private void setWidth(double width) {
        validationSize(width,"Width");
        this.width = width;
    }

    public void setHeight(double height) {
        validationSize(height,"Height");
        this.height = height;
    }

    public double Surface_Area (){
        return 2* this.length* this.width + 2*this.length*this.height + 2*this.width*this.height;
    }
    public double lateralSurface_Area(){
        return  2*this.length*this.height + 2*this.width*this.height;
    }

    public double volume (){
        return this.length*this.width*this.height;
    }

    private void validationSize (double parameter,String typeSize){
        if (parameter <= 0){
            throw new IllegalArgumentException(typeSize + " cannot be zero or negative.");
        }
    }
}

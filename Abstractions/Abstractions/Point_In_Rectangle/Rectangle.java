package Abstractions.Point_In_Rectangle;

public class Rectangle {
    private final Point pointA;
    private final  Point pointC;

    public Rectangle(Point pointA, Point pointC) {
        this.pointA = pointA;
        this.pointC = pointC;
    }

    public boolean isInside(Point p){
        return p.isGraterThan(pointA) && p.isLessThan(pointC);
    }
}

package Abstractions.Point_In_Rectangle;

public class Point {
    private final int x;
    private  final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean isGraterThan(Point p){
        return  this.x >= p.x && this.y >= p.y;
    }
    public boolean isLessThan(Point p){
        return this.x <= p.x && this.y <= p.y;
    }

}

package by.overone.lesson8;

/**
 * @author Karina Narbutovich
 */
public class Point {
    private int x, y;
    public double distance;


    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double Distance() {
        return Math.sqrt(x * x + y * y);
    }

    public static void main(String[] args) {
        Point point1 = new Point();
       point1.setX(12);
       point1.setY(6);
        double dist;
        dist=point1.Distance();
        System.out.println("x-coordinate: "+point1.getX()+"\ny-coordinate: "+point1.getY()+"\ndistance: "+dist);
    }

}

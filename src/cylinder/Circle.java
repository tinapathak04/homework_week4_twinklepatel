package cylinder;

public class Circle {
     double radius;

    public Circle() {
        this.radius =3.75;
    }
    public double getRadius() {
        return radius;
    }
    public double getArea() {
        return radius*radius*Math.PI;
    }
}

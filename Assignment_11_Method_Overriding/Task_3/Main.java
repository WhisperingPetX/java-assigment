class Shape {
    int area() { return 0; }
}
class Square extends Shape {
    int side;
    @Override int area() { return side * side; }
}
public class Main {
    public static void main(String[] args) {
        Shape shape = new Square();
        ((Square) shape).side = 3;
        System.out.println("Area: " + shape.area());
    }
}

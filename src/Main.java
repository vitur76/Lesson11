
class Polygon {
    public void render() {
        System.out.println("Polygon.");
    }
}

class Square extends Polygon {
    @Override
    public void render() {
        System.out.println("Square.");
    }
}
class Circle extends Polygon {
    @Override
    public void render() {
        System.out.println("Circle.");
    }
}


public class Main {
    public static void main(String[] args) {
        Polygon polygon = new Polygon();
        polygon.render();

        Square square1 = new Square();
        square1.render();

        Circle circle1 = new Circle();
        circle1.render();

        Polygon square2 = new Square();
        square2.render();

        Polygon circle2 = new Circle();
        circle2.render();
    }
}

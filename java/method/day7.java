// Exercise6
class Rectangle {
    int length, breadth;

    // setter
    public void setLength(int length) {
        this.length = length;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    // Getter
    public int getLength() {
        return this.length;
    }

    public int getBreadth() {
        return this.breadth;
    }

    public int area() {
        return this.length * this.breadth;
    }

}

class Square {
    int size;

    public void setSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return this.size;
    }

    public int SquareArea() {
        return this.size * this.size;
    }
}

class Circle {
    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double area() {
        return Math.PI * (this.radius * this.radius);
    }
}

class Cylinder extends Circle {
    double height, radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public double volumeCylinder() {
        return Math.PI * (this.radius * this.radius) * this.height;
    }

}

class Sphere extends Circle {
    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public double Spherearea() {
        return 4 * Math.PI * (this.radius * this.radius);
    }
}

public class day7 {
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.setRadius(12);
        System.out.println(c1.getRadius());
        System.out.println(c1.area());


        Square sq=new Square();
        sq.setSize(4);
        System.out.println(sq.getSize());
        System.out.println(sq.SquareArea());

        Cylinder cy=new Cylinder();
        cy.setHeight(12.2);
        cy.setRadius(10.3);
        System.out.println(cy.getRadius());
        System.out.println(cy.getHeight());
        System.out.println(cy.volumeCylinder());

        Sphere sp =new Sphere();
        sp.setRadius(6.2);
        System.out.println(sp.getRadius());
        System.out.println(sp.Spherearea());
    }
}

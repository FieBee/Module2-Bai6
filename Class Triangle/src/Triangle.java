public class Triangle {
    private double side1;
    private double side2;
    private double side3;
    private double ch;

    public Triangle(){}

    public Triangle(double side1, double side2, double side3, double ch) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        this.ch = ch;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public double getCh() {
        return ch;
    }

    public void setCh(double ch) {
        this.ch = ch;
    }

    public double getPerimeter(){
        return this.side1 + this.side2 + this.side3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                ", ch=" + ch +
                ", perimeter ="+ getPerimeter() +
                '}';
    }
}

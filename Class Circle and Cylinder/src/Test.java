public class Test {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        Circle circle2 = new Circle(4,"red");
        System.out.println(circle2);

        Cylinder cylinder1 = new Cylinder(4,"blue");
        System.out.println(cylinder1);

        Cylinder cylinder2 = new Cylinder();
        System.out.println(cylinder2);

        Cylinder cylinder3 = new Cylinder(4,"red",10);
        System.out.println(cylinder3);
    }
}

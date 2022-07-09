public class Test {
    public static void main(String[] args) {

        Point p1 = new Point();
        System.out.println(p1);

        Point p2 = new Point(2,3);
        System.out.println(p2);


        MoveablePoint m1 = new MoveablePoint();
        System.out.println(m1);

        MoveablePoint m2 = new MoveablePoint(3,4);
        System.out.println(m2);

        MoveablePoint m3 = new MoveablePoint(1,2,3,4);
        System.out.println(m3);

        m2.move();
        m3.move();

        System.out.println(m2);
        System.out.println(m3);
    }
}
